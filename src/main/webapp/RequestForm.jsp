<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create a request</title>
</head>

<body>
    <div class="container">
        <form:form method="POST" modelAttribute="requestForm">
            <table>
                <tr>
                    <td>
                        <form:label path="url">Website</form:label>
                    </td>
                    <td>
                        <form:input path="url" placeholder="The address of the page" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="elementXPath">XPath</form:label>
                    </td>
                    <td>
                        <form:input path="elementXPath" placeholder="Xpath of the element" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="email">Email</form:label>
                    </td>
                    <td>
                        <form:input path="email" placeholder="Your email address" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="date">When would you like to end your request?</form:label>
                    </td>
                    <td>
                        <form:input type="date" path="date" />
                    </td>
                </tr>
            </table>
        </form:form>
    </div>


</body>

</html>