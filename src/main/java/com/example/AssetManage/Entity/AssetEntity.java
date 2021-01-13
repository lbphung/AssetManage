package com.example.AssetManage.Entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;



@Entity
@Table(name = "asset")
public class AssetEntity {
	/**
	 * ID of Asset
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asset_id")
	private Long assetID;
	/**
	 * Code of Asset
	 */
	@Column(name = "asset_code")
	private String assetCode;

	/**
	 * Name of Asset
	 */
	@Column(name = "asset_name")
	private String assetName;
	/**
	 * Price of Asset
	 */
	@Column(name = "asset_price")
	private String assetPrice;
	/**
	 * DayExp of Asset
	 */
	@Column(name = "asset_dayexp")
	private Date assetDayExp;
	/**
	 * id of AssetType
	 */
	@ManyToOne
	@JoinColumn(name = "asset_type_id")
	private AssetTypeEntity assetType; 

	/**
     * List Asset Employee
     */
    @OneToMany(mappedBy = "assetID", cascade = CascadeType.ALL)
    private List<AssetEmployeeEntity> listAssetEmploy;
	/**
	 * Flag delete
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

	public AssetEntity() {
	}
	public List<AssetEmployeeEntity> getListAssetEmploy() {
		return listAssetEmploy;
	}

	public void setListAssetEmploy(List<AssetEmployeeEntity> listAssetEmploy) {
		this.listAssetEmploy = listAssetEmploy;
	}
	public Long getAssetID() {
		return assetID;
	}

	public void setAssetID(Long assetID) {
		this.assetID = assetID;
	}

	public String getAssetCode() {
		return assetCode;
	}

	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetPrice() {
		return assetPrice;
	}

	public void setAssetPrice(String assetPrice) {
		this.assetPrice = assetPrice;
	}

	public Date getAssetDayExp() {
		return assetDayExp;
	}

	public void setAssetDayExp(Date assetDayExp) {
		this.assetDayExp = assetDayExp;
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

	public AssetTypeEntity getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetTypeEntity assetType) {
		this.assetType = assetType;
	}

}
