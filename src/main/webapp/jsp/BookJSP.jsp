<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/all.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <title>Books Management</title>

</head>
<body>

<h2 style="text-align: center;">Books<i style="font-size: 35px; color: lightgreen; margin-left: 10px;" class="fa-solid fa-book"></i> Management</h2>

<button class="btn add-btn" onclick="openAddBookPopup()">Add Book</button>


<table>

</table>
<!-- Popup for adding a new Book -->
<div id="addBookPopup" class="popup">
    <div class="popup-content">
        <span class="close" onclick="closeAddBookPopup()">&times;</span>
        <h3>Ajouter Membre</h3>
        <form id="addMemberForm">
            <div class="form-group">
                <label for="Author">Author:</label>
                <input type="text" id="Author" name="Author" required>
                <span id="error_Author"></span>
            </div>
            <div class="form-group">
                <label for="Title">Title:</label>
                <input type="text" id="Title" name="Title" required>
                <span id="error_Title"></span>
            </div>
            <div class="form-group">
                <label for="Edition">Edition:</label>
                <input type="text" id="Edition" name="Edition" required>
                <span id="error_Edition"></span>
            </div>
            <div class="form-group">
                <label for="Publishing-date">Publishing-date:</label>
                <input type="date" id="Publishing-date" name="Publishing-date" required>
                <span id="error_Publishing-date"></span>
            </div>
            <div class="form-group">
                <input type="submit" id="submit" value="Submit">
                <span id="error_submit"></span>
            </div>
        </form>
    </div>
</div>
<!-- Popup for Update a Book -->
<div id="UpdateBookFormPopup" class="popup">
    <div class="popup-content">
        <span class="close" onclick="closeUpdateBookFormPopup()">&times;</span>
        <h3>Ajouter Membre</h3>
        <form id="addMemberForm">
            <div class="form-group">
                <label for="Author">Author:</label>
                <input type="text" id="Author" name="Author" required>
                <span id="error_Author"></span>
            </div>
            <div class="form-group">
                <label for="Title">Title:</label>
                <input type="text" id="Title" name="Title" required>
                <span id="error_Title"></span>
            </div>
            <div class="form-group">
                <label for="Edition">Edition:</label>
                <input type="text" id="Edition" name="Edition" required>
                <span id="error_Edition"></span>
            </div>
            <div class="form-group">
                <label for="Publishing-date">Publishing-date:</label>
                <input type="date" id="Publishing-date" name="Publishing-date" required>
                <span id="error_Publishing-date"></span>
            </div>
            <div class="form-group">
                <input type="submit" id="submit" value="Submit">
                <span id="error_submit"></span>
            </div>
        </form>
    </div>
</div>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Author</th>
            <th>Title</th>
            <th>Edition</th>
            <th>Publishing Date</th>
            <th>Action</th>

        </tr>
    </thead>
    <tbody>
    <c:forEach items="${TousLivrs.livres}" var="liv">
   
        <tr>
            <td>${liv.id}</td>
            <td>To Kill a Mockingbird</td>
            <td>Harper Lee</td>
            <td>First Edition</td>
            <td>1960-07-11</td>
            <td><button class="btn" onclick="openUpdateBookFormPopup()">Update</button> <button id="delete-button" class="btn">Delete</button></td>
        </tr>
        
      </c:forEach>
        <!-- Additional rows for more members can be added here -->
    </tbody>
</table>

<script src="../js/Book.js"></script>
</body>
</html>
    