// creating a function to set the map properties

// The mapProp variable defines the properties for this map

// The center property specifies where to center the map(using lon and lat coordinates)

// The zoom property specifies the level of zoom for the map.

// creates a new map inside the <div> element with the id = googleMap, using the parameters that are passed through(mapProp)

function myMap() {
var mapProp = {
center: new google.maps.LatLng(51.508742, -0.120850), 
zoom: 5,
};
var map =new google.maps.Map(document.getElementById("googleMap"), mapProp);
}