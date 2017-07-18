// Creating a function to set the map properties

function myMaps(){
	var columbus = {
		center: new google.maps.LatLng(39.9612, 82.9988),
		zoom: 5,
		 mapTypeId: google.maps.MapTypeId.ROADMAP
	};
   var bali = {
   	   center: new google.maps.LatLng(8.409518, 115.188919),
   	   zoom: 7,
   	    mapTypeId: google.maps.MapTypeId.ROADMAP
   };
   var nepal = {
   	center: new google.maps.LatLng(28.3949, 84.1240),
   	zoom: 9,
   	 mapTypeId: google.maps.MapTypeId.ROADMAP
   };

   var map1 = new google.maps.Map(document.getElementById("columbus"), columbus);
   var map2 = new google.maps.Map(document.getElementById("bali"), bali);
   var map3 = new google.maps.Map(document.getElementById("nepal"), nepal);
}