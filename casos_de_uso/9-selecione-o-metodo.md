# Selecione o método de pagamento
## Breve Descrição
Este caso de uso permite que um Funcionário selecione um método de pagamento. O método de
pagamento controla como o Funcionário será pago. O Funcionário pode optar entre: levantar
o seu cheque diretamente, recebê-lo no correio, ou tê-lo depositado diretamente em uma conta
bancária especificada.
## Fluxo de Eventos
### Fluxo Básico
Este caso de uso começa quando o Funcionário deseja selecionar um método de pagamento.
1. O sistema solicita que o Funcionário especifique o método de pagamento que deseja
(seja: “correio” ou ”depósito direto”).
2. O Funcionário seleciona o método de pagamento pretendido.
3. Se o Funcionário selecionar o método de pagamento “correio”, o sistema solicitará que o
Funcionário especifique o endereço para o qual o cheque de pagamento será enviado. Se o
Funcionário selecionar o método de “depósito direto”, o sistema solicita que o Funcionário
especifique o nome do banco e número da conta.
4. Depois que o Funcionário fornece as informações solicitadas, o sistema atualiza as
informações do Funcionário para refletem o método de pagamento escolhido.
### Fluxos alternativos
#### **Empregado Não Encontrado**
Se no Fluxo Básico não for possível localizar as informações do funcionário, o sistema
apresenta um erro mensagem e o caso de uso termina.
## Requisitos Especiais
Nenhum.
## Pré-Condições
O Funcionário deve estar conectado ao sistema antes do início deste caso de uso.
## Pós-Condições
Se o caso de uso foi bem-sucedido, a forma de pagamento do Funcionário é atualizada no
sistema. Por outro lado, o estado do sistema é inalterado.
## Pontos de Extensão
Nenhum.