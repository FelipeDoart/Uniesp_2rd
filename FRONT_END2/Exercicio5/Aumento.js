/* 4) Um funcionário de uma empresa recebe aumento salarial anualmente. 

- Sabe-se que:Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
- Em 1996 recebeu aumento de 0,15% sobre seu salário inicial;
-
A partir de 1997 (inclusive), os aumentos salariais sempre correspondem
ao dobro do percentual do ano anterior. Faça um programa que determine o
salário atual desse funcionário. 
- Após concluir isto, faça
uma segunda versão do seu código que permita o usuário informar o
salário inicial do funcionário. Utilize obrigatoriamente a função
prompt() para coletar o salário inicial. */

let salarioInicial = parseFloat(prompt("Insira o salário inicial do funcionário: "));
let anoContratacao = parseInt(prompt("Insira o ano de contratação do funcionário: "));
let salarioAtual = salarioInicial;
let aumentoPercentual = 0.0015;
for (let ano = anoContratacao + 1; ano <= 2024; ano++) {
  aumentoPercentual *= 2;
  salarioAtual += salarioAtual * aumentoPercentual;
} 
console.log(`O salário atual do funcionário é: R$ ${salarioAtual.toFixed(2)}`);