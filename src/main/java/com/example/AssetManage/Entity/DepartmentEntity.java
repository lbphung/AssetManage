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
@Table(name="department")
public class DepartmentEntity {
	/**
	 * ID of department
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "department_id")
	private Long departmentID;
	/**
	 * Name of department
	 */
	@Column(name = "department_name")
	private String departmentName;
	
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
	
	public DepartmentEntity() {}

	public Long getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Long departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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
