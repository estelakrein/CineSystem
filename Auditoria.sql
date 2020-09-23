DESENVOLVIMENTO TABELA DE AUDITORIA:

create table auditoria_log (  
      log_id int auto_increment primary key,  	--1 para essa tabela
      new_id int,  								--1 para todas as tabelas 
      old_id int,  								--1 para todas as tabelas 
	  new_codigo int,  							--1 para todas as tabelas 
      old_codigo int,  							--1 para todas as tabelas 
      new_dia datetime,  						--para as tabelas que possuem data
      old_dia datetime, 						--para as tabelas que possuem data
      new_valor DECIMAL(15,4),					--para as tabelas que possuem valores 	  
      old_valor DECIMAL(15,4),  				--para as tabelas que possuem valores
	  new_idioma varchar(50),					--para as tabelas que possuem idioma
	  old_idioma varchar(50),					--para as tabelas que possuem idioma
	  new_descricao varchar(150),				--para as tabelas que possuem descricao
	  old_descricao varchar(150),				--para as tabelas que possuem descricao
	  new_nome varchar(250),					--para as tabelas que possuem nome
	  old_nome varchar(250),					--para as tabelas que possuem nome
	  new_codIdioma int,						--para as tabelas que possuem idioma
	  old_codIdioma int,						--para as tabelas que possuem idioma
	  new_codClassificacao int,					--para as tabelas que possuem classificação
	  old_codClassificacao int,					--para as tabelas que possuem classificação
	  new_codLegenda int,						--para as tabelas que possuem legenda
	  old_codLegenda int,						--para as tabelas que possuem legenda
	  new_codCategoria int,						--para as tabelas que possuem categoria
	  old_codCategoria int,						--para as tabelas que possuem categoria
	  new_cpf varchar(11),						--para as tabelas que possuem cpf
	  old_cpf varchar(11),						--para as tabelas que possuem cpf
	  new_permissoes varchar(5),				--para as tabelas que possuem permissoes
	  old_permissoes varchar(5),				--para as tabelas que possuem permissoes
	  new_horario time,							--para as tabelas que possuem horario
	  old_horario time,							--para as tabelas que possuem horario
	  new_codSala int,							--para as tabelas que possuem codigo da sala
	  old_codSala int,							--para as tabelas que possuem codigo da sala
	  new_codFilme int,							--para as tabelas que possuem codigo do filme
	  old_codFilme int,							--para as tabelas que possuem codigo do filme
	  new_fileira varchar(1),					--para as tabelas que possuem fileira
	  old_fileira varchar(1),					--para as tabelas que possuem fileira
	  new_numero int,							--para as tabelas que possuem numero
	  old_numero int,							--para as tabelas que possuem numero
	  new_codSessao int,						--para as tabelas que possuem codigo da sessao
	  old_codSessao int,						--para as tabelas que possuem codigo da sessao
	  new_codPoltrona int,						--para as tabelas que possuem codigo da poltrona
	  old_codPoltrona int,						--para as tabelas que possuem codigo da poltrona
	  new_emissao date,							--para as tabelas que possuem data de emissao
	  old_emissao date,							--para as tabelas que possuem data de emissao
	  new_total DECIMAL(15,4),					--para as tabelas que possuem valor total
	  old_total DECIMAL(15,4),					--para as tabelas que possuem valor total
	  new_cpfCliente varchar(11),				--para as tabelas que possuem numero cpf do cliente
	  old_cpfCliente varchar(11),				--para as tabelas que possuem numero cpf do cliente
	  new_codUsuario int,						--para as tabelas que possuem codigo do usuario
	  old_codUsuario int,						--para as tabelas que possuem codigo do usuario
	  new_codVenda int,							--para as tabelas que possuem codigo da venda
	  old_codVenda int,							--para as tabelas que possuem codigo da venda
	  new_codIngresso int,						--para as tabelas que possuem codigo do ingresso
	  old_codIngresso int,						--para as tabelas que possuem codigo do ingresso
      acao varchar(6),       					--1 para todas as tabelas
      usuario varchar(50),  					--1 para todas as tabelas
      hora timestamp							--1 para todas as tabelas  
 );
 
 
