<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<%@include file="/common/head.jsp" %>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#insertBtn").click(function(){
				var param = new Map();

				param.memberId = $("#memberId").val();
				param.password = $("#password").val();
				param.memberName = $("#memberName").val();
				
				$.ajax({
		    	    url: '/web/insertMember.data',  
					data: JSON.stringify(param),
					dataType: 'json',
					headers: { 
				        'Accept': 'application/json',
				        'Content-Type': 'application/json' 
				    },
					type: 'POST',
					success: function(result){
					},error: function (errorResult) {
					}
				});
			});
		});
	</script>
</head>	
<body>
<%@include file="/common/header.jsp" %>

<input type="text" id="memberId" />
<input type="text" id="password" />
<input type="text" id="memberName" />

<button id="insertBtn">insert</button>

<%@include file="/common/footer.jsp" %>
</body>
</html>
