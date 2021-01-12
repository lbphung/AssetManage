package com.example.AssetManage.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="asset_employee")
public class AssetEmployeeEntity {
	/**
	 * ID of Asset
	 */
	@Id	
	@JoinColumn(name = "asset_id")
	private AssetEntity assetID;
	/**
	 * ID of employee
	 */
	@Id	
	@JoinColumn(name = "employee_id")
	private EmployeeEntity employeeID;
	/**
	 * amount of assetEmployee
	 */
	@Column(name = "asset_employee_amount")
	private String assetEmployeeName;
	/**
	 * amount of assetEmployee
	 */
	@Column(name = "asset_employee_daterange")
	private Date assetEmployeDateRange;
}
