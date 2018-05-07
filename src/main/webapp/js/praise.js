/**
 * 
 */
$(function(){
	$(".praise").click(function(){
		//传递初始praise为0；
		$(this).css({display:'inline-block'});

		$.ajax({
			url : "indexServlets?method=praiseToggle",
			type : 'post',
			dataType:"json",
		    data:{
		    	sid:$(".sid").val(),
		    }
    });
    });
});