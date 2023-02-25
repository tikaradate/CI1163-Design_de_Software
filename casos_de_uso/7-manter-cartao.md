# Manter cartão de ponto
## Breve Descrição
Este caso de uso permite que o Funcionário atualize e envie as informações do cartão de ponto.
Horista e assalariado os funcionários devem enviar cartões de ponto semanais registrando todas
as horas trabalhadas naquela semana e que projetam o horas são cobradas. Um Funcionário
só pode fazer alterações no cartão de ponto para o período de pagamento atual e antes que o
cartão de ponto seja enviado.
##  Fluxo de Eventos
### Fluxo Básico
Este caso de uso começa quando o Funcionário deseja inserir as horas trabalhadas em seu
cartão de ponto atual.
1. O sistema recupera e exibe o cartão de ponto atual do Funcionário. Se um cartão de
ponto não existir para o Funcionário do período de pagamento atual, o sistema cria um
novo. As datas de início e fim de o cartão de ponto são definidos pelo sistema e não podem
ser alterados pelo Funcionário.
2. O sistema recupera e exibe a lista de números de cobrança disponíveis do Gerenciamento de Projetos Base de dados.
3. O Funcionário seleciona os números de cobrança apropriados e insere as horas trabalhadas para qualquer data desejada (dentro do intervalo de datas do cartão de ponto).
4. Uma vez que o Funcionário tenha inserido as informações, o sistema salva o cartão de
ponto.
###  Enviar cartão de ponto
1. A qualquer momento, o Funcionário pode solicitar ao sistema o envio do cartão de
ponto.
2. Nesse momento, o sistema atribui a data atual ao cartão de ponto como a data
de envio e altera a status do cartão de ponto como ”enviado”. Nenhuma alteração é
permitida no cartão de ponto depois de ter sido submetido.
3. O sistema valida o cartão de ponto verificando o número de horas trabalhadas em
cada cobrança número. O número total de horas trabalhadas em relação a todos os
números de cobrança não deve exceder nenhum limite estabelecido para o Funcionário
(por exemplo, o Funcionário não pode fazer horas extras).
4. O sistema retém o número de horas trabalhadas para cada número de cobrança no
cartão de ponto.
5. O sistema salva o cartão de ponto.
6. O sistema torna o cartão de ponto somente leitura e nenhuma outra alteração é
permitida depois que o cartão de ponto é submetido.
### Fluxos alternativos
#### **Número de Horas Inválido**
Se no Fluxo Básico for inserido um número inválido de horas para um único dia (maior
que 24), ou o número inserido exceder o máximo permitido para o Funcionário, o
sistema exibirá uma mensagem de erro e solicitará por um número válido de horas.

O Funcionário deverá introduzir um número válido, ou cancelar a operação, na qual caso o caso de uso termine.

#### **Cartão de ponto já enviado**
Se, no Fluxo Básico, o cartão de ponto atual do Funcionário já tiver sido enviado, o
sistema exibirá uma cópia somente leitura do cartão de ponto e informa ao Funcionário
que o cartão de ponto já foi enviado, então nenhuma alteração pode ser feita nele.

O Empregado reconhece a mensagem e o caso de uso termina.
#### **Serviço de gerenciamento de projetos não disponível**
Se no Fluxo Básico o Serviço de Gerenciamento de Projetos não estiver disponível, o
sistema apresentará um erro mensagem informando que a lista de números de cobrança
disponíveis não está disponível. 

O Empregado reconhece o erro e pode optar por
continuar (sem números de cobrança selecionáveis) ou cancelar (qualquer cartão de
ponto as alterações são descartadas e o caso de uso termina). 

Nota: Sem números
de cobrança selecionáveis, o Funcionário pode alterar o horário para um número de
cobrança já listados no cartão de ponto, mas ele/ela não pode adicionar horas para
um número de cobrança que ainda não esteja listado.
##  Requisitos Especiais
Nenhum.
##  Pré-Condições
O Funcionário deve estar conectado ao sistema antes do início deste caso de uso.
##  Pós-Condições
Se o caso de uso for bem-sucedido, as informações do cartão de ponto do funcionário serão
salvas no sistema. 

Caso contrário, o estado do sistema é inalterado.
##  Pontos de Extensão
Nenhum  