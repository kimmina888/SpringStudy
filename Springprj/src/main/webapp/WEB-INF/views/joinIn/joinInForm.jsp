<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE>
<html>
	<head>
		<style>
			table{
				border : none;
				margin : auto 0;
				color : white;
			}
			tr{
				margin : auto 0;
			}
			td{
				margin : auto 0;
				 text-align: center;
			}
			body{
				background : BLACK;
			}
			input{
				border-
				border-bottom: 1px solid #ddd;
				color : white;
			}
		</style>
	</head>
	<body>
		<form>
			<table>
				<tr>
					<td><label style ="margin : 10px;" target = "inputid">아이디</label></td> <td><input style ="margin : 10px;" type="text" id = "inputid"></td>
				</tr>
				<tr>
					<td><label style ="margin : 10px;" target = "inputname">이름</label></td> <td><input style ="margin : 10px;" type="text" id = "inputname"></td>
				</tr>
				<tr>
					<td><label style ="margin : 10px;" target = "inputemail">이메일</label></td> <td><input style ="margin : 10px;" type="text" id = "inputemail"></td>
				</tr>
				<tr>
					<td><label style ="margin : 10px;" target = "inputphone">핸드폰</label></td> <td><input style ="margin : 10px;" type="text" id = "inputphone"></td>
				</tr>
				<tr>
					<td><label style ="margin : 10px;" target = "inputpassword">비밀번호</label></td> <td><input style ="margin : 10px;" type="password" id = "inputpassword"></td>
				</tr>
				<tr>
					<td colspan = 2><button type="submit">가입하기</button></td>
				</tr>
			</table>
		</form>
	</body>
</html>