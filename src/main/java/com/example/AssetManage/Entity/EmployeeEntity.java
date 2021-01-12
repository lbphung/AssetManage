package com.example.AssetManage.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name="employee")
public class EmployeeEntity {

	/**
	 * ID of employee
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Long employeeID;
	/**
	 * Code of employee
	 */
	@Column(name = "employee_code")
	private String employeeCode;
	/**
	 * Name of employee
	 */
	@Column(name = "employee_name")
	private String employeeName;
	

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
	
	public EmployeeEntity() {
		
			}

	public Long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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
