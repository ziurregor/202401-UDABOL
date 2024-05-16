<?php
$entrada = trim(fgets(STDIN));
$numeros = explode(" ", $entrada);
$a = intval($numeros[0]);
$b = intval($numeros[1]);
$resultado = $a + $b;
echo $resultado;