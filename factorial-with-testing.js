var areEqual = function(expected, actual) {
    return expected === actual;
};

var factorial = function(n) {
    return 1;
};

var testFactorial_1 = function(func){
    var actual = func(1);
    var expected = 1;
    return areEqual(expected, actual);
    };

testFactorial_1(factorial);