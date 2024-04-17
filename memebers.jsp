<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Member Management</title>
    <style>
        /* CSS styles */
    </style>
</head>
<body>

<h2>Member Management</h2>

<button class="btn add-btn" onclick="openPopup()">Ajouter</button>

<!-- Popup for adding a new member -->
<div id="addMemberPopup" class="popup">
    <div class="popup-content">
        <span class="close" onclick="closePopup()">&times;</span>
        <h3>Ajouter Membre</h3>
        <form id="addMemberForm" onsubmit="return validateForm()">
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" id="firstName" name="firstName" required>
                <span id="error_firstname"></span>
            </div>
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" id="lastName" name="lastName" required>
                <span id="error_lastname"></span>
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <input type="text" id="address" name="address" required>
                <span id="error_address"></span>
            </div>
            <div class="form-group">
                <label for="tele">Telephone:</label>
                <input type="text" id="tele" name="tele" required>
                <span id="error_tele"></span>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="text" id="email" name="email" required>
                <span id="error_email"></span>
            </div>
            <div class="form-group">
                <input type="submit" id="submit" value="Submit">
                <span id="error_submit"></span>
            </div>
        </form>
    </div>
</div>

<table>
    <!-- Table content -->
</table>

<!-- JavaScript code -->
<script>
    function openPopup() {
        document.getElementById("addMemberPopup").style.display = "block";
        document.body.style.overflow = "hidden"; /* Disable scrolling on body when popup is open */
    }

    function closePopup() {
        document.getElementById("addMemberPopup").style.display = "none";
        document.body.style.overflow = "auto"; /* Enable scrolling on body when popup is closed */
    }

    function validateForm() {
        var firstName = document.getElementById("firstName").value.trim();
        var lastName = document.getElementById("lastName").value.trim();
        var address = document.getElementById("address").value.trim();
        var tele = document.getElementById("tele").value.trim();
        var email = document.getElementById("email").value.trim();

        // Check if any required field is empty
        if (firstName === "" || lastName === "" || address === "" || tele === "" || email === "") {
            alert("Please fill out all required fields.");
            return false; // Prevent form submission
        }
        
        // Additional validation logic can be added here
        
        return true; // Allow form submission
    }

    // Event listeners for input fields
    document.getElementById("firstName").addEventListener("blur", function() {
        var firstNameInput = document.getElementById("firstName");
        var firstNameValue = firstNameInput.value.trim();

        if (firstNameValue === "") {
            firstNameInput.style.borderColor = "red";
            document.getElementById("error_firstname").innerText = "First Name is Required";
        } else {
            firstNameInput.style.borderColor = ""; // Reset border color
            document.getElementById("error_firstname").innerText = ""; // Reset error message
        }
    });

    document.getElementById("lastName").addEventListener("blur", function() {
        var lastNameInput = document.getElementById("lastName");
        var lastNameValue = lastNameInput.value.trim();

        if (lastNameValue === "") {
            lastNameInput.style.borderColor = "red";
            document.getElementById("error_lastname").innerText = "Last Name is Required";
        } else {
            lastNameInput.style.borderColor = ""; // Reset border color
            document.getElementById("error_lastname").innerText = ""; // Reset error message
        }
    });

    document.getElementById("address").addEventListener("blur", function() {
        var addressInput = document.getElementById("address");
        var addressValue = addressInput.value.trim();

        if (addressValue === "") {
            addressInput.style.borderColor = "red";
            document.getElementById("error_address").innerText = "Address is Required";
        } else {
            addressInput.style.borderColor = ""; // Reset border color
            document.getElementById("error_address").innerText = ""; // Reset error message
        }
    });

    document.getElementById("tele").addEventListener("blur", function() {
        var teleInput = document.getElementById("tele");
        var teleValue = teleInput.value.trim();

        if (teleValue === "") {
            teleInput.style.borderColor = "red";
            document.getElementById("error_tele").innerText = "Telephone is Required";
        } else {
            teleInput.style.borderColor = ""; // Reset border color
            document.getElementById("error_tele").innerText = ""; // Reset error message
        }
    });

    document.getElementById("email").addEventListener("blur", function() {
        var emailInput = document.getElementById("email");
        var emailValue = emailInput.value.trim();

        if (emailValue === "") {
            emailInput.style.borderColor = "red";
            document.getElementById("error_email").innerText = "Email is Required";
        } else {
            emailInput.style.borderColor = ""; // Reset border color
            document.getElementById("error_email").innerText = ""; // Reset error message
        }
    });
</script>

</body>
</html>

