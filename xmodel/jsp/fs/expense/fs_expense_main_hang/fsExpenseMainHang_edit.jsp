<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ include file="/sys/ui/jsp/common.jsp"%>
<template:include ref="config.edit">
	<template:replace name="toolbar">
		<ui:toolbar id="toolbar" layout="sys.ui.toolbar.float" var-navwidth="95%">
			<c:choose>
				<c:when test="${ fsExpenseMainHangForm.method_GET == 'edit' }">
					<ui:button text="${ lfn:message('button.update') }" onclick="Com_Submit(document.fsExpenseMainHangForm, 'update');"></ui:button>
				</c:when>
				<c:when test="${ fsExpenseMainHangForm.method_GET == 'add' }">	
					<ui:button text="${ lfn:message('button.save') }" onclick="Com_Submit(document.fsExpenseMainHangForm, 'save');"></ui:button>
					<ui:button text="${ lfn:message('button.saveadd') }" onclick="Com_Submit(document.fsExpenseMainHangForm, 'saveadd');"></ui:button>
				</c:when>
			</c:choose>
			<ui:button text="${ lfn:message('button.close') }" onclick="Com_CloseWindow();"></ui:button>	
		</ui:toolbar>
	</template:replace>
	<template:replace name="content">
	
<html:form action="/fs/expense/fs_expense_main_hang/fsExpenseMainHang.do">
 
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
			<xform:datetime property="docCreateTime" showStatus="view" />
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
			<xform:select property="fdHangExpenseId">
				<xform:beanDataSource serviceBean="fsExpenseMainService" selectBlock="fdId,docSubject" orderBy="" />
			</xform:select>
		</td>
	</tr>
	<tr>
		<td class="td_normal_title" width=15%>
			<bean:message bundle="fs-expense" key="fsExpenseMainHang.fdOffsetExpense"/>
		</td><td width="35%">
			<xform:select property="fdOffsetExpenseId">
				<xform:beanDataSource serviceBean="fsExpenseMainService" selectBlock="fdId,docSubject" orderBy="" />
			</xform:select>
		</td>
		<td class="td_normal_title" width=15%>
			<bean:message bundle="fs-expense" key="fsExpenseMainHang.docCreator"/>
		</td><td width="35%">
			<xform:address propertyId="docCreatorId" propertyName="docCreatorName" orgType="ORG_TYPE_PERSON" showStatus="view" />
		</td>
	</tr>
			</table>
		</td>
	</tr>
</table> 
</center>
<html:hidden property="fdId" />
<html:hidden property="method_GET" />
<script>
	$KMSSValidation();
</script>
</html:form>

	</template:replace>
</template:include>