<%@ include file="../fragments/header.jsp" %>

<h1>Hello from home JSP</h1>
    <p>"${message}"</p>
    <p>go to <b>/api?fName=BOB&lName=ROB</b> and test different parameter values</p>
    <p>go to <b>/api2/{fName}/{lName}</b> and test different path variable values</p>
    <p>go to <b>/api3/{fName}/{lName}?tel=123</b> and test different path variable values and parameter values</p>

<%@ include file="../fragments/footer.jsp" %>