<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<h2>Ứng dụng Product Discount Calculator</h2>
<form method="post" action="/display-discount">
    <label>Product Description: </label><br/>
    <input type="text" name="productDescription" placeholder="Mô tả của sản phẩm " value=""/><br/>
    <label>List Price: </label><br/>
    <input type="text" name="listPrice" placeholder="Giá niêm yết của sản phẩm" value=""/><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name="discountPercent" placeholder="Tỷ lệ chiết khấu (phần trăm)" value=""/><br/>
    <input type="submit" id="submit" value="Discount Price"/>
</form>

</body>
</html>


