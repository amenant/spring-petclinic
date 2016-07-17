module.exports = function(grunt) {
    grunt.initConfig({
      protractor: {
        options: {
          configFile: "src/test/resources/protractor.conf.js", // Default config file
          keepAlive: true, // If false, the grunt process stops when the test fails.
          noColor: false, // If true, protractor will not use colors in its output.
          webdriverManagerUpdate: true,
          args: {
            // Arguments passed to the command
          }
        },
      },

      protractor_webdriver: {
        update: {
          options: {
            path: 'node_modules/protractor/bin/',
            command: 'webdriver-manager update',
          }
        },
        start: {
          options: {
            path: 'node_modules/protractor/bin/',
            command: 'webdriver-manager start',
          }
        },
      },


    });

    /**
     * Loads the grunt tasks for running selenium and protractor
     */
    grunt.loadNpmTasks('grunt-protractor-runner');

    // Grunt task for functional testing
    grunt.registerTask('functional-test', ['protractor']);
}