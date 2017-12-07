<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ include file="/sys/ui/jsp/common.jsp"%>
<template:include ref="config.view">
	<template:replace name="toolbar">
		<ui:toolbar id="toolbar" layout="sys.ui.toolbar.float" var-navwidth="95%">
<script>
	function confirmDelete(msg){
	var del = confirm("<bean:message key="page.comfirmDelete"/>");
	return del;
}
</script>
			<kmss:auth requestURL="/fs/expense/fs_expense_main_hang/fsExpenseMainHang.do?method=edit&fdId=${param.fdId}" requestMethod="GET">
				<ui:button text="${ lfn:message('button.edit') }" onclick="Com_OpenWindow('fsExpenseMainHang.do?method=edit&fdId=${param.fdId}','_self');">
				</ui:button>
			</kmss:auth>
			<kmss:auth requestURL="/fs/expense/fs_expense_main_hang/fsExpenseMainHang.do?method=delete&fdId=${param.fdId}" requestMethod="GET">
				<ui:button text="${ lfn:message('button.delete') }" onclick="if(!confirmDelete())return;Com_OpenWindow('fsExpenseMainHang.do?method=delete&fdId=${param.fdId}','_self');">
				</ui:button>
			</kmss:auth>
			<ui:button text="${ lfn:message('button.close') }" onclick="Com_CloseWindow();"></ui:button>
		</ui:toolbar>
	</template:replace>
	<template:replace name="content">
	
<p class="txttitle"><bean:message bundle="fs-expense" key="table.fsExpenseMainHang"/></p>

<center>
<table class="tb_normal" id="Label_Tabel" width=95%>

	<tr LKS_LabelName='${ lfn:message('config.baseinfo') }'>
		<td>
			<table class="tb_normal" width=100%> 
	<tr>
		<td class="td_normal_title" width=15%>
			<bean:message bundle="fs-expense" key="fsExpenseMainHang.fdName"/>
		</td><td width="35%">
			<xform:text property="fdName" style="width:85%" />
		</td>
		<td class="td_normal_title" width=15%>
			<bean:message bundle="fs-expense" key="fsExpenseMainHang.fdOffsetMoney"/>
		</td><td width="35%">
			<xform:text property="fdOffsetMoney" style="width:85%" />
		</td>
	</tr>
	<tr>
		<td class="td_normal_title" width=15%>
			<bean:message bundle="fs-expense" key="fsExpenseMainHang.fdOverplusMoney"/>
		</td><td width="35%">
			<xform:text property="fdOverplusMoney" style="width:85%" />
		</td>
		<td class="td_normal_title" width=15%>
			<bean:message bundle="fs-expense" key="fsExpenseMainHang.docCreateTime"/>
		</td><td width="35%">
			<xform:datetime property="docCreateTime" />
		</td>
	</tr>
	<tr>
		<td class="td_normal_title" width=15%>
			<bean:message bundle="fs-expense" key="fsExpenseMainHang.docStatus"/>
		</td><td width="35%">
			<xform:text property="docStatus" style="width:85%" />
		</td>
		<td class="td_normal_title" width=15%>
			<bean:message bundle="fs-expense" key="fsExpenseMainHang.fdHangExpense"/>
		</td><td width="35%">
			<c:out value="${fsExpenseMainHangForm.fdHangExpenseName}" />
		</td>
	</tr>
	<tr>
		<td class="td_normal_title" width=15%>
			<bean:message bundle="fs-expense" key="fsExpenseMainHang.fdOffsetExpense"/>
		</td><td width="35%">
			<c:out value="${fsExpenseMainHangForm.fdOffsetExpenseName}" />
		</td>
		<td class="td_normal_title" width=15%>
			<bean:message bundle="fs-expense" key="fsExpenseMainHang.docCreator"/>
		</td><td width="35%">
			<c:out value="${fsExpenseMainHangForm.docCreatorName}" />
		</td>
	</tr>
			</table>
		</td>
	</tr>
</table>
</center>

	</template:replace>
</template:include>