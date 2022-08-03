//var message = 'Hello, World!';
//console.log(message);
var array = [103, 501, 7002];
var results = function (array) {
    for (var i = 0; i < array.length; i++) {
        while (array[i] > 0) {
            if (array[i] % 10 != 7) {
                array[i] = (array[i] - array[i] % 10) / 10;
            }
            else
                return "Boom!";
        }
    }
    return "there is no 7 in the array";
};
console.log(results(array));
