"use strict";
var $ = function (id) {
    return document.getElementById(id);
};

var onCategoryChange = function (){
	var categoryValue = $("category").value;
	if(categoryValue == "tv")
	{
		$("img1").src = ".\\img\\tv1.jpg";		
		$("price1").innerHTML = "$400";
		$("img2").src = ".\\img\\tv2.jpg";		
		$("price2").innerHTML = "$500";
		$("img3").src = ".\\img\\tv3.jpg";		
		$("price3").innerHTML = "$600";
	}
	
	if(categoryValue == "fridge")
	{
		$("img1").src = ".\\img\\fridge1.jpg";		
		$("price1").innerHTML = "$700";
		$("img2").src = ".\\img\\fridge2.jpg";		
		$("price2").innerHTML = "$800";
		$("img3").src = ".\\img\\fridge3.jpg";		
		$("price3").innerHTML = "$900";
	}
	
	if(categoryValue == "washer")
	{
		$("img1").src = ".\\img\\washer1.jpg";		
		$("price1").innerHTML = "$1000";
		$("img2").src = ".\\img\\washer2.jpg";		
		$("price2").innerHTML = "$1100";
		$("img3").src = ".\\img\\washer3.jpg";		
		$("price3").innerHTML = "$1200";
	}
	
	$("img1").className = "black-border";
	$("img2").className = "black-border";
	$("img3").className = "black-border";
	
}
	// Hint:
	// 1. Retrieve the category dropdown's selection ("value").
	// 2. Depends on the selection, load the image and price.
	//    sample code:
    //    $("...").src = ".\\img\\tv1.jpg";
    //    $("...").innerHTML = "$400";
	// 3. Make all 3 images' border to be black by change the image's className.


var onTDClick = function (option){
	$("img1").className = "black-border";
	$("img2").className = "black-border";
	$("img3").className = "black-border";
	$("img"+option).className = "red-border";
	$("selectedPrice").value = $("price"+option).innerHTML;
	
}
	// Hint:
	// 1. Make all 3 images' border to be black by change the image's className.
	// 2. The option will be 1, 2, or 3 to indicate which image was clicked.
	//    Change the clicked image's border to red by change the image's className.
	// 3. Retrieve the corresponding price ($(...).innerHTML).
	// 4. Set selectedPrice's "value" to price in step 3.


var onClickCalculate = function (){
	if($("category").value == '') {
       alert('Please select appliance category.');
       return;
	}
	if($("selectedPrice").value == '') {
       alert('Select an applicance.');
       return;
	}
		
		var radio = document.getElementsByName('shipping');
		var found = false;
		var shipping = 0;
			for (var i = 0; i < radio.length; i++) {
				if (radio[i].checked) {
				found = true;      
				shipping = parseFloat(radio[i].value);
				}
			}
			
    if(!found) {
       alert('Please select shipping option.')
        return;
	}
	if($("state").value == '') {
       alert('Please select state tax.');
       return;
	}
		
		var total = parseFloat($("selectedPrice").value.substring(1)) + shipping;
		var taxRate = parseFloat($("state").value);
		total = total * (1 + taxRate);

		console.log(total);
	
		$('total').innerHTML = total;
}
	// Hint:
	// 1. Verify selectedPrice is valued (client has selected an appliance).
	//    If no selection, then prompt user.
	// 2. Verify shipping option is selected by using document.getElementsByName.
	//    This function will return an array of objects, loop through the array
	//    to verify if any is "checked". If no selection, then prompt user.
	// 3. Verify "state" is selected by checking the "value" of "state".
	//    If no selection, then prompt user.
	// 4. Calculate the total if all required fields are valued.
	// 5. Display the total value in "total" tag.


window.onload = function () {
    $("category").onclick = onCategoryChange;
    $("td1").onclick = function(){onTDClick(1)};
    $("td2").onclick = function(){onTDClick(2)};
    $("td3").onclick = function(){onTDClick(3)};
    $("calculate").onclick = onClickCalculate;
    $("category").focus();
};