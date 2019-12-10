<%-- 
    Document   : clientBill
    Created on : 10 déc. 2019, 11 h 59 min 18 s
    Author     : Fanny
--%>
<jsp:include page="header.jsp">
    <jsp:param name="title" value="Se connecter"/>
</jsp:include>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container" id="listVendeur" style="width: 50%; margin-top: 5px;
        padding-top : 2%;">
        <div class="row">
            <div class="col">
                <h3>Facture</h3>
                <table class="table table-striped" id="tableauArticle">
                    <tbody>
                        <tr>
                            <th id="productName">Pommes</th>
                            <td id="productUnit">5</td>
                            <td id="productUnitTotal">5 CAD
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>

        </div>
        <div class="row">
            <div class="col align-self-end">
                <button class="btn btn-danger" type="button" id="btnRetour" data-toggle="modal">Retour</button>
            </div>
        </div>
    </div>
