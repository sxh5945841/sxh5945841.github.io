/**
 * 
 */
//手机号的是否存在认证
$(function(){
	var tel=$("telephone").val();
	$.ajax({
		uri:"http://sj.apidata.cn/?mobile="+tel,
		type:post,
		jsonp:callback,
		jsonpCallback:getData,
		cache:true,
		
	});
});