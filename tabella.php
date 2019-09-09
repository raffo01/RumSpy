<?php
	include "connessione.php";
	$db1=mysqli_select_db($conn,"scuola");
	$sql="CREATE TABLE 	Studenti(
	Matricola INT(5) PRIMARY KEY,
	Nome VARCHAR(30) Not Null,
	Cognome Varchar(30) Not Null,
	Classe INT(2) Not null);";
	if(mysqli_query($conn,$sql))
	{
		echo "Table create";
	}
	?>
	