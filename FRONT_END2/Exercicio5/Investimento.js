/* 6) Escreva uma função que
informe o retorno de um investimento (montante) com base nos valores do
capital inicial, tempo em meses e taxa de juros mensal, fornecidos pelo
usuário. Utilize obrigatoriamente a função prompt() para coletar os
valores necessários.
Use a fórmula: M = C * (1+i)tOnde:
C = Capital inicial investido
i = Taxa de juros, em percentual
t = Tempo do investimento, em meses
Exiba o resultado com duas casas decimais. */

let capitalInicial = parseFloat(prompt("Insira o capital inicial investido: "));
let taxaJuros = parseFloat(prompt("Insira a taxa de juros mensal (em %): ")) / 100;
let tempoMeses = parseInt(prompt("Insira o tempo do investimento (em meses): "));
let montante = capitalInicial * Math.pow((1 + taxaJuros), tempoMeses);
console.log(`O montante do investimento após ${tempoMeses} meses é: R$ ${montante.toFixed(2)}`);