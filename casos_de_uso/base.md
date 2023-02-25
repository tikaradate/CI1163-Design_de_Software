Como chefe de Tecnologia da Informação das Organizações Tabajara, você tem a tarefa de construir um novo sistema de folha de pagamento para substituir o sistema existente que esta irremediavelmente desatualizado. 

As Organizações Tabajara precisa de um novo sistema para permitir que os funcionários registrem informações sobre o cartão de ponto eletronicamente e gerar automaticamente contracheques com base no número de horas trabalhadas e no total quantidade de vendas (para funcionários comissionados).

O novo sistema sera de última geração e terá uma interface de desktop baseada em Windows e uma interface baseada na web para permitir que os funcionários insiram informações de cartão de ponto, insiram ordens de compra, alterem as preferências do funcionário (como metodo de pagamento) e criar vários relatórios. 

O sistema sera executado em desktops de funcionários individuais e laptops em toda a empresa. Por questões de segurança e auditoria, os funcionários só podem acessar e editar seus próprios cartões de ponto e ordens de compra.

O sistema reterá as informações de todos os funcionários da empresa (as Organizações Tabajara possuem atualmente cerca de 5.000 funcionários no mundo todo). 

O sistema deve pagar a cada funcionário o valor
correto, no prazo, pelo metodo que ele especificar (consulte possíveis métodos de pagamento descritos mais adiante). 

As Organizações Tabajara, por questões de custo, não quer substituir um de seus bancos de dados legados, o banco de dados de gerenciamento de projetos, que contém todas as informações sobre projetos e números de cobrança.

O novo sistema deve funcionar com o banco de dados de gerenciamento
de projetos existente, que e um banco de dados DB2 rodando em um mainframe IBM. 

O Sistema de Folha de Pagamento acessará, mas não atualizará as informações armazenadas no Projeto Banco de dados de gerenciamento.

Alguns funcionários trabalham por hora e recebem uma taxa horaria. Eles enviam cartões de ponto que registram a data e número de horas trabalhadas para um determinado número de cobrança. 

Se alguem trabalha por mais de 8 horas, as Organizações Tabajara pagam o funcionário 1,5 vez sua taxa normal para essas horas extras. 

Trabalhadores horistas são pagos todas as sextas-feiras.

Alguns funcionários recebem um salario fixo. Embora recebam um salario fixo, eles enviam cartões de ponto que registram a data e horas trabalhadas. Isso ocorre para que o sistema possa acompanhar as horas trabalhadas em relacao a números de cobrança especıficos. São pagos no último dia útil do mês.

Alguns dos funcionários assalariados tambem recebem uma comissão com base em suas vendas. Eles enviam ordens de compra que refletem a data e o valor da venda. A taxa de comissão e determinada para cada funcionário, e e de 10%, 15%, 25% ou 35%.

Um dos recursos mais solicitados do novo sistema são os relatórios de funcionários. Os funcionários poderão consultar o sistema para número de horas trabalhadas, totais de todas as horas faturadas para um projeto (ou seja, número de cobrança), pagamento total recebido acumulado do ano, tempo restante de férias, etc.

Os funcionários podem escolher a forma de pagamento. Eles podem ter seus cheques de pagamento enviados para o endereço postal de seus escolha, ou podem solicitar deposito direto e ter seu contracheque depositado em uma conta bancaria de sua escolha. 

O funcionário tambem pode optar por retirar o contracheque no escritório.

O administrador da folha de pagamento mantem as informações dos funcionários. 

O Administrador da Folha de Pagamento é responsável por adicionar novos funcionários, excluir funcionários e alterár todas as informações do funcionário, como nome, endereço e classificação (horario, assalariado, comissionado), bem como a execucao de relatórios administrativos.


O Administrador da Folha de Pagamento executara automaticamente a folha de pagamento todas as sextas-feiras e no último dia útil do mês.

O sistema pagará os funcionários apropriadamente nesses dias.

O sistema sera informado pelo administrador em que data os funcionários devem ser pagos, portanto, ele gerará pagamentos para registros da última vez que o funcionário foi pago para a data especificada.