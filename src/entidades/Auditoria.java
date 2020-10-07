
package entidades;

import java.sql.Timestamp;
import java.util.GregorianCalendar;

public class Auditoria {
    private int log_id;
    private String tabela;
    private int new_codigo;
    private int od_codigo;
    private GregorianCalendar new_dia;
    private GregorianCalendar od_dia;
    private double new_valor;
    private double od_valor;
    private String new_idioma;
    private String od_idioma;
    private String new_descricao;
    private String od_descricao;
    private String new_nome;
    private String od_nome;
    private int new_codIdioma;
    private int od_codIdioma;
    private int new_codClassificacao;
    private int od_codClassificacao;
    private int new_codLegenda;
    private int od_codLegenda;
    private int new_codCategoria;
    private int od_codCategoria;
    private String new_cpf;
    private String od_cpf;
    private String new_permissoes;
    private String od_permissoes;
    private GregorianCalendar new_horario;
    private GregorianCalendar od_horario;
    private int new_codSala;
    private int od_codSala;
    private int new_codFilme;
    private int od_codFilme;
    private String new_fileira;
    private String od_fileira;
    private int new_numero;
    private int od_numero;
    private int new_codSessao;
    private int od_codSessao;
    private int new_codPoltrona;
    private int od_codPoltrona;
    private GregorianCalendar new_emissao;
    private GregorianCalendar od_emissao;
    private double new_total;
    private double od_total; 
    private String new_cpfCliente;
    private String od_cpfCliente;
    private int new_codUsuario;
    private int od_codUsuario;
    private int new_codVenda;
    private int od_codVenda;
    private int new_codIngresso;
    private int od_codIngresso;
    private int new_duracao;
    private int od_duracao;
    private String acao;
    private String usuario;
    private Timestamp hora;

