describe('Functional Test for Pets', function() {

    beforeEach(function() {
        browser.get("http://localhost:8080/#/");
        element(by.cssContainingText('.btn','Sign In')).click();
        element.all(by.cssContainingText('a[href="#/pets"]','Pets')).first().click();
    });

    describe('View Pets Menu', function() {

        it('should have a display a list of pets', function() {
            var pets = element.all(by.repeater('pet in pets'));

            expect(pets.count()).toEqual(13);
        });
    });

});