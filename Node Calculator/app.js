const express = require('express')
var alert = require('alert');

var app = express()
app.set('view engine','ejs')
app.use(express.static(__dirname+ '/public'))




app.get('/', (req,res)=>{
	alert("Enter the date in the form dd/mm/yyyy");
	res.render('home')
})


app.listen(3000,()=>{
	console.log("The port is listening at 3000")
})