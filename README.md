###### Disciplina: Programação Orientada a Objetos
###### Curso: Engenharia de Software
###### Professora: Aline Mello

## TRABALHO PRÁTICO 1
O trabalho prático 1 aborda os seguintes assuntos: classes, objetos, associações, herança, polimorfismo e interface.
### ENUNCIADO
Ante a atual situação econômica do Brasil, com o intenso crescimento da movimentação
financeira, torna-se cada vez mais indispensável a demanda por recursos, fazendo assim com que as instituições financeiras assumam um papel cada vez mais preponderante no meio econômico nacional. Neste contexto, cada grupo deve desenvolver um Sistema de Controle Bancário que gerencia um conjunto de clientes e um conjunto de contas bancárias.
#### Cliente
Um cliente possui, no mínimo, as seguintes informações: nome, endereço, CEP, telefone, renda e situação. A situação de um cliente é ativa quando ele é vinculado a pelo menos uma conta bancária ativa. Em caso contrário, a situação do cliente é inativa. Um cliente pode ser uma <b>pessoa física</b> ou uma <b>pessoa jurídica</b>. Um cliente pessoa física possui todas as informações de um cliente acrescido do CPF e RG, onde o CPF é usado para garantir a unicidade entre os clientes pessoa física. Um cliente pessoa jurídica possui todas as informações do cliente acrescido do CNPJ, onde o CNPJ é usado para garantir a unicidade entre os clientes pessoa jurídica.
#### Conta bancária
Uma conta bancária possui um número único, uma data de abertura, uma data de encerramento, uma situação (ativa ou inativa), uma senha, um saldo e é vinculada a um
cliente do banco. Para que uma conta seja aberta é necessário que o cliente já esteja
cadastrado. Uma conta é aberta como ativa e migra para inativa quando é encerrada.
Somente contas inativas possuem data de encerramento válida. Todas as operações de
uma conta bancária só podem ser efetuadas mediante a informação prévia da senha, à
exceção da operação de abertura da conta.

Existem três tipos de conta: <b>corrente</b>, <b>especial</b> e <b>poupança</b>.

A conta corrente permite as seguintes operações: abrir a conta, encerrar a conta, validar a senha, verificar o saldo, sacar um valor e depositar um valor. A operação de saque é efetuada somente se o saldo da conta é igual ou superior ao valor que deve ser sacado. A operação de depósito é efetuada se o valor a ser depositado é maior do que zero.

A <b>conta especial</b> é uma conta corrente que possui um limite, ou seja, a operação de saque considera o saldo da conta acrescido do limite para decidir se o saque é efetuado ou não. Além das operações da conta corrente, a conta especial permite alterar o limite.

A <b>conta poupança</b> permite as mesmas operações da conta corrente, mas rende juros a cada 30 dias. Os rendimentos entram por data base, ou seja, se o depósito for efetuado no dia 5, o rendimento será creditado no dia 5 do mês seguinte, e assim vale para todas aplicações ao longo do mês. A única exceção são os dias 29, 30 e 31 que terão como dia base o dia primeiro do mês seguinte. No caso do saque, se houver saldo na data base correspondente ao dia do saque, o valor retirado será subtraído do saldo dessa data base. Por exemplo, se o resgate for feito no dia 15, o valor será retirado do saldo da data base 15. Caso o cliente saque um valor maior que o saldo de uma determinada data base, o débito ocorrerá nas datas anteriores mais próximas. Além das operações da conta corrente, a conta poupança permite alterar o rendimento de uma determinada data base e consultar o saldo por data base.


<b>O usuário do Sistema de Controle Bancário deve ser capaz de:</b>
<ol>
    <li>
        cadastrar, consultar, alterar e excluir clientes. A operação de excluir um cliente só pode ser realizada se o cliente não possuir nenhuma conta bancária associada (ativa ou inativa).
    </li>
    <li>
    realizar todas as operações disponíveis para cada tipo de conta bancária. Lembrando que, à exceção da abertura de conta, as demais operações somente podem ser realizadas após a validação da senha da conta
    </li>
    <li>
    consultar todas as contas vinculadas a um determinado cliente.
    </li>
    <li>
    pesquisar (i) a conta corrente com maior saldo; (ii) a conta corrente com menor
saldo; (iii) a conta poupança com maior saldo; (iv) a conta poupança com menor saldo; (v) a conta especial com maior saldo considerando o limite; (vi) a conta
especial com menor saldo considerando o limite (vii) o cliente pessoa física com
maior saldo, considerando todas as contas bancárias as quais ele está vinculado;
(viii) o cliente pessoa física com menor saldo, considerando todas as contas bancárias as quais ele está vinculado; (ix) o cliente pessoa jurídica com maior saldo, considerando todas as contas bancárias as quais ele está vinculado; (x) o cliente pessoa jurídica com menor saldo, considerando todas as contas bancárias as quais ele está vinculado;
    </li>
    <li>
    persistir o conjunto de clientes e o conjunto de contas bancárias em arquivo(s)
binário(s).
    </li>
</ol>

O sistema de controle bancário deve possuir uma interface com usuário que pode
ser do tipo console ou gráfica.

Todos os alunos são responsáveis pela criação da versão final integrada que deve ter pré-cadastrado, no mínimo, cinco clientes de cada tipo e dez contas bancárias de cada
tipo.
### INSTRUÇÕES
<ul>
    <li>
    O trabalho deve ser realizado em trios e entregue até às 23h59 do dia 16/01/2021 via Moodle, por apenas um integrante do grupo.
    </li>
    <li>
        O trabalho deve ser entregue na forma de um arquivo compactado nomeado da
seguinte forma TP1_<nome1>_<nome2>_<nome3>.zip ou TP1_<nome1>_<nome2>_<nome3>.rar, onde <nome1>, <nome2> e <nome3> são os nomes dos integrantes do trio.
    </li>
    <li>Faça o trabalho apenas com o seu trio</li>
    <li>Utilize o javadoc e faça comentários pertinentes no código.</li>
    <li>Em caso de dúvida entre em contato por email alinemello@unipampa.edu.br.</li>
</ul>

### APRESENTAÇÃO
A apresentação deve ser realizada no dia 17/01/2022 no horário da aula. Durante a
apresentação, o sistema produzido deve ser apresentado, portanto cabe ao trio escolher que operações serão realizadas e os dados a serem inseridos, bem como conhecer os resultados esperados. Adicionalmente, a professora irá analisar partes de código escolhidas aleatoriamente.
### AVALIAÇÃO
O TP1 vale 10 pontos e tem peso igual a 10% na nota final da disciplina. Serão avaliados somente trabalhos que forem apresentados.
#### Pontuação

Classes referentes aos clientes e contas [2 pontos]
Classe referente a coleção de clientes e contas [2 pontos]
Interface com o usuário que permita o controle dos clientes [2 pontos]
Interface com o usuário que permita o controle das contas bancárias [2 pontos]
Persistência em arquivo [1 ponto]
Pesquisas [1 ponto]


<b>Todo o sistema deve observar os conceitos da orientação a objetos.</b>
