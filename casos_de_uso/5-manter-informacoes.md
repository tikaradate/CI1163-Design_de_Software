# Manter informações dos funcionários
## Breve Descrição
Este caso de uso permite que o Administrador da Folha de Pagamento mantenha as informações
do funcionário. Isso inclui adicionar, alteração e exclusão de informações de funcionários do
sistema.
## Fluxo de Eventos
### Fluxo Básico
Este caso de uso começa quando o Administrador da Folha de Pagamento deseja adicionar, alterar e/ou excluir funcionários informações do sistema.
1. O sistema solicita que o Administrador da Folha de Pagamento especifique a função que deseja desempenhar (Adicione um funcionário, atualize um funcionário ou exclua um funcionário)
2. Uma vez que o Administrador da Folha de Pagamento forneça as informações solicitadas, um dos subfluxos é executado.  

2.1 Se o Administrador da Folha de Pagamento selecionou “Adicionar um Funcionário“, o subfluxo Adicionar um Funcionário é executado.

2.2 Se o administrador da folha de pagamento selecionou ”Atualizar um funcionário”, o subfluxo Atualizar um funcionário é executado.

2.3 Se o administrador da folha de pagamento selecionou ”Excluir um funcionário”, o subfluxo Excluir um funcionário é executado.
### Adicionar um Funcionário
1. O sistema solicita que o Administrador da Folha de Pagamento insira as informações do empregado. Isso inclui: 
 - nome 
 - tipo de funcionário (hora, assalariado, comissionado)
 - endereço para correspondência - número da Segurança Social 
 - deduções fiscais padrão 
 - outras deduções (401k, médicas)
 - número de telefone 
 - taxa horária (para funcionários horistas)
 - salário (para empregados assalariados e comissionados)
 - taxa de comissão (para funcionários comissionados) 
 - limite de horas (alguns funcionários podem não conseguir fazer horas extras)

2. Depois que o Administrador da Folha de Pagamento fornece as informações solicitadas, o sistema gera e atribui um número de identificação do funcionário para o funcionário e define o método de entrega do contracheque como padrão de “retirada”. O funcionário é adicionado ao sistema.
3. O sistema fornece ao Administrador da Folha de Pagamento o novo ID do funcionário.

### Atualizar um Funcionário 

1. O sistema solicita que o Administrador da Folha
de Pagamento insira o ID do funcionário.
1. O administrador da folha de pagamento insere o ID do funcionário. O sistema recupera e exibe as informações do funcionário.
1. O administrador da folha de pagamento faz as alterações desejadas nas informações do funcionário. Isso inclui qualquer um dos informações especificadas no subfluxo *Adicionar um funcionário*.
1. Assim que o Administrador da Folha de Pagamento atualizar as informações necessárias, o sistema atualizará o cadastro do funcionário com as informações atualizadas.

### Excluir um Funcionário
1. O sistema solicita que o Administrador da Folha de Pagamento especifique a identificação do funcionário.
1. O administrador da folha de pagamento insere o ID do funcionário. O sistema recupera e exibe as informações do funcionário.
1. O sistema solicita que o Administrador da Folha de Pagamento confirme a exclusão do funcionário.
1. O Administrador da Folha de Pagamento verifica a exclusão.
2. O sistema marca o registro do funcionário para exclusão. Na próxima vez que a folha de pagamento for executada, o sistema irá gerar um contracheque final do funcionário excluído e removê-lo do sistema.

### Fluxos alternativos
#### **Empregado Não Encontrado**
Se nos subfluxos Atualizar um funcionário ou Excluir um funcionário, um funcionário
com o ID especificado número não existe, o sistema exibe uma mensagem de erro. O
administrador da folha de pagamento pode inserir um número de identificação diferente ou cancelar a operação, ponto em que o caso de uso termina.
#### **Excluir Cancelado**
Se no subfluxo Excluir um funcionário, o Administrador da folha de pagamento decidir não excluir o funcionário, o delete é cancelado e o Fluxo Básico é reiniciado no início.
### Requisitos especiais
Nenhum.
### Pré-Condições
O Administrador da Folha de Pagamento deve estar conectado ao sistema antes do início deste caso de uso.
### Pós-Condições
Se o caso de uso for bem-sucedido, as informações do funcionário serão adicionadas, atualizadas ou excluídas do sistema. 

Caso contrário, o estado do sistema permanece inalterado.
### Pontos de Extensão
Nenhum