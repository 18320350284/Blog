$(document).ready(function(){
	$("#saveBtn").on('click',function(){
		queryEpPage();
    });
});

function queryEpPage(){
// 			var datasent = {"userName":"test","userPass":"admin","userEmail":"2238481706@qq.com"};
	var datasent = $("#registerForm").serializeObject();
	params = JSON.stringify(datasent); 
	$.ajax({
		type : "POST",
		url : "../../user/register",
		dataType : "json",
		contentType : "application/json;charset=utf-8",
		data : params,
		async : false,
		success : function(data) {
			alert(data.resultMessage);
		}
	});
}
