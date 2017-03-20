var app = angular.module("app", []);
app.controller("appCtrl", function($scope, $http){
	$scope.teste = "OI";
	
	$scope.tiposNegocio = [] ;
	
	$scope.tiposMercadoria = [];
	
	$scope.cadastrarProduto = function (produto){
		$http({
			url:'Cadastro',
			method: 'POST',
			data: produto
		}).then(function(result){
			if(result.data == 'true')
				bootbox.alert("Cadastrado com Sucesso!");
			else
				bootbox.alert("Falha no Cadastro!");
		});
	}
	
	$scope.carregarTipoNegocio = function (){
		$http({
			url:'Cadastro',
			method: 'POST',
			data: 'negocio'
		}).then(function(result){
			angular.forEach(result.data, function(item, index) {
				$scope.tiposNegocio.push({Id: index, Nome:item});
			});
			
		});
	}
	
	$scope.carregarTipoMercadoria = function (){
		$http({
			url:'Cadastro',
			method: 'POST',
			data: 'mercadoria'
		}).then(function(result){
			angular.forEach(result.data, function(item, index) {
				$scope.tiposMercadoria.push({Id:index, Nome:item});
			});
		});
	}
	
	$scope.carregarTipoNegocio();
	$scope.carregarTipoMercadoria();
});