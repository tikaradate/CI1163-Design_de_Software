# Criar relatório de funcionário
## Breve Descrição
O caso de uso permite que o Funcionário crie um “Total de Horas Trabalhadas”, “Total de Horas Trabalhadas para um Projeto”, Relatório de “Férias/Folga por Doença” ou “Pagamento Total Acumulado no Ano”.

## Fluxos
### Fluxo Básico
Este caso de uso começa quando o Funcionário deseja criar um “Total de Horas Trabalhadas”, “Total de Horas Trabalhadas para um projeto”, “Férias/licença médica” ou “Pagamento total acumulado no ano”.

1. O sistema solicita que o Funcionário especifique os seguintes critérios de relatório: 
 - Tipo de relatório (ou ”Total de horas trabalhadas”, ”Total de horas trabalhadas para um projeto”, ”Férias/Doença Licença” ou “Pagamento Total Acumulado no Ano”) 
  - Datas de início e término do relatório
2. Se o funcionário selecionou o relatório ”Total de horas trabalhadas para um projeto”, o sistema recupera e exibe uma lista dos números de cobrança disponíveis no banco de dados de gerenciamento de projetos. O sistema em seguida, solicita que o Funcionário selecione um número de cobrança.
3. Assim que o Funcionário fornecer as informações solicitadas, o sistema fornecerá ao Funcionário um relatório que satisfaça os critérios do relatório.
4. O Funcionário pode então solicitar que o sistema salve o relatório. Nesse momento, o sistema solicita o Funcionário forneça o nome e o local para salvar o relatório.
5. Assim que o Funcionário fornecer as informações solicitadas e confirmar a decisão de salvar o relatório, o sistema salva o relatório no nome e local especificados.
6. Se o funcionário não optar por salvar o relatório, o relatório ser ́a descartado.
### Fluxos alternativos
#### Informações Solicitadas Indisponíveis
Se no Fluxo Básico as informações solicitadas não estiverem disponíveis, o sistema apresentará uma mensagem de erro. 

O Funcionário pode optar por retornar ao início do Fluxo Básico ou cancelar a operação, no em qual ponto o caso de uso termina.

### Formato inválido ou informação insuficiente
Caso no Fluxo Básico o Funcionário não tenha especificado informações suficientes para a criação do relatório selecionado, o sistema solicitar ́a ao ator as informações que
faltam. 

O Empregado pode entrar o que falta informações ou optar por cancelar a operação, ponto em que o caso de uso termina.

### Requisitos Especiais
Nenhum.
### Pré-Condições
O Funcionário deve estar conectado ao sistema antes do início deste caso de uso.
3
### Pós-Condições
O estado do sistema é inalterado por este caso de uso.
### Pontos de Extensão
Nenhum.