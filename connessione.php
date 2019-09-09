<?php
$host = "localhost";
$user="root";
$password="";

$conn=mysqli_connect($host,$user,$password);
if(!$conn)
{
	echo "Connessione fallita";
}

?>