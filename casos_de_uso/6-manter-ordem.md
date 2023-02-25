# Manter Ordem de Compra
## Breve Descrição
Este caso de uso permite que um funcionário comissionado registre e mantenha ordens de compra. 

Isso inclui adicionar, alterar e excluir ordens de compra. 
Funcionários comissionados devem registrar cada um de seus ordens de compra para receber comissões.
## Fluxo de Eventos
### Fluxo Básico
Este caso de uso começa quando o funcionário comissionado deseja adicionar, alterar e/ou excluir ordem de Compra informações do sistema.
1. O sistema solicita que o Funcionário Comissionado especifique a função que deseja
realizar (Criar uma ordem de Compra, Atualizar uma ordem de Compra ou Excluir uma ordem de Compra)
1. Uma vez que o Funcionário Comissionado forneça as informações solicitadas, um dos subfluxos é executado.

Se o Funcionário comissionado selecionou “Criar uma ordem de Compra”, a opção Criar uma ordem de Compra subfluxo é executado.

Se o Funcionário Comissionado selecionou ”Atualizar uma ordem de Compra”, a opção Atualizar uma ordem de Compra subfluxo é executado.

Se o Funcionário Comissionado selecionou ”Excluir uma ordem de Compra”, a opção Excluir uma ordem de Compra subfluxo é executado.

### Criar uma ordem de Compra
1. O sistema solicita que o Funcionário Comissionado insira as informações da ordem de Compra. Esta inclui:

- ponto de contato do cliente
- endereço de cobrança do cliente
- produto(s) adquirido(s)
- data

1. Uma vez que o Funcionário Comissionado forneça as informações solicitadas, o sistema gera e atribui um número de ordem de Compra exclusivo à ordem de Compra.
A ordem de compra é adicionado ao sistema para o Empregado Comissionado.
1. O sistema fornece ao Funcionário Comissionado o novo ID da ordem de Compra.
### Atualizar uma ordem de Compra
1. O sistema solicita que o Funcionário Comissionado insira o id da ordem de Compra.
2. O funcionário comissionado insere o ID da ordem de Compra.
3. O sistema recupera o pedido de compra associado ao ID da ordem de Compra.
4. O sistema verifica se a ordem de Compra é uma ordem de Compra para o Funcionário Comissionado e se a ordem de Compra está aberta.
5. O sistema exibe a ordem de Compra.
6. O Funcionário Comissionado faz as alterações desejadas nas informações da ordem de Compra. Isso inclui qualquer das informações especificadas no subfluxo Criar uma ordem de Compra.
1. Assim que o Funcionário Comissionado atualizar as informações necessárias, o sistema atualizará a ordem de Compra com as informações atualizadas.
###  Excluir uma ordem de Compra
1. O sistema solicita que o Funcionário Comissionado especifique o id da ordem de
Compra.
1. O funcionário comissionado insere o ID da ordem de Compra.
1. O sistema recupera o pedido de compra associado ao ID da ordem de Compra.
1. O sistema verifica se a ordem de Compra é uma ordem de Compra para o Funcionário Comissionado e se a ordem de Compra está aberta.
1. O sistema exibe a ordem de Compra. 6. O sistema solicita ao Funcionário Comissionado que confirme a exclusão da ordem de Compra. 
1. O Funcionário Comissionado
verifica a exclusão. 
1. O sistema remove a ordem de Compra do sistema.
### Fluxos alternativos
#### **Ordem de Compra Não Encontrada**
Se, nos subfluxos Atualizar pedido de compra ou Excluir pedido de compra, um pedido com o número de identificação especificado não existe, o sistema exibe uma mensagem de erro. 

O empregado comissionado pode então inserir um número de id diferente ou cancelar a operação, ponto em que o caso de uso termina.

#### **Acesso Inválido a um Pedido de Compra**
Se, nos subfluxos Atualizar Pedido de Compra ou Excluir Pedido de Compra, o Funcionário Comissionado tenta acessar um pedido de compra que não é seu, o sistema apresenta uma mensagem de erro. 

O Funcionário Comissionado pode inserir um
número de identificação diferente ou cancelar a operação,momento em que o caso de uso termina.

#### **Pedido de Compra Fechado**
Se, nos subfluxos Atualizar Pedido de Compra ou Excluir Pedido de Compra, o Funcionário Comissionado tenta acessar um pedido que está fechado, o sistema apresenta
uma mensagem de erro. 

O comissionado O funcionário pode inserir um número de
identificação diferente ou cancelar a operação, ponto em que o caso de uso termina.

#### **Excluir Cancelado**
Se, no subfluxo Excluir um pedido de compra, o Funcionário comissionado decidir não
excluir o ordem de compra, a exclusão é cancelada e o Fluxo Básico é reiniciado no
início.
## Requisitos Especiais
Nenhum.
## Pré-Condições
O Funcionário Comissionado deve estar conectado ao sistema antes do início deste caso de uso.
## Pós-Condições
Se o caso de uso foi bem-sucedido, as informações do pedido de compra são adicionadas,
atualizadas ou excluídas do sistema. 

Caso contrário, o estado do sistema permanece inalterado.
## Pontos de Extensão
Nenhum.