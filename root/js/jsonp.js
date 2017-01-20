function jsonpCallback(callback, t, u, d,f) {
	$.ajax({
		dataType : "JSONP",
		jsonp : "callback",
		jsonpCallback : callback,
		type : t,
		url : u,
		data : d,
		success : f,
		error : function(e) {
			console.log("error := " + e.status + ',' + e.statusText);
			throw new Error("jsonp callback error");
		}
	});

}