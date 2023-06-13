/**
 * 
 */

 function calcjs(){
	 var n1 = parseInt(document.getElementsByName("n1").value)
	 var n2 = parseInt(document.getElementsByName("n2").value)
	 var op = document.getElementsByName("op").value
	 
	 var result = 0;
	 switch(op){
		 case "+": result = n1 + n2; brea;
		 case "-": result = n1 - n2; brea;
		 case "*": result = n1 * n2; brea;
		 case "/": result = n1 / n2; brea;
 }
 
 console.log(result)
 
 var ans = document.getElementByID("ans")
 ans.value = result