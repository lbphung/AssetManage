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
@Table(name = "asset_employee")
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

	public AssetEmployeeEntity() {
	}

	public AssetEntity getAssetID() {
		return assetID;
	}

	public void setAssetID(AssetEntity assetID) {
		this.assetID = assetID;
	}

	public EmployeeEntity getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(EmployeeEntity employeeID) {
		this.employeeID = employeeID;
	}

	public String getAssetEmployeeName() {
		return assetEmployeeName;
	}

	public void setAssetEmployeeName(String assetEmployeeName) {
		this.assetEmployeeName = assetEmployeeName;
	}

	public Date getAssetEmployeDateRange() {
		return assetEmployeDateRange;
	}

	public void setAssetEmployeDateRange(Date assetEmployeDateRange) {
		this.assetEmployeDateRange = assetEmployeDateRange;
	}

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
