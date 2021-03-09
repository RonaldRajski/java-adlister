<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<% counter += 1; %>
<html>
<head>

    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/all.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="css/custom.css">
    <title>Pizza form</title>




</head>



<body>



<input action="/pizza-order" method="post">

    <br>

    <select name="crust_types" id="crust_types">
        <option value="rising_crust">Rising</option>
        <option value="thin_crust">Thin</option>
        <option value="stuffed_crust">Stuffed</option>
    </select>
    <br>

    <select name="sauce_types" id="sauce_types">
        <option value="pesto">Pesto</option>
        <option value="three_cheese">3 Cheese</option>
        <option value="marinara">Marinara</option>
        <option value="bbq">BBQ</option>
    </select>
    <br>

    <select name="size" id="size">
        <option value="small">small</option>
        <option value="medium">Medium</option>
        <option value="large">large</option>
        <option value="extra-large">X-Large</option>
    </select>
    <br>

    <h2>Toppings</h2>



<label for="sausage">Sausage</label><input name =toppings id="sausage" type="checkbox" value ="sausage">
    <br>
<label for="pineapple">pineapple</label><input name =toppings id="pineapple" type="checkbox" value ="pineapple">
    <br>
<label for="olives">Olives</label><input name =toppings id="olives" type="checkbox" value ="olives">
    <br>
<label for="basil">Basil</label><input name =toppings id="basil" type="checkbox" value ="basil">
    <br>
<label for="anchovies">Anchovies</label><input name =toppings id="anchovies" type="checkbox" value ="anchovies">
    <br>
<label for="mushrooms">Mushrooms</label><input name =toppings id="mushrooms" type="checkbox" value ="mushrooms">
<br>

<label for="address">Address</label>
<input id="address" name="address "type="text">
<br>

<input type="submit" value="Place Order">


</form>











</body>
</html>