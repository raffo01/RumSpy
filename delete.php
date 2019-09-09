<?php

include "connessione.php";
$db1=mysqli_select_db($conn,"scuola");
$matricola=$_POST["matricola"];

$sql="DELETE FROM studenti 
		Where matricola='$matricola';";
		$result = mysqli_query($conn,$sql);
		if(!$result)
		{
			echo "Student not eliminated";
		}
		else
		{
			echo " Student eliminated ";
		}
?>