/**
 * 
 */

 document.onreadystatechange=function() {
console.log(document.readyState);
	var userName=document.getElementById('username-input');
	var password=document.getElementById('password-input');
	var button=document.getElementById('submit-input');

	userName.addEventListener('click',onClick);

	function onClick(event){
		console.log('onclick');
		var i=0;
		for(i=0;i<1000;i++){
			for(i;i<500;i++){
				
			}
		}
		console.log('end of onclick');
	}

	
}

