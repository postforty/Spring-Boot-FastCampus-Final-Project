<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Edit Employee</h1>
<form:form method="POST" action="/update">
    <table >
        <tr>
            <td>PostId : </td>
            <td>${command.getSeq()}</td>
            <td><form:hidden  path="seq" /></td>
        </tr>
        <tr>
            <td>NickName : </td>
            <td><form:input path="writer" value="${command.getWriter()}"/></td>
        </tr>
        <tr>
            <td>Title :</td>
            <td><form:input path="title" value="${command.getTitle()}"/></td>
        </tr>
        <tr>
            <td>Content :</td>
            <td><form:input path="content" value="${command.getContent()}"/></td>
        </tr>
        <tr>
            <td> </td>
            <td><input type="submit" value="Edit Save" /></td>
        </tr>
    </table>
</form:form>