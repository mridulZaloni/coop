'use strict';

angular.module('coopApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


