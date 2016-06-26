describe('Owner-related Controllers', function() {
    var $controller;
    var Owner;

    beforeEach(module('spring-petclinic'));

    beforeEach(inject(function(_$controller_, _Owner_){
        // The injector unwraps the underscores (_) from around the parameter names when matching
        $controller = _$controller_;
        Owner = _Owner_;
    }));

    describe('OwnerController', function() {
        it('contains the owners in the system', function() {
            var $scope = {};
            $scope.$on = function() {}
            var controller = $controller('OwnerController', { $scope: $scope });
            expect($scope.owners).not.toBeNull();
        });
    });

    describe('OwnerDetailsController', function() {
        var $scope;
        var controller;

        beforeEach(function() {
            $scope = {};
            controller = $controller('OwnerDetailsController', { $scope: $scope, Owner: Owner});
        })

        it('contains previous, next and current owners', function() {
            expect($scope.prevOwner).not.toBeNull();
            expect($scope.nextOwner).not.toBeNull();
            expect($scope.currentOwner).not.toBeNull();
        });

        it('will save the current owner', function() {
            expect(Owner).not.toBeNull();
            spyOn(Owner, 'save');
            $scope.saveOwner();
            expect(Owner.save).toHaveBeenCalledWith($scope.currentOwner);
        });

    });

})
