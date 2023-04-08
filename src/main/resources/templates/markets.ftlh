<!DOCTYPE html>
<html>
<head>
    <title>
        markets
    </title>
</head>

<body>
<h1>Markets</h1><hr>
<#list markets as market>
    <div>
        <p>
          <b>  ${market.name}</b> ${market.city} | <a href="/market/${market.id}"> Подробнее</a>
        </p>
    </div>
</#list>

<hr>
<h3> Добавить новый магазин</h3>
<form action="/market/create" method="post">
Название магазина: <input type="text" name="name"/> <br><br>
Город: <input type="text" name="city"/> <br><br>
Улица: <input type="text" name="street"/> <br><br>
Дом: <input type="number" name="house"/> <br><br>
Время открытия: <input type="number" name="timeOfopen"/> <br><br>
Время закрытия: <input type="number" name="timeOfclosed"/> <br><br>
    <input type="submit" value="Добавить магазин"/>

</form>
</body>
</html>