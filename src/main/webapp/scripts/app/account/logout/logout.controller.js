'use strict';

angular.module('coopApp')
    .controller('LogoutController', function (Auth) {
        Auth.logout();
    });
