<?php
	include "connessione.php";
	$sql="CREATE DATABASE scuola";
	$result=mysqli_query($conn,$sql);
	$db1=$mysqli_select_db($conn,$sql);
	if(!result)
	{
		echo "errore";
	}
	else
	{
		echo "corretto";
	}
	
	?>