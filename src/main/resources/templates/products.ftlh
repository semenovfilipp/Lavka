<!DOCTYPE html>
<html>
<head>
    <title>LAVKA</title>
</head>
<body>
<h1>Лавка</h1><hr>
<h4>Покупай свежие продукты с огорода</h4>
<form action="/" method="get">
    Поиск по названию объявления: <input type="text" name="title"><br>
    <input type="submit" value="Поиск">
</form>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} ₽ | <a href="/product/${product.id}">Подробнее...</a></p>
    </div>
    <#else>
    <h3>Товаров нет</h3>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post">
    Название товара: <input type="text" name="title"/><br><br>
    Состав: <input type="text" name="description"/><br><br>
    Цена: <input type="number" name="price"/><br><br>
    Вес/гр: <input type="text" name="weight"/><br><br>
    Продавец: <input type="text" name="seller"/><br><br>

    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>