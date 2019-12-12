function getWeather(){
	//S T - E T I E N N E
	if(document.getElementById("cityName").value.trim()=="stetienne" | 
		document.getElementById("cityName").value.trim()=="StEtienne" |
		document.getElementById("cityName").value.trim()=="saint-etienne" |
		document.getElementById("cityName").value.trim()=="Saint-Etienne"){
		var weather;
		var xmlhttp = new XMLHttpRequest();
	    xmlhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	    	weather = JSON.parse(this.responseText);
			var div = document.getElementById("weather_window");
			var temp = Math.round(weather.main.temp - 273.15);
			var x = document.createElement("h5");
			var xtext = document.createTextNode("St-Etienne: "+weather.weather[0].main+" - "+weather.weather[0].description+" - "+temp+"°C");
			x.appendChild(xtext);
			div.appendChild(x);
		}
		}
			    xmlhttp.open("GET", "http://api.openweathermap.org/data/2.5/weather?q=saint-etienne,fr&appid=4d6ddf350eeabacd18d0fb7cd12f1a53", true);
			    xmlhttp.send();
	}
	
	
	
	//L Y O N
	else if(document.getElementById("cityName").value.trim()=="lyon" | 
		document.getElementById("cityName").value.trim()=="Lyon"){
		var weather;
		var xmlhttp = new XMLHttpRequest();
	    xmlhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	    	weather = JSON.parse(this.responseText);
			var div = document.getElementById("weather_window");
			var temp = Math.round(weather.main.temp - 273.15);
			var x = document.createElement("h5");
			var xtext = document.createTextNode("Lyon: "+weather.weather[0].main+" - "+weather.weather[0].description+" - "+temp+"°C");
			x.appendChild(xtext);
			div.appendChild(x);
		}
		}
			    xmlhttp.open("GET", "http://api.openweathermap.org/data/2.5/weather?q=lyon,fr&appid=4d6ddf350eeabacd18d0fb7cd12f1a53", true);
			    xmlhttp.send();
	}
	
	//P A R I S
	else if(document.getElementById("cityName").value.trim()=="paris" | 
			document.getElementById("cityName").value.trim()=="Paris"){
			var weather;
			var xmlhttp = new XMLHttpRequest();
		    xmlhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		    	weather = JSON.parse(this.responseText);
				var div = document.getElementById("weather_window");
				var temp = Math.round(weather.main.temp - 273.15);
				var x = document.createElement("h5");
				var xtext = document.createTextNode("Paris: "+weather.weather[0].main+" - "+weather.weather[0].description+" - "+temp+"°C");
				x.appendChild(xtext);
				div.appendChild(x);
				}
			}
			
				    xmlhttp.open("GET", "http://api.openweathermap.org/data/2.5/weather?q=paris,fr&appid=4d6ddf350eeabacd18d0fb7cd12f1a53", true);
				    xmlhttp.send();
		}
	
	
	//R E N N E S
	else if(document.getElementById("cityName").value.trim()=="rennes" | 
			document.getElementById("cityName").value.trim()=="Rennes"){
			var weather;
			var xmlhttp = new XMLHttpRequest();
		    xmlhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		    	weather = JSON.parse(this.responseText);
				var div = document.getElementById("weather_window");
				var temp = Math.round(weather.main.temp - 273.15);
				var x = document.createElement("h5");
				var xtext = document.createTextNode("Rennes: "+weather.weather[0].main+" - "+weather.weather[0].description+" - "+temp+"°C");
				x.appendChild(xtext);
				div.appendChild(x);
			}
			}
				    xmlhttp.open("GET", "http://api.openweathermap.org/data/2.5/weather?q=rennes,fr&appid=4d6ddf350eeabacd18d0fb7cd12f1a53", true);
				    xmlhttp.send();
		}
	
	//S T R A S B O U R G
	else if(document.getElementById("cityName").value.trim()=="strasbourg" | 
			document.getElementById("cityName").value.trim()=="Strasbourg"){
			var weather;
			var xmlhttp = new XMLHttpRequest();
		    xmlhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		    	weather = JSON.parse(this.responseText);
				var div = document.getElementById("weather_window");
				var temp = Math.round(weather.main.temp - 273.15);     
				var x = document.createElement("h5");
				var xtext = document.createTextNode("Strasbourg: "+weather.weather[0].main+" - "+weather.weather[0].description+" - "+temp+"°C");
				x.appendChild(xtext);
				div.appendChild(x);
			}
			}
				    xmlhttp.open("GET", "http://api.openweathermap.org/data/2.5/weather?q=strasbourg,fr&appid=4d6ddf350eeabacd18d0fb7cd12f1a53", true);
				    xmlhttp.send();
		}

	//M O N T P E L L I E R
	else if(document.getElementById("cityName").value.trim()=="montpellier" | 
		document.getElementById("cityName").value.trim()=="Montpellier"){
		var weather;
		var xmlhttp = new XMLHttpRequest();
	    xmlhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	    	weather = JSON.parse(this.responseText);
			var div = document.getElementById("weather_window");
			var temp = Math.round(weather.main.temp - 273.15);     
			var x = document.createElement("h5");
			var xtext = document.createTextNode("Montpellier: "+weather.weather[0].main+" - "+weather.weather[0].description+" - "+temp+"°C");
			x.appendChild(xtext);
			div.appendChild(x);
		}
		}
			    xmlhttp.open("GET", "http://api.openweathermap.org/data/2.5/weather?q=montpellier,fr&appid=4d6ddf350eeabacd18d0fb7cd12f1a53", true);
			    xmlhttp.send();
	}
	
}

