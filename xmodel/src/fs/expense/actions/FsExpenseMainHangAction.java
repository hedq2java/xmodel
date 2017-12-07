package com.landray.kmss.fs.expense.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.landray.kmss.common.actions.ExtendAction;
import com.landray.kmss.common.service.IBaseService;

import com.landray.kmss.fs.expense.service.IFsExpenseMainService;
import com.landray.kmss.sys.organization.service.ISysOrgElementService;
import com.landray.kmss.fs.expense.service.IFsExpenseMainHangService;

import com.landray.kmss.util.CriteriaUtil;
import com.landray.kmss.util.CriteriaValue;
import com.landray.kmss.util.StringUtil;
import com.landray.kmss.common.dao.HQLInfo;
import com.landray.kmss.fs.expense.model.FsExpenseMainHang;
import com.landray.kmss.fs.expense.forms.FsExpenseMainForm;
import com.landray.kmss.fs.expense.forms.FsExpenseMainHangForm;
import com.landray.kmss.sys.organization.forms.SysOrgElementForm;

import com.landray.kmss.common.service.ICoreOuterService;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import com.landray.kmss.common.actions.RequestContext;
import com.landray.kmss.sys.simplecategory.interfaces.SimpleCategoryUtil;


import com.landray.kmss.common.forms.IExtendForm;
 

import com.landray.kmss.fs.expense.model.FsExpenseMainHang;
import com.landray.kmss.fs.expense.model.FsExpenseMain;
import com.landray.kmss.sys.organization.model.SysOrgElement;

 
/**
 * 冲销挂账金额日志 Action
 * 
 * @author hedq
 * @version 1.0 2017-10-24
 */
public class FsExpenseMainHangAction extends ExtendAction {
	protected IFsExpenseMainHangService fsExpenseMainHangService;

	protected IBaseService getServiceImp(HttpServletRequest request) {
		if(fsExpenseMainHangService == null){
			fsExpenseMainHangService = (IFsExpenseMainHangService)getBean("fsExpenseMainHangService");
		}
		return fsExpenseMainHangService;
	}
}

