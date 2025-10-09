/* Crie uma função chamada calcularTotal que receba: 
• O preço unitário de um produto. 
• A quantidade comprada.

Calcule o valor total da compra.

Crie outra função chamada aplicarDesconto que receba o valor total e retorne 
o valor com desconto, conforme a regra:
• Compras acima de R$ 100,00 → 10% de desconto
• Compras até R$ 100,00 → sem desconto

Adicione uma função exibirResumo() que formate e exiba um resumo final da compra. 
• Valor total antes do desconto. 
• Valor final com o desconto aplicado.

OBS: Use prompt() para ler os dados do usuário (preço e quantidade). */

function calcularTotal(precoUnitario, quantidade){
    return precoUnitario * quantidade;
}
function aplicarDesconto(valorTotal){
    if(valorTotal > 100){
        return valorTotal * 0.9;
    }
    return valorTotal;
}
function exibirResumo(valorTotal, valorComDesconto){
    console.log(`Valor total antes do desconto: R$ ${valorTotal.toFixed(2)}`);
    console.log(`Valor final com o desconto aplicado: R$ ${valorComDesconto.toFixed(2)}`);
}
const precoUnitario = parseFloat(prompt("Digite o preço unitário do produto:"));
const quantidade = parseInt(prompt("Digite a quantidade comprada:"));
const valorTotal = calcularTotal(precoUnitario, quantidade);
const valorComDesconto = aplicarDesconto(valorTotal);
exibirResumo(valorTotal, valorComDesconto);