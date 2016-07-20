module.exports = function(grunt) {
    grunt.initConfig({
      protractor: {
        options: {
          configFile: "node_modules/protractor/example/conf.js", // Default config file
          keepAlive: false, // If false, the grunt process stops when the test fails.
          noColor: false, // If true, protractor will not use colors in its output.
          webdriverManagerUpdate: true
        },
        all: {   // Grunt requires at least one target to run so you can simply put 'all: {}' here too.
          options: {
            configFile: "src/test/resources/protractor.conf.js", // Target-specific config file
            args: {} // Target-specific arguments
          }
        }
      }
    });

    /**
     * Loads the grunt tasks for running selenium and protractor
     */
    grunt.loadNpmTasks('grunt-protractor-runner');

    // Grunt task for functional testing
    grunt.registerTask('functional-test', ['protractor']);
}