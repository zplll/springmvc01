<%--
  Created by IntelliJ IDEA.
  User: kin
  Date: 2016/9/5
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>

    <script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
    <title>index</title>
  </head>
  <body ng-app="myapp" ng-controller="getJson">

  <a href="/hhh">请求hello啦</a>
   <button id="gjson" ng-click="getJsonstr()">form请求json啦</button>
  <div >result:{{resJson}}</div>
  </body>
  <script>
    angular.module("myapp",[])
            .controller("getJson",function ($scope,$http) {
             //$scope.resJson='1231';
              $scope.getJsonstr=function () {
                $http.get("/gjson").success(function (response) {

                  $scope.resJson= response.name;
                  console.log($scope.resJson);
                });
              }
            })
  </script>
</html>
