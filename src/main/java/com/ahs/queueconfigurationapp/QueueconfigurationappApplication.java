package com.ahs.queueconfigurationapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ahs.queueconfigurationapp.entity.ParagonQueue;
import com.ahs.queueconfigurationapp.repository.QueueRepository;

@SpringBootApplication
public class QueueconfigurationappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(QueueconfigurationappApplication.class, args);
	}

	@Autowired
	private QueueRepository queuerepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Applicated Started");
		ParagonQueue test_queue1 = ParagonQueue.builder()
								.queueid("ahs-test@amazon.com")
								.tenantId(178)
								.marketPlaceId(1)
								.queueregion("NA")
								.tenantName("TRMS")
								.programassoc("Pre-Enforcement")
								.subprogramassoc("OP")
								.autoCallerConfigs("None")
								.autoCallingStatus(true)
								.build();
		
		ParagonQueue test_queue2 = ParagonQueue.builder()
				.queueid("ahs-test-two@amazon.com")
				.tenantId(178)
				.marketPlaceId(1)
				.queueregion("NA")
				.tenantName("TRMS")
				.programassoc("KYC")
				.subprogramassoc("Education")
				.autoCallerConfigs("None")
				.autoCallingStatus(false)
				.build();
		
		ParagonQueue test_queue3 = ParagonQueue.builder()
				.queueid("ahs-test-three@amazon.com")
				.tenantId(178)
				.marketPlaceId(1)
				.queueregion("NA")
				.tenantName("TRMS")
				.programassoc("PECM")
				.subprogramassoc("VAT")
				.autoCallingStatus(false)
				.autoCallerConfigs("None")
				.build();
		
		
		queuerepository.save(test_queue1);
		queuerepository.save(test_queue2);
		queuerepository.save(test_queue3);

		
	}
}
