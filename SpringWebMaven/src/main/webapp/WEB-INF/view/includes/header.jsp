<%@ page language="java" contentType="text/html; charset=utf-8" %>
<style type="text/css">
	.placeholder { color: #aaa; }
</style>
<script type="text/javascript">
 
</script>
<div id="skipnavi">
	<a href="#contents">본문 바로가기</a>
	<a href="#gnb">메뉴 바로가기</a>
	<a href="#sitemap">사이트맵 바로가기</a>
</div>
<!-- // header Start -->
<div id="header">
	<div class="header_wrap">
		<h1><a href="<c:url value="/summary/detail.do"/>"><img src="<c:url value="${dirImages}/logo.png"/>" alt="Samsung Magazine Admin Site" /></a></h1>
		<ul id="gnb">
			<li <c:if test="${param.menu eq 1}">class="on"</c:if>><a href="#">회원관리</a></li>
			<li <c:if test="${param.menu eq 2}">class="on"</c:if>><a href="#">콘텐츠관리</a></li>
			<li <c:if test="${param.menu eq 3}">class="on"</c:if>><a href="#">통계관리</a></li>
		</ul>
		<div class="user">
			<div class="user_name">${sessionScope.userNm}</div>
			<div class="logout"><a href="<c:url value="/users/logout.do" />">Logout</a></div>
		</div>
	</div>
</div>