/*
comment
*/

// alert('Fuck');

let fullURL = "http://localhost:8080"; // volledige link afmaken nog
let getURL = "/";

function testKnop() {
    console.log('testKnop aangeklikt');
    document.getElementById('par').innerHTML = 'Nu is het veranderd.';
}

function geefLijst() {
    // iets met GET ofzo jQuery


}

$(document).ready(function () {
    $("button").click(function () {
        let mijnHeaders = new Headers();
        mijnHeaders.append('Access-Control-Allow-Origin', 'http://localhost:8080');
        //$("h1").hide();
        $.ajax({
            //console.log('GET GUD'); kan dit hier ubrhaupt?
            type: 'GET',
            url: getURL,
            //data: data,
            //success: function(data){
            //console.log('het is gelukt, data: ', data);},
            crossDomain: true,
            dataType: 'jsonp',
            headers: mijnHeaders
        });
    });
});