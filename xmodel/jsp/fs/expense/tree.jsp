﻿<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ include file="/sys/ui/jsp/common.jsp"%>
<template:include ref="config.tree">
	<template:replace name="content">
//Com_Parameter.XMLDebug = true;
function generateTree()
{
	LKSTree = new TreeView(
		"LKSTree",
		"<bean:message key="module.fs.expense" bundle="fs-expense"/>",
		document.getElementById("treeDiv")
	);
	var n1, n2, n3, n4, n5;
	n1 = LKSTree.treeRoot;
	
	<%-- 冲销挂账金额日志 --%>
	
	n2 = n1.AppendURLChild(
		"<bean:message key="table.fsExpenseMainHang" bundle="fs-expense" />",
		"<c:url value="/fs/expense/fs_expense_main_hang/fsExpenseMainHang.do?method=list" />"
	);
	

	
	LKSTree.EnableRightMenu();
	LKSTree.Show();
}
	</template:replace>
</template:include>