## Descrição
O padrão de projeto Adapter é um padrão de projeto estrutural que permite que objetos com interfaces incompatíveis trabalhem juntos. Ele atua como um intermediário, adaptando a interface de uma classe para outra interface esperada pelo cliente.

Neste desafio, você deverá implementar um conversor de moedas que permitirá que valores monetários sejam convertidos de dólares americanos (USD) para euros (EUR). Embora exista uma taxa de conversão direta de 1 USD = 0.85 EUR, o nosso sistema inicialmente só suportava a conversão de USD para libras esterlinas (GBP). Utilizando o padrão Adapter, você deve adaptar esse sistema antigo para fornecer a nova funcionalidade de conversão direta para EUR, usando a conversão intermediária para GBP.

### Entrada
Um valor em dólares americanos USD (Double).

### Saída
O valor convertido para euros EUR (Double) usando o adaptador.

**Taxa de conversão direta (para referência):**
1 USD = 0.85 EUR

**Taxas de conversão para a adaptação:**
1 USD para GBP = 0.80
1 GBP para EUR = 1.0625


#### Nota:
O padrão Adapter é uma ferramenta valiosa para lidar com incompatibilidades de interface e integrar componentes heterogêneos. No entanto, é importante avaliar cuidadosamente sua utilização para garantir que os benefícios superem os possíveis custos em termos de complexidade e desempenho.
