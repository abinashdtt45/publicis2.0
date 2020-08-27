var weekdays = new Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
Date.prototype.getWeekNumber = function() {
    var oneJan = new Date(this.getFullYear(), 0, 1);
    // calculating number of days  
    //in given year before given date 
    var numberOfDays = Math.floor((this - oneJan) / (24 * 60 * 60 * 1000));
    // adding 1 since this.getDay() 
    //returns value starting from 0 
    return Math.ceil((this.getDay() + 1 + numberOfDays) / 7);
}

function cls(val) {
    document.getElementById("display").value = val;
}

function math(val) {
    document.getElementById("display").value += val;
}

function equal() {
    try {
        var string = document.getElementById("display").value;

        if(string.includes("-")){
            var type = document.getElementById("type").value;
            console.log(type);
            if(type==0){
                var types = string.split("-");
                var first = types[0];
                var second = types[1];
                tokens1 = first.split("/");
                tokens2 = second.split("/");
                var date1 = new Date(tokens1[2], tokens1[1] - 1, tokens1[0]);
                var date2 = new Date(tokens2[2], tokens2[1] - 1, tokens2[0]);
                var diffTime = Math.abs(date2 - date1);
                const diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24)); 
                cls(diffDays);
            }else if(type==1){
                var types = string.split("-");
                var first = types[0];
                var second = types[1];
                tokens = first.split("/");
                console.log(first);
                console.log(second);
                var date = new Date(tokens[2], tokens[1] - 1, tokens[0]);
                console.log(date);
                date.setDate(date.getDate()-second);
                console.log(date);
                cls(date);

            }else if(type==2){
                var types = string.split("-");
                var first = types[0];
                var second = types[1];
                tokens = first.split("/");
                console.log(first);
                console.log(second);
                var date = new Date(tokens[2], tokens[1] - 1, tokens[0]);
                console.log(date);
                date.setDate(date.getDate()-second*7);
                console.log(date);
                cls(date);

            }else if(type==3){
                var types = string.split("-");
                var first = types[0];
                var second = types[1];
                tokens = first.split("/");
                console.log(first);
                console.log(second);
                var date = new Date(tokens[2], tokens[1] - 1, tokens[0]);
                console.log(date);
                date.setDate(date.getDate()-second*30);
                console.log(date);
                cls(date);

            }else{

                var types = string.split("-");
                var first = types[0];
                var second = types[1];
                tokens = first.split("/");
                console.log(first);
                console.log(second);
                var date = new Date(tokens[2], tokens[1] - 1, tokens[0]);
                console.log(date);
                date.setDate(date.getDate()-second*365);
                console.log(date);
                cls(date);
            }
        }else{
            var type = document.getElementById("type").value;
            console.log(type);
            if(type==0){
                cls(Error);
                cls(diffDays);
            }else if(type==1){
                var types = string.split("+");
                var first = types[0];
                var second = types[1];
                tokens = first.split("/");
                console.log(first);
                console.log(second);
                var date = new Date(tokens[2], tokens[1] - 1, tokens[0]);
                console.log(date);
                date.setDate(date.getDate()-second*-1);
                console.log(date);
                cls(date);

            }else if(type==2){
                var types = string.split("+");
                var first = types[0];
                var second = types[1];
                tokens = first.split("/");
                console.log(first);
                console.log(second);
                var date = new Date(tokens[2], tokens[1] - 1, tokens[0]);
                console.log(date);
                date.setDate(date.getDate()-second*-7);
                console.log(date);
                cls(date);

            }else if(type==3){
                var types = string.split("+");
                var first = types[0];
                var second = types[1];
                tokens = first.split("/");
                console.log(first);
                console.log(second);
                var date = new Date(tokens[2], tokens[1] - 1, tokens[0]);
                console.log(date);
                date.setDate(date.getDate()-second*-30);
                console.log(date);
                cls(date);

            }else{

                var types = string.split("+");
                var first = types[0];
                var second = types[1];
                tokens = first.split("/");
                console.log(first);
                console.log(second);
                var date = new Date(tokens[2], tokens[1] - 1, tokens[0]);
                console.log(date);
                date.setDate(date.getDate()-second*-365);
                console.log(date);
                cls(date);
            }



        }
    } catch (equal) {
        cls('Error')
    }
}

function del() {
    var value = document.getElementById("display").value;
    document.getElementById("display").value = value.substr(0, value.length - 1);
}

function findWeek() {
    var value = document.getElementById("display").value;
    var tokens = value.split("/");
    var date = new Date(tokens[2], tokens[1] - 1, tokens[0]);
    cls(date.getWeekNumber())
}

function findDay() {
    try {
        var value = document.getElementById("display").value;
        var tokens = value.split("/");
        var date = new Date(tokens[2], tokens[1] - 1, tokens[0]);
        cls(weekdays[date.getDay()])
    } catch (equal) {
        cls('Error')
    }
}