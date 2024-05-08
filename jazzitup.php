<?php

function cuadradoPerfecto($sum) {
  for ($i = 2; $i <= sqrt($sum); $i++) {
    if ($sum % ($i * $i) == 0) {
      return true;
    }
  }
  return false;
}

function notasPorTiempo($n) {
  for ($i = 2; $i < $n; $i++) {
    $sum = $i * $n;
    if (!cuadradoPerfecto($sum)) {
      return $i;
    }
  }
}

$n = intval(trim(fgets(STDIN)));
echo notasPorTiempo($n);
