// function initialize () {
// 	var map;
// 	var bounds = new google.maps.LatLngBounds();
// 	var mapOptions = {
// 		mapTypeId: 'HYBRID'
// 	};

// 	// Display a map on the page

// 	map = new google.maps.Map(document.getElementById("myMap"), mapOptions);

// 	// Multiple Markers
// 	var markers = [
// 	['Bossy Grrls Pin Up Joint, Columbus OH', 40.015321, -83.011262]
// 	['Ace of Cups, Columbus OH', 40.015664, -83.012026]
// 	['Tatoheads, Columbus OH', 39.9369271, -82.9858721 ]
// 	];

// 	// Info Window Content
// 	var infoWindowContent = [
// 	['<div class= "info_content">' + '<h3>Bossy Grrls</h3></div>'],
// 	['<div class= "info_content">' + '<h3>Ace of Cups</h3></div>'],
// 	['<div class= "info_content">' + '<h3>Tatoheads</h3></div>']
// 	];

// 	// display multiple markers on a map
// 	var infoWindow = new google.maps.InfoWindow(), marker i;

// 	// Loop through our array of markers & place each one on the map 
// 	for( i = 0; i < markers.length; i++ ) {
// 		var position = new google.maps.LatLng(markers[i][1], markers[i][2]);
// 		bounds.extend(position);
// 		marker = new google.maps.Marker({
// 			position: position,
// 			map: map,
// 			title: markers[i][0]
// 		});

//         // Allow each marker to have an info window    
//         google.maps.event.addListener(marker, 'click', (function(marker, i) {
//         	return function() {
//         		infoWindow.setContent(infoWindowContent[i][0]);
//         		infoWindow.open(map, marker);
//         	}
//         })(marker, i));

//         // Automatically center the map fitting all markers on the screen
//         map.fitBounds(bounds);
//     }

//     // Override our map zoom level once our fitBounds function runs (Make sure it only runs once)
//     var boundsListener = google.maps.event.addListener((map), 'bounds_changed', function(event) {
//     	this.setZoom(14);
//     	google.maps.event.removeListener(boundsListener);
//     });


// }


var locations = [
	['Bossy Grrls, Columbus OH', 40.0153214, -83.0112623],
	['Ace of Cups, Columbus OH', 40.0156739, -83.0140944],
	['Tatoheads, Columbus OH', 39.936923, -82.9858721],
];

function initMap() {
	var map = new google.maps.Map(document.getElementById('googleMap'), {
		zoom: 10,
		center: new google.maps.LatLng(40.016232, -83.011997),
		mapTypeId: google.maps.MapTypeId.ROADMAP
	});


	var infoWindow = new google.maps.InfoWindow();

	var marker, i;

	for (i = 0; i < locations.length; i++) {
		marker = new google.maps.Marker({
			position: new google.maps.LatLng(locations[i][1], locations[i][2]),
			map:map
		});

		google.maps.event.addListener(marker, 'click', (function(marker, i) {
			return function() {
				infoWindow.setContent(locations[i][0]);
				infoWindow.open(map, marker);
			}
		}) (marker, i));
	}

}