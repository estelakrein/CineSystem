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




















