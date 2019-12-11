<%-- 
    Document   : client
    Created on : 10 déc. 2019, 11 h 55 min 56 s
    Author     : Fanny
--%>
<jsp:include page="header.jsp">
    <jsp:param name="title" value="Se connecter"/>
</jsp:include>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container" id="listVendeur" style="width: 75%; margin-top: 5px;
     padding-top : 2%;">
    <div class="row">
        <div class="col">
            <h3>Articles disponibles</h3>
            <table class="table table-striped" id="tableauArticle">
                <tbody>
                    <tr>
                        <th id="productName">Pommes</th>
                        <td id="productUnit">5</td>
                        <td id="productUnitPrice">5 CAD</td>
                        <td><button class="btn btn-success" type="button" id="btnAdd" data-toggle="modal">+</button>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="col">
            <h3>Panier</h3>
            <table class="table table-striped" id="tableauPanier">
                <tbody>
                    <tr>
                        <th id="productName">Pommes</th>
                        <td id="productUnit">5</td>
                        <td id="productUnitPrice">5 CAD</td>
                        <td><button class="btn btn-danger" type="button" id="btnSuprimer"
                                    data-toggle="modal">-</button></td>
                    </tr>
                </tbody>
            </table>
        </div>

    </div>
    <div class="row">
        <div class="col align-self-end" >
            <button class="btn btn-success" type="button" id="btnPayer" data-toggle="modal">Payer</button>
        </div>
    </div>
</div>