create table auditoria_log (  
      log_id int auto_increment primary key,  	
      new_id int,  								 
      old_id int,  								 
	  new_codigo int,  							 
      old_codigo int,  							 
      new_dia datetime,  						
      old_dia datetime, 						
      new_valor DECIMAL(15,4),					 	  
      old_valor DECIMAL(15,4),  				
	  new_idioma varchar(50),					
	  old_idioma varchar(50),					
	  new_descricao varchar(150),				
	  old_descricao varchar(150),				
	  new_nome varchar(250),					
	  old_nome varchar(250),					
	  new_codIdioma int,						
	  old_codIdioma int,						
	  new_codClassificacao int,					
	  old_codClassificacao int,					
	  new_codLegenda int,						
	  old_codLegenda int,						
	  new_codCategoria int,						
	  old_codCategoria int,						
	  new_cpf varchar(11),						
	  old_cpf varchar(11),						
	  new_permissoes varchar(5),				
	  old_permissoes varchar(5),				
	  new_horario time,							
	  old_horario time,							
	  new_codSala int,							
	  old_codSala int,							
	  new_codFilme int,							
	  old_codFilme int,							
	  new_fileira varchar(1),					
	  old_fileira varchar(1),					
	  new_numero int,							
	  old_numero int,							
	  new_codSessao int,						
	  old_codSessao int,						
	  new_codPoltrona int,						
	  old_codPoltrona int,						
	  new_emissao date,							
	  old_emissao date,							
	  new_total DECIMAL(15,4),					
	  old_total DECIMAL(15,4),					
	  new_cpfCliente varchar(11),				
	  old_cpfCliente varchar(11),				
	  new_codUsuario int,						
	  old_codUsuario int,						
	  new_codVenda int,							
	  old_codVenda int,							
	  new_codIngresso int,						
	  old_codIngresso int,
      acao varchar(6),       					
      usuario varchar(50),  					
      hora timestamp							  
 );

***** alteração necessária:
DROP TRIGGER auditoria_log_insert;
DROP TRIGGER auditoria_log_update;
DROP TRIGGER auditoria_log_delete;
DROP TRIGGER auditoria_log_insert_venda;

ALTER TABLE auditoria_log
ADD  new_duracao  int;
ALTER TABLE auditoria_log
ADD  old_duracao  int;

ALTER TABLE sessao
CHANGE data dia time;

ALTER TABLE filme DROP COLUMN duracao;
 
TRIGGERS DE AUDITORIA PARA A TABELA SALA:

create trigger auditoria_log_insert_sala after insert on sala  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao acao, usuario, hora)   
                     values(null,null,new.codigo,null,null,null,null,null,null,null,new.descricao,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'INSERT', user(), now());

create trigger auditoria_log_update_sala after update on sala  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,old.codigo,null,null,null,null,null,null,new.descricao,old.descricao,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'UPDATE', user(), now());

create trigger auditoria_log_delete_sala after delete on sala  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,old.codigo,null,null,null,null,null,null,null,old.descricao,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'DELETE', user(), now());


TESTES DAS TRIGGERS PARA A TABELA SALA:

insert into sala (descricao) values ('Sala 1 Andar');
insert into sala (descricao) values ('Sala 3 Andar');
insert into sala (descricao) values ('Sala 3 Andar');
update sala set descricao = 'Sala 2 Andar' where codigo = 4;  
delete from sala where codigo = 6; 
 
 
TRIGGERS DE AUDITORIA PARA A TABELA IDIOMA:

create trigger auditoria_log_insert_idioma after insert on idioma  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,null,null,null,null,null,new.idioma,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'INSERT', user(), now());

