<%@ page language="java" %>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ include file="/WEB-INF/view/includes/taglibs.jspf" %>
<%@ include file="/WEB-INF/view/includes/variables.jspf" %>
<%@ include file="/WEB-INF/view/includes/metatags.jspf" %>
<%@ include file="/WEB-INF/view/includes/doctype.jspf" %>

<tiles:importAttribute name="title" scope="request"/>
		
<head>
<title><tiles:getAsString name="title"/></title>

        <script type="text/javascript" src="/resources/js/common/jquery-1.8.1.min.js" ></script>
        <script type="text/javascript" src="/resources/js/common/jquery.validate.min.js" ></script>
    </head>
    <body>
		<table width='100%' border='1'>
		    <tr>
		        <td>
		            <table>
		                <tr><td><tiles:insertAttribute name="header"/></td></tr>
		            </table>
		        </td>
		    </tr>
		    <tr>
		        <td>
		            <table width='100%' border='1'>
		               <tr><td><tiles:insertAttribute name="body"/></td></tr>
		            </table>
		        </td>
		    </tr>
		    <tr>
		        <td>
		            <table>
		                <tr><td><tiles:insertAttribute name="footer"/></td></tr>
		            </table>
		        </td>
		    </tr>
		</table>
    </body>
</html>