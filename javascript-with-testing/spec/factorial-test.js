describe("should expect 1", function(func){
	it("for 1", function() {
		var actual = func(1);
		expect(response).toBe(1);
		return areEqual(expected, actual);
	};

	testFactorial_1(factorial);