//Ext.onReady(function(){
	Ext.application({
	    name: "MyApp",
	    appFolder: '',
	    controllers: ["User"],
	    autoCreateViewport: true,
	    launch: function () {
	        // 页面加载完成之后执行
	    	console.log("Launch Application!");
	    	console.log("Not rely on Ext.onReady!");
	    }
	});
//});
