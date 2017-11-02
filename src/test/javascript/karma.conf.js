// Karma configuration
// http://karma-runner.github.io/0.10/config/configuration-file.html

module.exports = function (config) {
    config.set({
        // base path, that will be used to resolve files and exclude
        basePath: '../../',

        // testing framework to use (jasmine/mocha/qunit/...)
        frameworks: ['jasmine'],

        // list of files / patterns to load in the browser
        files: [
            // bower:js
            'main/webapp/bower_components/jquery/dist/jquery.js',
            'main/webapp/bower_components/jquery-bridget/jquery-bridget.js',
            'main/webapp/bower_components/json3/lib/json3.js',
            'main/webapp/bower_components/angular/angular.js',
            'main/webapp/bower_components/angular-ui-router/release/angular-ui-router.js',
            'main/webapp/bower_components/angular-resource/angular-resource.js',
            'main/webapp/bower_components/angular-cookies/angular-cookies.js',
            'main/webapp/bower_components/angular-aria/angular-aria.js',
            'main/webapp/bower_components/angular-sanitize/angular-sanitize.js',
            'main/webapp/bower_components/angular-animate/angular-animate.js',
            'main/webapp/bower_components/angular-translate/angular-translate.js',
            'main/webapp/bower_components/angular-translate-storage-cookie/angular-translate-storage-cookie.js',
            'main/webapp/bower_components/angular-translate-loader-partial/angular-translate-loader-partial.js',
            'main/webapp/bower_components/angular-cache-buster/angular-cache-buster.js',
            'main/webapp/bower_components/angular-messages/angular-messages.js',
            'main/webapp/bower_components/angular-material/angular-material.js',
            'main/webapp/bower_components/angular-fontawesome/dist/angular-fontawesome.js',
            'main/webapp/bower_components/moment/moment.js',
            'main/webapp/bower_components/moment-timezone/builds/moment-timezone-with-data-2010-2020.js',
            'main/webapp/bower_components/angular-datepicker/dist/angular-datepicker.js',
            'main/webapp/bower_components/angular-ui-grid/ui-grid.js',
            'main/webapp/bower_components/jquery-ui/jquery-ui.js',
            'main/webapp/bower_components/angular-ui-sortable/sortable.js',
            'main/webapp/bower_components/angular-rangeslider/angular.rangeSlider.js',
            'main/webapp/bower_components/showdown/dist/showdown.js',
            'main/webapp/bower_components/angular-markdown-filter/markdown.js',
            'main/webapp/bower_components/angular-input-stars/angular-input-stars.js',
            'main/webapp/bower_components/angular-color-this/dist/angular-color-this.js',
            'main/webapp/bower_components/angular-color-this/dist/angular-color-this.min.js',
            'main/webapp/bower_components/blob-polyfill/Blob.js',
            'main/webapp/bower_components/file-saver.js/FileSaver.js',
            'main/webapp/bower_components/angular-file-saver/dist/angular-file-saver.bundle.js',
            'main/webapp/bower_components/tinycolor/tinycolor.js',
            'main/webapp/bower_components/angular-color-picker/dist/angularjs-color-picker.js',
            'main/webapp/bower_components/angular-local-storage/dist/angular-local-storage.js',
            'main/webapp/bower_components/angular-toArrayFilter/toArrayFilter.js',
            'main/webapp/bower_components/vis/dist/vis.js',
            'main/webapp/bower_components/angular-visjs/angular-vis.js',
            'main/webapp/bower_components/angular-scroll-when/dist/angular-scroll-when.min.js',
            'main/webapp/bower_components/lodash/lodash.js',
            'main/webapp/bower_components/d3/d3.js',
            'main/webapp/bower_components/ng-file-upload/ng-file-upload.js',
            'main/webapp/bower_components/dygraphs/dygraph-combined.js',
            'main/webapp/bower_components/d3-tip/index.js',
            'main/webapp/bower_components/v-accordion/dist/v-accordion.js',
            'main/webapp/bower_components/ui-grid-draggable-rows/js/draggable-rows.js',
            'main/webapp/bower_components/angular-moment/angular-moment.js',
            'main/webapp/bower_components/trix/dist/trix.js',
            'main/webapp/bower_components/angular-trix/dist/angular-trix.js',
            'main/webapp/bower_components/angular-dynamic-locale/src/tmhDynamicLocale.js',
            // endbower
            'main/webapp/scripts/app/app.js',
            'main/webapp/scripts/app/**/*.js',
            'main/webapp/scripts/components/**/*.js',
            'test/javascript/**/!(karma.conf).js'
        ],


        // list of files / patterns to exclude
        exclude: [],

        // web server port
        port: 9876,

        // level of logging
        // possible values: LOG_DISABLE || LOG_ERROR || LOG_WARN || LOG_INFO || LOG_DEBUG
        logLevel: config.LOG_INFO,

        // enable / disable watching file and executing tests whenever any file changes
        autoWatch: false,

        // Start these browsers, currently available:
        // - Chrome
        // - ChromeCanary
        // - Firefox
        // - Opera
        // - Safari (only Mac)
        // - PhantomJS
        // - IE (only Windows)
        browsers: ['PhantomJS'],

        // Continuous Integration mode
        // if true, it capture browsers, run tests and exit
        singleRun: false
    });
};
