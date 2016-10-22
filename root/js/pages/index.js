function test(){
	alert("OK");
}

$(function(){
	$("#test").click(function(){
		//alert("test");
		$.ajax({
			url:"test.do",
			
			success:function(data){
				alert(data);
			}
			
		});
		
	});
});