<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>List Todos Page</title>
    </head>
    <body>
        <h1>Welcome ${name}}!</h1>
        <h1>Your Todos are ${todos}!</h1>
        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>Description</th>
                    <th>Target date</th>
                    <th>Is Done?</th>
                </tr>
            </thead>
        </table>
        <c:forEach items="${todos}" var="todo">
            <tbody>
                <tr>
                    <th>${todo.id}</th>
                    <th>${todo.description}</th>
                    <th>${todo.targetDate}</th>
                    <th>${todo.done}</th>
                </tr>
            </tbody>
        </c:forEach>
    </body>
</html>