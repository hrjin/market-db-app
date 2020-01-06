<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>PaaS-TA DB</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="/resources/static/assets/css/main.css" />
		<noscript><link rel="stylesheet" href="/resources/static/assets/css/noscript.css" /></noscript>
	</head>
	<body class="is-preload" style="overflow:hidden;">

		<!-- Header -->
			<section id="header">
				<div class="inner">
				<span class="icon major fa-cloud" style="height: 100px;"></span>
					<h1 style="height: 100px;">PaaS-TA ${dbType} 접속 정보 가져오기</h1>
		  			<div>
						<table>
							<thead>
								<tr>
					                <td>Host</td>
									<td>Port</td>
									<td>Database Name</td>
					                <td>User Name</td>
					                <td>Password</td>
					            </tr>
							</thead>
							<tr>
								<td>${host}</td>
								<td>${port}</td>
								<td>${dbName}</td>
								<td>${username}</td>
								<td>${password}</td>
							</tr>
							<tbody id="dbInfoResult"></tbody>
						</table>
					</div>

				</div>
				
			</section>
		<!-- Scripts -->
		<script src="/resources/static/assets/js/jquery.min.js"></script>
		<script src="/resources/static/assets/js/browser.min.js"></script>
		<script src="/resources/static/assets/js/breakpoints.min.js"></script>
		<script src="/resources/static/assets/js/main.js"></script>
	</body>
</html>
<script type="text/javascript">
</script>
