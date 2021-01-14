package com.example.AssetManage.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "asset_employee")
public class AssetEmployeeEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ID of Asset
	 */
	@Id
	@ManyToOne
	@JoinColumn(name = "asset_id")
	private AssetEntity assetID;
	/**
	 * ID of employee
	 */
	@Id
	@ManyToOne
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
	/**
	 * delete by User
	 */
	@Column(name = "is_delete", columnDefinition = "boolean default false")
	private boolean isDelete;

	/**
	 * Create by User
	 */
	@CreatedBy
	@Column(name = "create_by", nullable = false)
	private int createBy;

	/**
	 * Last modified by User
	 */
	@LastModifiedBy
	@Column(name = "update_by", nullable = false)
	private int updateBy;

	/**
	 * Date create
	 */
	@CreatedDate
	@Column(name = "create_date", nullable = false)
	private Date createDate;

	/**
	 * Last Modified Date
	 */
	@LastModifiedDate
	@Column(name = "update_date", nullable = false)
	private Date updateDate;

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

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	public int getCreateBy() {
		return createBy;
	}

	public void setCreateBy(int createBy) {
		this.createBy = createBy;
	}

	public int getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(int updateBy) {
		this.updateBy = updateBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	

}
