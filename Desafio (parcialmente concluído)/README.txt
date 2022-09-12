Projeto parcialmento concluído.

Este arquivo é composto por:
- SQL TextFile do banco de dados;
- Imagens do Banco de dados e das páginas usando Primefaces;
- Pasta do ProjetoAgendamentoConsultas.

O Projeto não está funcional.

Consegue se conectar ao banco de dados e fazer as alterações CRUD usando o framework Hibernate, 
através da classe "Programa" de maneira manual.
Essa classe está comentada, porque foi utilizada para testar se a conexão, consulta e modificação
da base de dados funcionava utilizando o Hibernate. 

Foi tentado se equalizar várias abordagens diferentes tentando se achar uma maneira satisfatória de 
permitir a interligaçao desses métodos com os dados recebidos através do servidor.
Mas por nenhuma delas se conseguiu implementar através das IDEs utilizadas.
Existem classes redundantes no projeto, por causa dessas tentativas por abordagens diversas.
Nenhuma conclusiva.

O projeto consegue gerar uma página com elementos do PrimeFaces exibidos em: 
Menu Principal:
http://localhost:8080/ProjetoAgendamentoConsultas/faces/templatePrincipal.xhtml
Criar Agendamento:
http://localhost:8080/ProjetoAgendamentoConsultas/faces/criarAgendamento.xhtml
Alterar Agendamento:
http://localhost:8080/ProjetoAgendamentoConsultas/faces/alterarAgendamento.xhtml
Do menu principal se pode acessar a página de criação e a de alteração de cadastros.
Do menu principal se pode acessar a página de criação e a de alteração de cadastros.
Os campos para receber o nome do médico, especialidade, data e telefone estão exibindo
as opções a serem escolhidas. 
Mas sem conexão com o banco de dados.
Mas o projeto consistiria de algumas páginas com visual aprimorado com ligações entre si e que 
permitiriam consulta e alteração no banco de dados.

Detalhes do que foi planejado (e não plenamente executado):
- O campo Dia seria um inteiro escolhido de uma lista oferecida ao se clicar no campo ao lado do 
escrito dia, com isso se evitaria ter que se efetuar a verificação se o número entrado seria inteiro 
e dentro do intervalo desejado, o PrimeFaces está pronto, podendo ser melhorado, mas falta a conexão
com o banco de dados;
- Horário seria uma String, similar a escolha do dia, assim evitando a marcação de horários inválidos;
- Mesmo caso da escolha do médico;
- O campo Especialidade mostraria como única opção clicável a especilidade do médico escolhido.
- Para o mesmo médico, os horários que já tivessem sido marcado apareceriam em cor diferente e não
seriam clicáveis, o metódo que receberia essa informação já alteraria a propriedade desse campo, mudando a 
cor e tornando não clicável. Com dias completamente lotados, aconteceria o mesmo;
- No caso da alteração de um agendamento não se poderia alterar o médico, dia e horário. Para isso seria 
necessário excluir o Agendamento e criar um novo, para evitar conflitos de mais de um acesso simultâneo, e
para o aproveitamento da tela de criação de Agendamento.
- Os dias que a Clínica não funciona, já começariam não clicáveis, como finais de semana e feriados;
- O esquema inicial preveria os agendamentos apenas em um mês, o que poderia ser estendido conforme o 
andamento do projeto; 
- Somente os horários que os médicos atendem seriam incluídos, seria definido um horário de começo e
final do expediente do médico, com horários de atendimento a cada meia hora; 
- Seria apresentada uma tela de entrada no sistema que levaria a uma de opção entre de criação, consulta, 
alteração e deleção de agendamentos e uma tela para cada uma dessas quatro atividades.


Problemas de configuração de algums componentes da IDE, do projeto e de outros softwares de apoio e a falta de 
um conhecimento mais aprofundado do hibernate, principalmente da sua interligação em projetos que utilizam
Web, não permitiram a conclusão desse desafio da maneira desejada.

