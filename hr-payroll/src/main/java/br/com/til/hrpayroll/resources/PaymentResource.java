package br.com.til.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.til.hrpayroll.domain.Payment;
import br.com.til.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value="/payments")
public class PaymentResource {

	@Autowired
	private PaymentService paymentService;

	@HystrixCommand(fallbackMethod="getPaymentFallBackAlternative")
	@GetMapping(value="/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable() Long workerId,@PathVariable Integer days) {

		Payment payment = paymentService.getPayment(workerId, days);

		return ResponseEntity.ok(payment);
	}

	public ResponseEntity<Payment> getPaymentFallBackAlternative(Long workerId, Integer days) {

		Payment payment = new Payment("Naruto", 250.0, days);

		return ResponseEntity.ok(payment);
	}

}
