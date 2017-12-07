package com.landray.kmss.fs.expense.forms;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionMapping;
import com.landray.kmss.common.forms.ExtendForm;
import com.landray.kmss.util.AutoArrayList;

import com.landray.kmss.common.convertor.FormToModelPropertyMap;
import com.landray.kmss.common.convertor.FormConvertor_FormListToModelList;
import com.landray.kmss.common.convertor.FormConvertor_IDToModel;
import com.landray.kmss.common.convertor.FormConvertor_IDsToModelList;

import com.landray.kmss.fs.expense.model.FsExpenseMainHang;
import com.landray.kmss.fs.expense.model.FsExpenseMain;
import com.landray.kmss.sys.organization.model.SysOrgElement;



/**
 * 冲销挂账金额日志 Form
 * 
 * @author hedq
 * @version 1.0 2017-10-24
 */
public class FsExpenseMainHangForm  extends ExtendForm  {

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
	private String docCreateTime;
	
	/**
	 * @return 创建时间
	 */
	public String getDocCreateTime() {
		return this.docCreateTime;
	}
	
	/**
	 * @param docCreateTime 创建时间
	 */
	public void setDocCreateTime(String docCreateTime) {
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
	 * 挂账报销单的ID
	 */
	private String fdHangExpenseId;
	
	/**
	 * @return 挂账报销单的ID
	 */
	public String getFdHangExpenseId() {
		return this.fdHangExpenseId;
	}
	
	/**
	 * @param fdHangExpenseId 挂账报销单的ID
	 */
	public void setFdHangExpenseId(String fdHangExpenseId) {
		this.fdHangExpenseId = fdHangExpenseId;
	}
	
	/**
	 * 挂账报销单的名称
	 */
	private String fdHangExpenseName;
	
	/**
	 * @return 挂账报销单的名称
	 */
	public String getFdHangExpenseName() {
		return this.fdHangExpenseName;
	}
	
	/**
	 * @param fdHangExpenseName 挂账报销单的名称
	 */
	public void setFdHangExpenseName(String fdHangExpenseName) {
		this.fdHangExpenseName = fdHangExpenseName;
	}
	
	/**
	 * 冲销报销单的ID
	 */
	private String fdOffsetExpenseId;
	
	/**
	 * @return 冲销报销单的ID
	 */
	public String getFdOffsetExpenseId() {
		return this.fdOffsetExpenseId;
	}
	
	/**
	 * @param fdOffsetExpenseId 冲销报销单的ID
	 */
	public void setFdOffsetExpenseId(String fdOffsetExpenseId) {
		this.fdOffsetExpenseId = fdOffsetExpenseId;
	}
	
	/**
	 * 冲销报销单的名称
	 */
	private String fdOffsetExpenseName;
	
	/**
	 * @return 冲销报销单的名称
	 */
	public String getFdOffsetExpenseName() {
		return this.fdOffsetExpenseName;
	}
	
	/**
	 * @param fdOffsetExpenseName 冲销报销单的名称
	 */
	public void setFdOffsetExpenseName(String fdOffsetExpenseName) {
		this.fdOffsetExpenseName = fdOffsetExpenseName;
	}
	
	/**
	 * 创建者的ID
	 */
	private String docCreatorId;
	
	/**
	 * @return 创建者的ID
	 */
	public String getDocCreatorId() {
		return this.docCreatorId;
	}
	
	/**
	 * @param docCreatorId 创建者的ID
	 */
	public void setDocCreatorId(String docCreatorId) {
		this.docCreatorId = docCreatorId;
	}
	
	/**
	 * 创建者的名称
	 */
	private String docCreatorName;
	
	/**
	 * @return 创建者的名称
	 */
	public String getDocCreatorName() {
		return this.docCreatorName;
	}
	
	/**
	 * @param docCreatorName 创建者的名称
	 */
	public void setDocCreatorName(String docCreatorName) {
		this.docCreatorName = docCreatorName;
	}
	
	//机制开始 
	//机制结束

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		fdName = null;
		fdOffsetMoney = null;
		fdOverplusMoney = null;
		docCreateTime = null;
		docStatus = null;
		fdHangExpenseId = null;
		fdHangExpenseName = null;
		fdOffsetExpenseId = null;
		fdOffsetExpenseName = null;
		docCreatorId = null;
		docCreatorName = null;
		
 
		super.reset(mapping, request);
	}

	public Class<FsExpenseMainHang> getModelClass() {
		return FsExpenseMainHang.class;
	}
	
	private static FormToModelPropertyMap toModelPropertyMap;

	public FormToModelPropertyMap getToModelPropertyMap() {
		if (toModelPropertyMap == null) {
			toModelPropertyMap = new FormToModelPropertyMap();
			toModelPropertyMap.putAll(super.getToModelPropertyMap());
			toModelPropertyMap.put("fdHangExpenseId",
					new FormConvertor_IDToModel("fdHangExpense",
						FsExpenseMain.class));
			toModelPropertyMap.put("fdOffsetExpenseId",
					new FormConvertor_IDToModel("fdOffsetExpense",
						FsExpenseMain.class));
			toModelPropertyMap.put("docCreatorId",
					new FormConvertor_IDToModel("docCreator",
						SysOrgElement.class));
		}
		return toModelPropertyMap;
	}
}
