VIEWS:

CREATE VIEW vw_CadastrosNovos
AS SELECT hora AS Data_Hora, usuario AS Usuario
FROM auditoria_log
WHERE acao = 'INSERT';

SELECT Data_Hora, Usuario
FROM vw_CadastrosNovos
ORDER BY Data_Hora;

DROP VIEW vw_CadastrosNovos;

CREATE VIEW vw_CadastrosAlterados
AS SELECT hora AS Data_Hora, usuario AS Usuario
FROM auditoria_log
WHERE acao = 'UPDATE';

SELECT Data_Hora, Usuario
FROM vw_CadastrosAlterados
ORDER BY Data_Hora;

CREATE VIEW vw_CadastrosExcluidos
AS SELECT hora AS Data_Hora, usuario AS Usuario
FROM auditoria_log
WHERE acao = 'DELETE';

SELECT Data_Hora, Usuario
FROM vw_CadastrosExcluidos
ORDER BY Data_Hora;


STORED PROCEDURES:

CREATE PROCEDURE verValor (varFilme int)
SELECT CONCAT('O valor da sessão do filme ', nome, ' é ', valor) AS Valores
FROM filme
WHERE codigo = varFilme;

CALL verValor(4);

DROP PROCEDURE verValor;


delimiter $$									
create procedure verIdiomas(opcao integer)

begin

    if opcao = 0 then
        select * from filme where codIdioma = 1;
    else
        if opcao = 1 then
          select * from filme where codIdioma = 2;
        else
          select * from filme;
        end if;
    end if;
 end $$

delimiter ;

DROP PROCEDURE verLegendas;

CALL verIdiomas(1);





--Comando para acessar o log de erros:
	show variables like '%log%';













