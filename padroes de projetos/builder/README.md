## Descrição
O Design Pattern "Builder" é uma técnica utilizada para criar objetos complexos passo a passo, separando o processo de construção da representação final do objeto. Isso ajuda a melhorar a legibilidade e a flexibilidade do código, especialmente quando você precisa criar objetos com muitos parâmetros ou configurações diferentes.

Neste desafio, buscando soluções para um problema de negócios em uma plataforma de e-commerce, é necessário melhorar a forma como os pedidos personalizados são tratados. Você tem a opção de implementar a solução utilizando o padrão Builder para criar pedidos de forma mais eficiente e organizada, ou seguir uma abordagem alternativa sem a necessidade de utilizar o padrão Builder.

### Detalhamento da tarefa:

1. Capture o nome do cliente. 
2. Solicite ao usuário a quantidade de produtos que deseja adicionar ao pedido. 
3. Para cada produto, capture o nome, preço e quantidade. 
4. Capture o endereço de entrega. 
5. Calcule o total do pedido somando o preço de cada produto multiplicado pela quantidade. 
6. Imprima os detalhes do pedido, incluindo os produtos, seus preços, quantidades, total a pagar e endereço de entrega.

### Entrada
O programa deve receber as seguintes informações do usuário:

- Nome do cliente (string); 
- Lista de produtos a serem incluídos no pedido (cada produto possui nome, preço e quantidade); 
- Endereço de entrega (string).

### Saída
Após receber todas as informações do usuário, o programa deve criar um objeto de pedido personalizado usando o padrão Builder e imprimir os detalhes do pedido construído, incluindo o total a pagar.

Para este desafio, considere apenas uma casa decimal após a vírgula.


#### Nota:
O padrão Builder é uma abordagem valiosa quando se trata de criar objetos complexos com diferentes configurações. No entanto, deve-se considerar a relação entre a complexidade do problema e a necessidade de aplicar o padrão, especialmente em cenários mais simples. A decisão de usar ou não o padrão Builder dependerá das necessidades específicas do projeto e das características do sistema em que está sendo aplicado.