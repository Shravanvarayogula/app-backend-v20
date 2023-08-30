package com.ahs.queueconfigurationapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahs.queueconfigurationapp.entity.ParagonQueue;
import com.ahs.queueconfigurationapp.repository.QueueRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public class QueueConfigController {
	
	@Autowired
	private QueueRepository queuerepository;
	
	@GetMapping("/queue-list")
	public List<ParagonQueue> fetchQueues(){
		return queuerepository.findAll();
	}
	
	@GetMapping("/queue-list/{id}")
	public ParagonQueue getQueueById(Long id) {
		return queuerepository.getReferenceById(id);
		
	}
	@PostMapping
	public ParagonQueue updateQueueById(Long id) {
		ParagonQueue pq = queuerepository.getReferenceById(id);
		return pq;
	}
	
	// @GetMapping("/queue")
//	public ParagonQueue fetchByQueueName(String qname) {
//		return queuerepository.
	
//	@PostMapping("/update-config")
//	
//	public ParagonQueue saveConfig() {
//		ParagonQueue newQueue = 
//					
//		return updateQueue;
//		
//	}
	
	
//	}
	
	}
