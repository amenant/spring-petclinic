var gulp = require('gulp');
var Server = require('karma').Server;

/**
 * Run test once and exit
 */
gulp.task('test', function (done) {
  new Server({
    configFile: __dirname + '/src/test/webapp/js/karma.conf.js',
    singleRun: true
  }, done).start();
});

gulp.task('default', ['test']);
