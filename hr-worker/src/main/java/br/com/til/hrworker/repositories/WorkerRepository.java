package br.com.til.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.til.hrworker.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
