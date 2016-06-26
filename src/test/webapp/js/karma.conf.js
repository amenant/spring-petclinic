module.exports = function(config) {
    config.set({
        basePath: '../../../..',
        frameworks: ['jasmine'],
        files: [
            // These are the app files
            { pattern: "src/main/webapp/plugins/jquery/jquery-2.1.0.min.js", watched: false },
            { pattern: "src/main/webapp/plugins/jquery-ui/jquery-ui.min.js", watched: false },
            { pattern: "src/main/webapp/js/lib/bootstrap.js", watched: false },
            { pattern: "src/main/webapp/plugins/bootstrap-datepicker/bootstrap-datepicker.js", watched: false },
            { pattern: "src/main/webapp/js/lib/angular.js", watched: false },
            { pattern: "src/main/webapp/js/lib/angular-resource.js", watched: false },
            { pattern: "src/main/webapp/js/lib/angular-ui-router.js", watched: false },
            { pattern: "src/main/webapp/js/lib/angular-ui-router-statehelper.js", watched: false },
            { pattern: "src/main/webapp/js/lib/angular-animate.js", watched: false },
            { pattern: "src/main/webapp/js/lib/angular-cookies.js", watched: false },
            { pattern: "src/main/webapp/js/lib/angular-storage.js", watched: false },
            { pattern: "src/main/webapp/js/lib/angular-mocks.js", watched: false },
            { pattern: "src/main/webapp/services/services.js", watched: false },
            { pattern: "src/main/webapp/components/main/MainController.js", watched: false },
            { pattern: "src/main/webapp/components/veterinarians/VeterinarianController.js", watched: false },
            { pattern: "src/main/webapp/components/pets/PetController.js", watched: false },
            { pattern: "src/main/webapp/components/owners/OwnerController.js", watched: false },
            { pattern: "src/main/webapp/components/visits/VisitController.js", watched: false },
            { pattern: "src/main/webapp/components/dashboard/DashboardController.js", watched: false },
            { pattern: "src/main/webapp/components/_partials/SearchController.js", watched: false },
            { pattern: "src/main/webapp/components/directives/DatePickerDirective.js", watched: false },
            { pattern: "src/main/webapp/js/app.js", watched: false },

            // These are the test specs
            "src/test/webapp/services/servicesSpec.js",
            "src/test/webapp/components/OwnerControllerSpec.js"
        ],
        exclude: ['src/test/javascript/karma.conf*.js'],
        reporters: ['progress'],
        port: 9876,
        logLevel: config.LOG_INFO,
        browsers: ['PhantomJS'],
        singleRun: false,
        autoWatch: true,
        plugins: [
            'karma-jasmine',
            'karma-phantomjs-launcher'
        ]
    });
};
