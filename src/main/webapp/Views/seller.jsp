<%-- 
    Document   : seller
    Created on : 10 déc. 2019, 11 h 36 min 56 s
    Author     : Fanny
--%>

<jsp:include page="header.jsp">
    <jsp:param name="title" value="Accueil"/>
</jsp:include>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container" id="addVendeur" style="width: 50%; margin-top: 5px;
     padding-top : 2%;">
    <div class="row" >
        <div class="col"><input type="text" class="form-control" id="newProductName" style="width: 300px;"></div>
        <div class="col"><input type="number" id="newProductQuantity" style="width: 50px;" /> Unité</div>
        <div class="col"><input type="number" id="neProductPrice" style="width: 50px;" /> CAD</div>
        <div class="col"><button class="btn btn-success" type="button" id="btnAjouter" data-toggle="modal">Ajouter</button></div>
    </div>
</div>
<div class="container" id="listVendeur" style="width: 50%; margin-top: 5px;
     padding-top : 2%;">
    <table class="table table-striped">
        <tbody>
            <tr>
                <th id="productName">Pommes</th>
                <td id="productUnit">5</td>
                <td id="productUnitPrice">5 CAD</td>
            </tr>
        </tbody>
    </table>
</div>
