describe('Unit Testing Services', function() {
    beforeEach(module('spring-petclinic'));

    describe('Owner', function() {

        it('should have a Owner service', inject(function(Owner) {
            expect(Owner.get).toBeDefined();
            expect(Owner.save).toBeDefined();
            expect(Owner.query).toBeDefined();
        }));
    });

    describe('Pet', function() {

        it('should have a Pet service', inject(function(Pet) {
            expect(Pet.get).toBeDefined();
            expect(Pet.save).toBeDefined();
            expect(Pet.query).toBeDefined();
        }));
    });

    describe('Vet', function() {

        it('should have a Vet service', inject(function(Vet) {
            expect(Vet.get).toBeDefined();
            expect(Vet.save).toBeDefined();
            expect(Vet.query).toBeDefined();
        }));
    });
});