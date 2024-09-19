<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bootstrap Form</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>Sample Form</h2>
    <div class="alert alert-danger" role="alert">
 <form:errors path="student.*"/>
</div>
    <form action="process" >
        <div class="form-group">
            <label for="name-id-long">Name</label>
            <input type="text" name="name" class="form-control" id="name-id-long" placeholder="Enter your name">
        </div>
        
         <div class="form-group">
            <label for="name-id-long">Id</label>
            <input type="id" name="id" class="form-control" id="email-id-long" placeholder="Enter your email">
        </div>
        <div class="form-group">
            <label for="date">Date</label>
            <input type="text" name="dob" class="form-control" id="date" placeholder="Enter date">
        </div>
        <div class="form-group">
            <label for="courses" >Courses</label>
            <select class="form-control" id="courses name="courses">
                <option>Java</option>
                <option>Python</option>
                <option>HTML</option>
                <option>CSS</option>
                <option>Angular</option>
            </select>
        </div>
        <div class="form-group">
            <label>Gender</label>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="genderMale"  value="male">
                <label class="form-check-label" for="genderMale">Male</label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="genderFemale" value="female">
                <label class="form-check-label" for="genderFemale">Female</label>
            </div>
        </div>
        <div class="form-group">
            <label for="type">Type</label>
            <select class="form-control" id="type" name="type">
                <option>Old</option>
                <option>New</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
