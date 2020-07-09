<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <title>Create a request</title>
</head>

<body>

    <nav class="navbar navbar-dark bg-dark">
        <a class="navbar-brand" href="#">HTML-ECN</a>
        <button class="btn btn-outline-info my-2 my-sm-0" href="https://github.com/muhammetarslan">About me</a>
    </nav>


    <div class="container">
        <div class="card text-center">
            <form:form method="POST" class="form-group" modelAttribute="requestForm">
                <table>
                    <tr>
                        <td>
                            <form:label path="url">Website</form:label>
                        </td>
                        <td>
                            <form:input path="url" placeholder="The address of the page" class="form-control" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="elementXPath">XPath</form:label>
                        </td>
                        <td>
                            <form:input path="elementXPath" placeholder="Xpath of the element" class="form-control" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="disappearOfTheElement">What change do you
                                want to track?</form:label>
                        </td>
                        <td>
                            <form:select path="disappearOfTheElement">
                                <option value="disappear">Disappear of the element</option>
                                <option value="appear">Appearance of the element</option>
                            </form:select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="email">Email</form:label>
                        </td>
                        <td>
                            <form:input path="email" placeholder="Your email address" class="form-control" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="date">When would you like to end your
                                request?</form:label>
                        </td>
                        <td>
                            <form:input type="date" path="date" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input id="submit" type="submit" value="Submit" class="btn btn-outline-primary">
                        </td>
                    </tr>

                </table>
            </form:form>
        </div>
    </div>

    <script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
</body>

</html>