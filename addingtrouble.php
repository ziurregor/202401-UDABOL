//diego fuentes niño de guzman 48490
<?php

function suma($a, $b, $c) {
  if ($a + $b == $c) {
    return "correct!";
  } else {
    return "wrong!";
  }
}

$entrada = explode(" ", fgets(STDIN));
$a = intval($entrada[0]);
$b = intval($entrada[1]);
$c = intval($entrada[2]);

$resultado = suma($a, $b, $c);
echo $resultado;