create trigger auditoria_log_update_idioma after update on idioma
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,old.codigo,null,null,null,null,new.idioma,old.idioma,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'UPDATE', user(), now());

create trigger auditoria_log_delete_idioma after delete on idioma  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,old.codigo,null,null,null,null,null,old.idioma,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'DELETE', user(), now());


TRIGGERS DE AUDITORIA PARA A TABELA CLASSIFICAÇÃO:

create trigger auditoria_log_insert_classificacao after insert on classificacao
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,null,null,null,null,null,null,null,new.descricao,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'INSERT', user(), now());

create trigger auditoria_log_update_classificacao after update on classificacao  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,old.codigo,null,null,null,null,null,null,new.descricao,old.descricao,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'UPDATE', user(), now());

create trigger auditoria_log_delete_classificacao after delete on classificacao 
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,old.codigo,null,null,null,null,null,null,null,old.descricao,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'DELETE', user(), now());

insert into classificacao (descricao) values ('10 anos ou mais');


TRIGGERS DE AUDITORIA PARA A TABELA CATEGORIA:

create trigger auditoria_log_insert_categoria after insert on categoria  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,null,null,null,null,null,null,null,new.descricao,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'INSERT', user(), now());

create trigger auditoria_log_update_categoria after update on categoria  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,old.codigo,null,null,null,null,null,null,new.descricao,old.descricao,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'UPDATE', user(), now());

create trigger auditoria_log_delete_categoria after delete on categoria
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,old.codigo,null,null,null,null,null,null,null,old.descricao,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'DELETE', user(), now());

insert into categoria (descricao) values ('Terror');

TRIGGERS DE AUDITORIA PARA A TABELA LEGENDA:

create trigger auditoria_log_insert_legenda after insert on legenda  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,null,null,null,null,null,null,null,new.descricao,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'INSERT', user(), now());

create trigger auditoria_log_update_legenda after update on legenda  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,old.codigo,null,null,null,null,null,null,new.descricao,old.descricao,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'UPDATE', user(), now());

create trigger auditoria_log_delete_legenda after delete on legenda  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,old.codigo,null,null,null,null,null,null,null,old.descricao,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'DELETE', user(), now());


TRIGGERS DE AUDITORIA PARA A TABELA FILME:

create trigger auditoria_log_insert_filme after insert on filme  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,null,null,null,new.valor,null,null,null,null,null,null,null,new.codIdioma,null,new.codClassificacao,null,new.codLegenda,null,new.codCategoria,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,new.duracao,null, 'INSERT', user(), now());

create trigger auditoria_log_update_filme after update on filme  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,old.codigo,null,null,new.valor,old.valor,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,new.duracao,old.duracao, 'UPDATE', user(), now());

create trigger auditoria_log_delete_filme after delete on filme  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,old.codigo,null,null,null,old.valor,null,null,null,null,null,null,null,old.codIdioma,null,old.codClassificacao,null,old.codLegenda,null,old.codCategoria,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,old.duracao, 'DELETE', user(), now());

insert into filme (nome, duracao, valor, codIdioma, codClassificacao, codCategoria, codLegenda) values ('Terror na Universidade', 90, 10.00, 1,1,1,1);


TRIGGERS DE AUDITORIA PARA A TABELA USUÁRIO:

create trigger auditoria_log_insert_usuario after insert on usuario  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,null,null,null,null,null,null,null,null,null,new.nome,null,null,null,null,null,null,null,null,null,new.cpf,null,new.permissoes,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'INSERT', user(), now());

create trigger auditoria_log_update_usuario after update on usuario  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,old.codigo,null,null,null,null,null,null,null,null,new.nome,old.nome,null,null,null,null,null,null,null,null,new.cpf,old.cpf,new.permissoes,old.permissoes,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'UPDATE', user(), now());

