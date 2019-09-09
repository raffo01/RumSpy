<! doctype HTML>
	<html>
		<head>
			<title> Inserisco </title>
		</head>
		<body>
			<?php 
				include "connessione.php";
				$db1=mysqli_select_db($conn,"scuola");
				
				
				$nome = $_POST['nome'];
				$cognome = $_POST['cognome'];
				$classe = $_POST['classe'];
				$matricola = $_POST['matricola'];
				
				
				$sql1 = "INSERT INTO studenti 
					(matricola,nome,cognome,classe)
				VALUE ('$matricola','$nome','$cognome','$classe');";
			
			$result = mysqli_query($conn,$sql1);
			if(!$result)
			{
				echo "Errore" .mysqli_error($conn);
			}
			else
			{
				echo "Student data entered correctly";
			}
			?>
		</body>
	</html>
	