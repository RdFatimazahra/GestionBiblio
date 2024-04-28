<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/all.css">
    <title>Member Management</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>

<h2 style="text-align: center;">Member <i style="color: lightgreen; font-size: 35px;" class="fa-solid fa-user-pen"></i> Management</h2>

<button class="btn add-btn" onclick="openAddMemberPopup()">Ajouter</button>

<div id="addMemberPopup" class="popup">
    <div class="popup-content">
        <span class="close" onclick="closeAddMemberPopup()">&times;</span>
        <h3>Ajouter Membre</h3>
        <form id="addMemberForm" action="ServletMembre" method="post">
            <div class="form-group">
                <label for="nom">Nom:</label>
                <input type="text" id="nom" name="nom" required>
            </div>
            <div class="form-group">
                <label for="prenom">Prénom:</label>
                <input type="text" id="prenom" name="prenom" required>
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <input type="text" id="address" name="address" required>
            </div>
            <div class="form-group">
                <label for="telephone">Téléphone:</label>
                <input type="text" id="telephone" name="telephone" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="text" id="email" name="email" required>
            </div>
            <!-- Hidden input field to store action value -->
            <input type="hidden" name="action" value="add">
            <div class="form-group">
                <input type="submit" value="Ajouter">
            </div>
        </form>
    </div>
</div>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Address</th>
            <th>Téléphone</th>
            <th>Email</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${members}" var="member">
            <tr>
                <td>${member.id}</td>
                <td>${member.nom}</td>
                <td>${member.prenom}</td>
                <td>${member.address}</td>
                <td>${member.telephone}</td>
                <td>${member.email}</td>
                <td>
                    <!-- Add JavaScript functions for update and delete actions -->
                    <button class="btn" onclick="openUpdateMemberPopup(${member.id})">Modifier</button>
                    <button class="btn" onclick="deleteMember(${member.id})">Supprimer</button>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<script src="../js/member.js"></script>
</body>
</html>