    public int getLog_id() {
        return log_id;
    }

    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    public String getTabela() {
        return tabela;
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    public int getNew_codigo() {
        return new_codigo;
    }

    public void setNew_codigo(int new_codigo) {
        this.new_codigo = new_codigo;
    }

    public int getOd_codigo() {
        return od_codigo;
    }

    public void setOd_codigo(int od_codigo) {
        this.od_codigo = od_codigo;
    }

    public GregorianCalendar getNew_dia() {
        return new_dia;
    }

    public void setNew_dia(GregorianCalendar new_dia) {
        this.new_dia = new_dia;
    }

    public GregorianCalendar getOd_dia() {
        return od_dia;
    }

    public void setOd_dia(GregorianCalendar od_dia) {
        this.od_dia = od_dia;
    }

    public double getNew_valor() {
        return new_valor;
    }

    public void setNew_valor(double new_valor) {
        this.new_valor = new_valor;
    }

    public double getOd_valor() {
        return od_valor;
    }

    public void setOd_valor(double od_valor) {
        this.od_valor = od_valor;
    }

    public String getNew_idioma() {
        return new_idioma;
    }

    public void setNew_idioma(String new_idioma) {
        this.new_idioma = new_idioma;
    }

    public String getOd_idioma() {
        return od_idioma;
    }

    public void setOd_idioma(String od_idioma) {
        this.od_idioma = od_idioma;
    }

    public String getNew_descricao() {
        return new_descricao;
    }

    public void setNew_descricao(String new_descricao) {
        this.new_descricao = new_descricao;
    }

    public String getOd_descricao() {
        return od_descricao;
    }

    public void setOd_descricao(String od_descricao) {
        this.od_descricao = od_descricao;
    }

    public String getNew_nome() {
        return new_nome;
    }

    public void setNew_nome(String new_nome) {
        this.new_nome = new_nome;
    }

    public String getOd_nome() {
        return od_nome;
    }

    public void setOd_nome(String od_nome) {
        this.od_nome = od_nome;
    }

    public int getNew_codIdioma() {
        return new_codIdioma;
    }

    public void setNew_codIdioma(int new_codIdioma) {
        this.new_codIdioma = new_codIdioma;
    }

    public int getOd_codIdioma() {
        return od_codIdioma;
    }

    public void setOd_codIdioma(int od_codIdioma) {
        this.od_codIdioma = od_codIdioma;
    }

    public int getNew_codClassificacao() {
        return new_codClassificacao;
    }

    public void setNew_codClassificacao(int new_codClassificacao) {
        this.new_codClassificacao = new_codClassificacao;
    }

    public int getOd_codClassificacao() {
        return od_codClassificacao;
    }

    public void setOd_codClassificacao(int od_codClassificacao) {
        this.od_codClassificacao = od_codClassificacao;
    }

    public int getNew_codLegenda() {
        return new_codLegenda;
    }

    public void setNew_codLegenda(int new_codLegenda) {
        this.new_codLegenda = new_codLegenda;
    }

    public int getOd_codLegenda() {
        return od_codLegenda;
    }

    public void setOd_codLegenda(int od_codLegenda) {
        this.od_codLegenda = od_codLegenda;
    }

    public int getNew_codCategoria() {
        return new_codCategoria;
    }

    public void setNew_codCategoria(int new_codCategoria) {
        this.new_codCategoria = new_codCategoria;
    }

    public int getOd_codCategoria() {
        return od_codCategoria;
    }

    public void setOd_codCategoria(int od_codCategoria) {
        this.od_codCategoria = od_codCategoria;
    }

    public String getNew_cpf() {
        return new_cpf;
    }

    public void setNew_cpf(String new_cpf) {
        this.new_cpf = new_cpf;
    }

    public String getOd_cpf() {
        return od_cpf;
    }

    public void setOd_cpf(String od_cpf) {
        this.od_cpf = od_cpf;
    }

    public String getNew_permissoes() {
        return new_permissoes;
    }

    public void setNew_permissoes(String new_permissoes) {
        this.new_permissoes = new_permissoes;
    }

    public String getOd_permissoes() {
        return od_permissoes;
    }

    public void setOd_permissoes(String od_permissoes) {
        this.od_permissoes = od_permissoes;
    }

    public GregorianCalendar getNew_horario() {
        return new_horario;
    }

    public void setNew_horario(GregorianCalendar new_horario) {
        this.new_horario = new_horario;
    }

    public GregorianCalendar getOd_horario() {
        return od_horario;
    }

    public void setOd_horario(GregorianCalendar od_horario) {
        this.od_horario = od_horario;
    }

    public int getNew_codSala() {
        return new_codSala;
    }

    public void setNew_codSala(int new_codSala) {
        this.new_codSala = new_codSala;
    }

    public int getOd_codSala() {
        return od_codSala;
    }

    public void setOd_codSala(int od_codSala) {
        this.od_codSala = od_codSala;
    }

    public int getNew_codFilme() {
        return new_codFilme;
    }

    public void setNew_codFilme(int new_codFilme) {
        this.new_codFilme = new_codFilme;
    }

    public int getOd_codFilme() {
        return od_codFilme;
    }

    public void setOd_codFilme(int od_codFilme) {
        this.od_codFilme = od_codFilme;
    }

    public String getNew_fileira() {
        return new_fileira;
    }

    public void setNew_fileira(String new_fileira) {
        this.new_fileira = new_fileira;
    }

    public String getOd_fileira() {
        return od_fileira;
    }

    public void setOd_fileira(String od_fileira) {
        this.od_fileira = od_fileira;
    }

    public int getNew_numero() {
        return new_numero;
    }

    public void setNew_numero(int new_numero) {
        this.new_numero = new_numero;
    }

    public int getOd_numero() {
        return od_numero;
    }

    public void setOd_numero(int od_numero) {
        this.od_numero = od_numero;
    }

    public int getNew_codSessao() {
        return new_codSessao;
    }

    public void setNew_codSessao(int new_codSessao) {
        this.new_codSessao = new_codSessao;
    }

    public int getOd_codSessao() {
        return od_codSessao;
    }

    public void setOd_codSessao(int od_codSessao) {
        this.od_codSessao = od_codSessao;
    }

    public int getNew_codPoltrona() {
        return new_codPoltrona;
    }

    public void setNew_codPoltrona(int new_codPoltrona) {
        this.new_codPoltrona = new_codPoltrona;
    }

    public int getOd_codPoltrona() {
        return od_codPoltrona;
    }

    public void setOd_codPoltrona(int od_codPoltrona) {
        this.od_codPoltrona = od_codPoltrona;
    }

    public GregorianCalendar getNew_emissao() {
        return new_emissao;
    }

    public void setNew_emissao(GregorianCalendar new_emissao) {
        this.new_emissao = new_emissao;
    }

    public GregorianCalendar getOd_emissao() {
        return od_emissao;
    }

    public void setOd_emissao(GregorianCalendar od_emissao) {
        this.od_emissao = od_emissao;
    }

    public double getNew_total() {
        return new_total;
    }

    public void setNew_total(double new_total) {
        this.new_total = new_total;
    }

    public double getOd_total() {
        return od_total;
    }

    public void setOd_total(double od_total) {
        this.od_total = od_total;
    }

    public String getNew_cpfCliente() {
        return new_cpfCliente;
    }

    public void setNew_cpfCliente(String new_cpfCliente) {
        this.new_cpfCliente = new_cpfCliente;
    }

    public String getOd_cpfCliente() {
        return od_cpfCliente;
    }

    public void setOd_cpfCliente(String od_cpfCliente) {
        this.od_cpfCliente = od_cpfCliente;
    }

    public int getNew_codUsuario() {
        return new_codUsuario;
    }

    public void setNew_codUsuario(int new_codUsuario) {
        this.new_codUsuario = new_codUsuario;
    }

    public int getOd_codUsuario() {
        return od_codUsuario;
    }

    public void setOd_codUsuario(int od_codUsuario) {
        this.od_codUsuario = od_codUsuario;
    }

    public int getNew_codVenda() {
        return new_codVenda;
    }

    public void setNew_codVenda(int new_codVenda) {
        this.new_codVenda = new_codVenda;
    }

    public int getOd_codVenda() {
        return od_codVenda;
    }

    public void setOd_codVenda(int od_codVenda) {
        this.od_codVenda = od_codVenda;
    }

    public int getNew_codIngresso() {
        return new_codIngresso;
    }

    public void setNew_codIngresso(int new_codIngresso) {
        this.new_codIngresso = new_codIngresso;
    }

    public int getOd_codIngresso() {
        return od_codIngresso;
    }

    public void setOd_codIngresso(int od_codIngresso) {
        this.od_codIngresso = od_codIngresso;
    }

    public int getNew_duracao() {
        return new_duracao;
    }

    public void setNew_duracao(int new_duracao) {
        this.new_duracao = new_duracao;
    }

    public int getOd_duracao() {
        return od_duracao;
    }

    public void setOd_duracao(int od_duracao) {
        this.od_duracao = od_duracao;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Timestamp getHora() {
        return hora;
    }

    public void setHora(Timestamp hora) {
        this.hora = hora;
    }
    
    
    
}
