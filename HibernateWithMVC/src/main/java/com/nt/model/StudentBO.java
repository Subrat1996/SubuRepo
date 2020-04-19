package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "std_tab")
@Data
public class StudentBO {

	@Id
	@Column(name = "sid")
	private Integer studentid;
	private String sname;
	private String clg;
	private String address;
}
