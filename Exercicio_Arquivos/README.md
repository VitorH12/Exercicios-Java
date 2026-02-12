# Processador de Dados de Vendas

Programa para leitura e processamento de arquivos no formato CSV contendo dados de itens vendidos.

## Descrição do Projeto
O sistema realiza a leitura de um arquivo de entrada onde cada item possui nome, preço unitário e quantidade, separados por vírgula. O objetivo é realizar o cálculo do valor total por item e exportar os dados consolidados.

## Funcionalidades
- Leitura de arquivo .csv de origem.
- Cálculo do valor total (preço unitário multiplicado pela quantidade).
- Criação automática de uma subpasta denominada "out".
- Geração de um arquivo de saída chamado "summary.csv" contendo apenas o nome do item e o valor total processado.

## Exemplo de Entrada e Saída

**Arquivo de origem:**
```csv
TV LED,1290.99,1
Video Game,350.00,3
Iphone X,900.00,2