create trigger auditoria_log_delete_usuario after delete on usuario  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,old.codigo,null,null,null,null,null,null,null,null,null,old.nome,null,null,null,null,null,null,null,null,old.cpf,null,old.permissoes,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'DELETE', user(), now());


TRIGGERS DE AUDITORIA PARA A TABELA SESSÃO:

create trigger auditoria_log_insert_sessao after insert on sessao  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,null,new.dia,null,new.valor,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,new.horario,null,new.codSala,null,new.codFilme,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'INSERT', user(), now());

create trigger auditoria_log_update_sessao after update on sessao 
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,old.codigo,new.dia,old.dia,new.valor,old.valor,new.codSala,old.codSala,new.codFilme,old.codFilme,null,null,null,null,null,null,null,null,null,null,null,null,null,null,new.horario,old.horario,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'UPDATE', user(), now());

create trigger auditoria_log_delete_sessao after delete on sessao  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,old.codigo,null,old.dia,null,old.valor,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,old.horario,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'DELETE', user(), now());


TRIGGERS DE AUDITORIA PARA A TABELA POLTRONA:

create trigger auditoria_log_insert_poltrona after insert on poltrona  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,new.codSala,null,null,null,new.fileira,null,new.numero,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'INSERT', user(), now());

create trigger auditoria_log_update_poltrona after update on poltrona 
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,old.codigo,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,new.codSala,old.codSala,new.fileira,old.fileira,new.numero,old.numero,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'UPDATE', user(), now());

create trigger auditoria_log_delete_poltrona after delete on poltrona  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,old.codigo,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,old.codSala,null,old.fileira,null,old.numero,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'DELETE', user(), now());


TRIGGERS DE AUDITORIA PARA A TABELA INGRESSO:

create trigger auditoria_log_insert_ingresso after insert on ingresso  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,new.codSessao,null,new.codPoltrona,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'INSERT', user(), now());

create trigger auditoria_log_update_ingresso after update on ingresso 
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,old.codigo,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,new.codSessao,old.codSessao,new.codPoltrona,old.codPoltrona,null,null,null,null,null,null,null,null,null,null,null,null,null, 'UPDATE', user(), now());

create trigger auditoria_log_delete_ingresso after delete on ingresso  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,old.codigo,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,old.codSessao,null,old.codPoltrona,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'DELETE', user(), now());


TRIGGERS DE AUDITORIA PARA A TABELA VENDA:

create trigger auditoria_log_insert_venda after insert on venda 
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,new.numero,null,null,null,null,null,new.emissao,null,new.total,null,new.cpfCliente,null,new.codUsuario,null,null,null,null,null,null,null, 'INSERT', user(), now());

create trigger auditoria_log_update_venda after update on venda 
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,new.numero,old.numero,null,null,null,null,null,new.emissao,old.emissao,new.total,old.total,new.cpfCliente,old.cpfCliente,null,null,null,null,null,null,null, 'UPDATE', user(), now());

create trigger auditoria_log_delete_venda after delete on venda  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,old.numero,null,null,null,null,null,old.emissao,null,old.total,null,old.cpfCliente,null,old.codUsuario,null,null,null,null,null,null, 'DELETE', user(), now());


TRIGGERS DE AUDITORIA PARA A TABELA INGRESSOVENDA:

create trigger auditoria_log_insert_ingressovenda after insert on ingressovenda  
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,null,null,null,new.valor,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,new.codVenda,null,new.codIngresso,null,null,null, 'INSERT', user(), now());

create trigger auditoria_log_update_ingressovenda after update on ingressovenda 
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,null,null,null,new.valor,old.valor,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,nw.codVenda,old.codVenda,new.codIngresso,old.codIngresso,null,null, 'UPDATE', user(), now());

create trigger auditoria_log_delete_ingressovenda after delete on ingressovenda 
	for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,null,null,null,null,old.valor,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,old.codVenda,null,old.codIngresso,null,null, 'DELETE', user(), now());








