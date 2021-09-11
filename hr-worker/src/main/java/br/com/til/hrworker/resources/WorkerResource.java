package br.com.til.hrworker.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.til.hrworker.entity.Worker;
import br.com.til.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value="/workers")
public class WorkerResource {

	@Autowired
	private WorkerRepository workerRepo;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		
		List<Worker> workers = workerRepo.findAll();
		
		return ResponseEntity.ok(workers);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		
		Worker worker = workerRepo.findById(id).get();
		
		return ResponseEntity.ok(worker);
	}
}
