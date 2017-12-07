<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ include file="/sys/ui/jsp/common.jsp"%>
<template:include ref="config.list">
	<template:replace name="toolbar">
			<ui:toolbar id="toolbar" layout="sys.ui.toolbar.float" var-navwidth="95%">
				<kmss:auth requestURL="/fs/expense/fs_expense_main_hang/fsExpenseMainHang.do?method=add">
					<ui:button text="${ lfn:message('button.add') }" 
						onclick="Com_OpenWindow('${LUI_ContextPath}/fs/expense/fs_expense_main_hang/fsExpenseMainHang.do?method=add');">
					</ui:button>
				</kmss:auth>
				<kmss:auth requestURL="/fs/expense/fs_expense_main_hang/fsExpenseMainHang.do?method=deleteall">
					<ui:button text="${ lfn:message('button.delete') }"
						onclick="if(!List_ConfirmDel())return;Com_Submit(document.fsExpenseMainHangForm, 'deleteall');">
					</ui:button>
				</kmss:auth>
			</ui:toolbar>
	</template:replace>
 
	<template:replace name="content">
	
<html:form action="/fs/expense/fs_expense_main_hang/fsExpenseMainHang.do">
<c:if test="${queryPage.totalrows==0}">
	<%@ include file="/resource/jsp/list_norecord.jsp"%>
</c:if>
<c:if test="${queryPage.totalrows>0}">
	<%@ include file="/resource/jsp/list_pagenav_top.jsp"%>
	<table id="List_ViewTable">
		<tr>
			<sunbor:columnHead htmlTag="td">
				<td width="10pt">
					<input type="checkbox" name="List_Tongle">
				</td>
				<td width="40pt">
					<bean:message key="page.serial"/>
				</td>
				<sunbor:column property="fsExpenseMainHang.fdName">
					<bean:message bundle="fs-expense" key="fsExpenseMainHang.fdName"/>
				</sunbor:column>
				<sunbor:column property="fsExpenseMainHang.fdOffsetMoney">
					<bean:message bundle="fs-expense" key="fsExpenseMainHang.fdOffsetMoney"/>
				</sunbor:column>
				<sunbor:column property="fsExpenseMainHang.fdOverplusMoney">
					<bean:message bundle="fs-expense" key="fsExpenseMainHang.fdOverplusMoney"/>
				</sunbor:column>
				<sunbor:column property="fsExpenseMainHang.docCreateTime">
					<bean:message bundle="fs-expense" key="fsExpenseMainHang.docCreateTime"/>
				</sunbor:column>
				<sunbor:column property="fsExpenseMainHang.docStatus">
					<bean:message bundle="fs-expense" key="fsExpenseMainHang.docStatus"/>
				</sunbor:column>
				<sunbor:column property="fsExpenseMainHang.fdHangExpense.docSubject">
					<bean:message bundle="fs-expense" key="fsExpenseMainHang.fdHangExpense"/>
				</sunbor:column>
				<sunbor:column property="fsExpenseMainHang.fdOffsetExpense.docSubject">
					<bean:message bundle="fs-expense" key="fsExpenseMainHang.fdOffsetExpense"/>
				</sunbor:column>
				<sunbor:column property="fsExpenseMainHang.docCreator.fdName">
					<bean:message bundle="fs-expense" key="fsExpenseMainHang.docCreator"/>
				</sunbor:column>
			</sunbor:columnHead>
		</tr>
		<c:forEach items="${queryPage.list}" var="fsExpenseMainHang" varStatus="vstatus">
			<tr
				kmss_href="<c:url value="/fs/expense/fs_expense_main_hang/fsExpenseMainHang.do" />?method=view&fdId=${fsExpenseMainHang.fdId}">
				<td>
					<input type="checkbox" name="List_Selected" value="${fsExpenseMainHang.fdId}">
				</td>
				<td>
					${vstatus.index+1}
				</td>
				<td>
					<c:out value="${fsExpenseMainHang.fdName}" />
				</td>
				<td>
					<c:out value="${fsExpenseMainHang.fdOffsetMoney}" />
				</td>
				<td>
					<c:out value="${fsExpenseMainHang.fdOverplusMoney}" />
				</td>
				<td>
					<kmss:showDate value="${fsExpenseMainHang.docCreateTime}" />
				</td>
				<td>
					<c:out value="${fsExpenseMainHang.docStatus}" />
				</td>
				<td>
					<c:out value="${fsExpenseMainHang.fdHangExpense.docSubject}" />
				</td>
				<td>
					<c:out value="${fsExpenseMainHang.fdOffsetExpense.docSubject}" />
				</td>
				<td>
					<c:out value="${fsExpenseMainHang.docCreator.fdName}" />
				</td>
			</tr>
		</c:forEach>
	</table>
	<%@ include file="/resource/jsp/list_pagenav_down.jsp" %>
</c:if>
</html:form>

	</template:replace>
</template:include>