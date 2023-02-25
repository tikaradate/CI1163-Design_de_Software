# Execute a folha de pagamento
## Breve Descrição
O caso de uso descreve como a folha de pagamento é executada toda sexta-feira e no último
dia útil do mês.
## Fluxo de Eventos
###  Fluxo Básico
O caso de uso começa quando é hora de executar a folha de pagamento. A folha de pagamento é executada automaticamente toda sexta-feira e o último dia útil do mês.
1. O sistema recupera todos os funcionários que devem ser pagos na data atual.
2. O sistema calcula o pagamento usando cartões de ponto inseridos, ordens de compra,
informações do funcionário (por exemplo, salário, benefícios, etc.) e todas as deduções
legais.
3. Se a forma de pagamento for correio, o sistema cria uma transação bancária e a envia
para o Banco Sistema de processamento e envio.
4. Se a forma de pagamento for depósito direto, o sistema cria uma transação bancária e
a envia para o Sistema do Banco para processamento.
5. O caso de uso termina quando todos os funcionários que recebem pagamento na data
desejada forem processados.
### Fluxos alternativos
#### **Sistema Bancário Indisponível**
Se o Sistema Bancário estiver inoperante, o sistema tentará enviar a transação bancária
novamente após um determinado período. 

O sistema continuará tentando retransmitir
até que o Sistema do Banco fique disponível.
#### **Empregados Excluídos**
Após o processamento da folha de pagamento de um funcionário, se o funcionário tiver
sido marcado para exclusão (consulte o caso de uso Manter Funcionário), o sistema
excluirá o funcionário.
## Requisitos Especiais
Nenhum.
## Pré-Condições
Nenhum.
## Pós-Condições
Os pagamentos de cada funcionário elegível para serem pagos na data atual foram processados.
## Pontos de Extensão
Nenhum