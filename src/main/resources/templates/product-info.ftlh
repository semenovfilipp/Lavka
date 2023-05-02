<!DOCTYPE html>
<html>
<head>
    <title>LAVKA</title>
</head>
<body>
<h1>Лавка</h1><hr>
<h4>Подробная информация о товаре</h4>
<b>Название товара: </b>${product.title}<br>
<b>Состав: </b>${product.description}<br>
<b>Цена: </b>${product.price} ₽<br>
<b>Вес/гр: </b>${product.weight} гр<br>
<b>Продавец: </b>${product.seller}<br>
<hr>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="Удалить товар"/>
</form>
</body>
</html>