
// Creating a function to set up the map properties
function myMap() {
	// Declaring where the location of the map
	var mapCenter = new google.maps.LatLng(39.991492, -83.004902);
	var mapCanvas = document.getElementById("googleMap");
	// centering the map and setting the zoom
	var mapOptions = {center: mapCenter, zoom: 5};
	var map = new google.maps.Map(mapCanvas, mapOptions);
	// The Marker constructor creates a marker. (Note that the position property must be set for the marker to display).
	var marker = new google.maps.Marker({position:mapCenter,  icon: 'beer-icon.png'});
	marker.setMap(map);
}

