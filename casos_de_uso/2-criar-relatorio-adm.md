# Criar Relatório Administrativo
## Breve Descrição
O caso de uso permite que o Administrador da Folha de Pagamento crie um relatório “Total de Horas Trabalhadas” ou “Pagamentos dos  ́ultimos 12 meses” .
## Fluxos
### Fluxo Básico
O caso de uso começa quando o Administrador da Folha de Pagamento solicita que o sistema crie um relatório.
1. O sistema solicita que o Administrador da Folha de Pagamento especifique os seguintes critérios de relatório: 
  - Tipo de relatório (total de horas trabalhadas ou pagamento acumulado no ano) 
  - Datas de início e fim do relatório
  - Nome(s) do(s) funcionário(s)

1. Assim que o Administrador da Folha de Pagamento fornecer as informações solicitadas, o sistema fornecerá a Folha de Pagamento Administrador com um relatório que satisfaça os critérios do relatório.
2. O Administrador da Folha de Pagamento pode ent ̃ao solicitar que o sistema salve o
relatório. Nesse momento, o sistema solicita o administrador da folha de pagamento para
fornecer o nome e o local para salvar o relatório.
1. Assim que o Administrador da Folha de Pagamento fornecer as informações solicitadas
e confirmar a decisão 
de salvar o relatório, o sistema salva o relatório no nome e local
especificados.
1. Se o Administrador da Folha de Pagamento não optar por salvar o relatório, o relatório será descartado.


### Fluxos alternativos
#### Informações Solicitadas Indisponíveis
Se no Fluxo Básico as informações solicitadas não estiverem disponíveis, o sistema apresentará uma mensagem de erro.
  
  O Administrador da Folha de Pagamento pode
optar por retornar ao início do Fluxo Básico ou cancelar a operação, ponto em que o caso de uso termina.
### Formato inválido ou informação insuficiente
Se no Fluxo Básico o Administrador da Folha de Pagamento não tiver especificado informações suficientes para criar o relatório selecionado, o sistema solicitará ao ator
as informações que faltam.

O Administrador da Folha de Pagamento pode insira as
informações que faltam ou opte por cancelar a operação, ponto em que o caso de uso termina.

### Requisitos Especiais 
Nenhum.
### Pré-Condições 
O administrador da folha de pagamento deve estar conectado ao sistema para que este caso de uso comece.
### Pós-Condições 
O estado do sistema é inalterado por este caso de uso.
### Pontos de Extensão 
Nenhum.