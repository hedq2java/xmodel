package com.landray.kmss.fs.expense.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.landray.kmss.sys.organization.model.SysOrgPerson;
import com.landray.kmss.common.model.BaseModel;
import com.landray.kmss.common.convertor.ModelToFormPropertyMap;
import com.landray.kmss.common.convertor.ModelConvertor_ModelListToString;
import com.landray.kmss.common.convertor.ModelConvertor_ModelListToFormList;

import com.landray.kmss.fs.expense.model.FsExpenseMainHang;
import com.landray.kmss.fs.expense.model.FsExpenseMain;
import com.landray.kmss.sys.organization.model.SysOrgElement;

import com.landray.kmss.fs.expense.forms.FsExpenseMainForm;
import com.landray.kmss.fs.expense.forms.FsExpenseMainHangForm;
import com.landray.kmss.sys.organization.forms.SysOrgElementForm;



/**
 * 冲销挂账金额日志
 * 
 * @author hedq
 * @version 1.0 2017-10-24
 */
public class FsExpenseMainHang  extends BaseModel {

	/**
	 * 名称
	 */
	private String fdName;
	
	/**
	 * @return 名称
	 */
	public String getFdName() {
		return this.fdName;
	}
	
	/**
	 * @param fdName 名称
	 */
	public void setFdName(String fdName) {
		this.fdName = fdName;
	}
	
	/**
	 * 冲销金额
	 */
	private String fdOffsetMoney;
	
	/**
	 * @return 冲销金额
	 */
	public String getFdOffsetMoney() {
		return this.fdOffsetMoney;
	}
	
	/**
	 * @param fdOffsetMoney 冲销金额
	 */
	public void setFdOffsetMoney(String fdOffsetMoney) {
		this.fdOffsetMoney = fdOffsetMoney;
	}
	
	/**
	 * 剩余金额
	 */
	private String fdOverplusMoney;
	
	/**
	 * @return 剩余金额
	 */
	public String getFdOverplusMoney() {
		return this.fdOverplusMoney;
	}
	
	/**
	 * @param fdOverplusMoney 剩余金额
	 */
	public void setFdOverplusMoney(String fdOverplusMoney) {
		this.fdOverplusMoney = fdOverplusMoney;
	}
	
	/**
	 * 创建时间
	 */
	private Date docCreateTime;
	
	/**
	 * @return 创建时间
	 */
	public Date getDocCreateTime() {
		return this.docCreateTime;
	}
	
	/**
	 * @param docCreateTime 创建时间
	 */
	public void setDocCreateTime(Date docCreateTime) {
		this.docCreateTime = docCreateTime;
	}
	
	/**
	 * 文档状态
	 */
	private String docStatus;
	
	/**
	 * @return 文档状态
	 */
	public String getDocStatus() {
		return this.docStatus;
	}
	
	/**
	 * @param docStatus 文档状态
	 */
	public void setDocStatus(String docStatus) {
		this.docStatus = docStatus;
	}
	
	/**
	 * 挂账报销单
	 */
	private FsExpenseMain fdHangExpense;
	
	/**
	 * @return 挂账报销单
	 */
	public FsExpenseMain getFdHangExpense() {
		return this.fdHangExpense;
	}
	
	/**
	 * @param fdHangExpense 挂账报销单
	 */
	public void setFdHangExpense(FsExpenseMain fdHangExpense) {
		this.fdHangExpense = fdHangExpense;
	}
	
	/**
	 * 冲销报销单
	 */
	private FsExpenseMain fdOffsetExpense;
	
	/**
	 * @return 冲销报销单
	 */
	public FsExpenseMain getFdOffsetExpense() {
		return this.fdOffsetExpense;
	}
	
	/**
	 * @param fdOffsetExpense 冲销报销单
	 */
	public void setFdOffsetExpense(FsExpenseMain fdOffsetExpense) {
		this.fdOffsetExpense = fdOffsetExpense;
	}
	
	/**
	 * 创建者
	 */
	private SysOrgPerson docCreator;
	
	/**
	 * @return 创建者
	 */
	public SysOrgPerson getDocCreator() {
		return this.docCreator;
	}
	
	/**
	 * @param docCreator 创建者
	 */
	public void setDocCreator(SysOrgPerson docCreator) {
		this.docCreator = docCreator;
	}
	

	//机制开始
	//机制结束

	public Class<FsExpenseMainHangForm> getFormClass() {
		return FsExpenseMainHangForm.class;
	}

	private static ModelToFormPropertyMap toFormPropertyMap;

	public ModelToFormPropertyMap getToFormPropertyMap() {
		if (toFormPropertyMap == null) {
			toFormPropertyMap = new ModelToFormPropertyMap();
			toFormPropertyMap.putAll(super.getToFormPropertyMap());
			toFormPropertyMap.put("fdHangExpense.fdId", "fdHangExpenseId");
			toFormPropertyMap.put("fdHangExpense.docSubject", "fdHangExpenseName");
			toFormPropertyMap.put("fdOffsetExpense.fdId", "fdOffsetExpenseId");
			toFormPropertyMap.put("fdOffsetExpense.docSubject", "fdOffsetExpenseName");
			toFormPropertyMap.put("docCreator.fdId", "docCreatorId");
			toFormPropertyMap.put("docCreator.fdName", "docCreatorName");
		}
		return toFormPropertyMap;
	}
}
