package com.ahs.queueconfigurationapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;



@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@Builder

@Entity

@Table (name="paragonqueues")
public class ParagonQueue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(name ="queue_uuid",nullable = false)
	private final UUID queue_uuid = UUID.randomUUID(); 
	
	@Column(name ="queue_name",nullable = false)
	private String queueid;
	
	@Column(name ="queue_program_name",nullable = false)
	private String programassoc;
	
	@Column(name ="queue_subprogram_name",nullable = false)
	private String subprogramassoc;
	
	@Column(name = "tenant_name", nullable = false)
	private String tenantName;
	
	@Column(name = "tenant", nullable = false)
	private int tenantId;
	
	@Column(name = "marketplace_id", nullable = false)
	private int marketPlaceId;
	
	//Realm of queue configuration
	@Column(name ="queue_region",nullable = false)
	private String queueregion;
	
	@Column(name = "autocalling_status", nullable = false)
	private boolean autoCallingStatus;
	//private AutoCallerDAO autoCallingconfig; 
	
	@Column(name = "autocalling_configs", nullable = false)
	private String autoCallerConfigs;	
	
	
//
//	//c2c id where a call will be triggered	
//	@Column(name ="c2cid",nullable = true)
//	private String c2cid;
//	
//	// Country of origins mapped to c2cid
//	@Column(name ="atc_origin_coo",nullable = true)
//	private List<String> originCountries;
//	
//	// Country of origins mapped to c2cid
//	@Column(name ="atc_language_list",nullable = true)
//	private List<String> languageSupport;
//		
//	//status of auto calling integration
//	@Column(name ="auto_calling_status",nullable = true)
//	private boolean autoCallingEnabled;
//	
//	//Reason for calling EX: Imminent, PreEnforcement
//	@Column(name ="auto_calling_intent",nullable = true)
//	private String callingIntent;
//	
//	//Real of c2c configuration
//	@Column(name ="auto_calling_region",nullable = true)
//	private String region;

}
