# Entrar
## Breve Descrição
Este caso de uso descreve como um usuário efetua login no Sistema de Folha de Pagamento.
##  Fluxo de Eventos
### Fluxo Básico
Este caso de uso começa quando o ator deseja fazer login no sistema de folha de pagamento.
1. O sistema solicita que o ator digite seu nome e senha
2. O ator insere seu nome e senha.
3. O sistema valida o nome e a senha inseridos e registra o ator no sistema.
### Fluxos alternativos
#### **Nome/Senha Inválida**
Se no Fluxo Básico o ator informar um nome e/ou senha inválidos, o sistema apresenta uma mensagem de erro.

O ator pode optar por retornar ao início do Fluxo Básico ou
cancelar o login, no ponto em que o caso de uso termina.

### Requisitos Especiais
Nenhum.
### Pré-Condições
Nenhum.
### Pós-Condições
Se o caso de uso foi bem-sucedido, o ator agora está conectado ao sistema.

Caso contrário, o estado do sistema é inalterado.
### Pontos de Extensãoo
Nenhum.