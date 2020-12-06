
package entidades;

import java.sql.Timestamp;
import java.util.GregorianCalendar;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import apoio.ConnectionFactory;
import apoio.DB_Connection;
import daos.DaoAuditoria;
import entidades.Auditoria;

@Entity
@Table(name = "auditoria")

public class Auditoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "log_id")
    private int log_id;
    @Column(name = "tabela")
    private String tabela;
    @Column(name = "new_codigo")
    private int new_codigo;
    @Column(name = "old_codigo")
    private int old_codigo;
    @Column(name = "new_dia")
    private GregorianCalendar new_dia;
    @Column(name = "old_dia")
    private GregorianCalendar old_dia;    
    @Column(name = "new_valor")
    private double new_valor;
    @Column(name = "old_valor")
    private double old_valor;    
    @Column(name = "new_idioma")
    private String new_idioma;
    @Column(name = "old_idioma")
    private String old_idioma;    
    @Column(name = "new_descricao")
    private String new_descricao;
    @Column(name = "old_descricao")
    private String old_descricao;    
    @Column(name = "new_nome")
    private String new_nome;
    @Column(name = "old_nome")
    private String old_nome;     
    @Column(name = "new_codIdioma")
    private int new_codIdioma;
    @Column(name = "old_codIdioma")
    private int old_codIdioma;
    @Column(name = "new_codClassificacao")
    private int new_codClassificacao;
    @Column(name = "old_codClassififcacao")
    private int old_codClassificacao;
    @Column(name = "new_codLegenda")
    private int new_codLegenda;
    @Column(name = "old_codLegenda")
    private int old_codLegenda;    
    @Column(name = "new_codCategoria")
    private int new_codCategoria;
    @Column(name = "old_codCategoria")
    private int old_codCategoria;       
    @Column(name = "new_cpf")
    private String new_cpf;
    @Column(name = "old_cpf")
    private String old_cpf;
    @Column(name = "new_permissoes")
    private String new_permissoes;
    @Column(name = "old_permissoes")
    private String old_permissoes;    
    @Column(name = "new_horario")
    private GregorianCalendar new_horario;
    @Column(name = "old_horario")
    private GregorianCalendar old_horario;  
    @Column(name = "new_codSala")
    private int new_codSala;
    @Column(name = "old_codSala")
    private int old_codSala;
    @Column(name = "new_codFilme")
    private int new_codFilme;
    @Column(name = "old_codFilme")
    private int old_codFilme;
    @Column(name = "new_fileira")
    private String new_fileira;
    @Column(name = "old_fileira")
    private String old_fileira; 
    @Column(name = "new_numero")
    private int new_numero;
    @Column(name = "old_numero")
    private int old_numero;
    @Column(name = "new_codSessao")
    private int new_codSessao;
    @Column(name = "old_codSessao")
    private int old_codSessao;
    @Column(name = "new_codPoltrona")
    private int new_codPoltrona;
    @Column(name = "old_codPoltrona")
    private int old_codPoltrona;    
    @Column(name = "new_emissao")
    private GregorianCalendar new_emissao;
    @Column(name = "old_emissao")
    private GregorianCalendar old_emissao;  
    @Column(name = "new_total")
    private double new_total;
    @Column(name = "old_total")
    private double old_total;  
    @Column(name = "new_cpfCliente")
    private String new_cpfCliente;
    @Column(name = "old_cpfCliente")
    private String old_cpfCliente;  
    @Column(name = "new_codUsuario")
    private int new_codUsuario;
    @Column(name = "old_codUsuario")
    private int old_codUsuario;
    @Column(name = "new_codVenda")
    private int new_codVenda;
    @Column(name = "old_codVenda")
    private int old_codVenda;
    @Column(name = "new_codIngresso")
    private int new_codIngresso;
    @Column(name = "old_codIngresso")
    private int old_codIngresso;
    @Column(name = "new_duracao")
    private int new_duracao;
    @Column(name = "old_duracao")
    private int old_duracao;
    @Column(name = "acao")
    private String acao;
    @Column(name = "usuario")
    private String usuario; 
    @Column(name = "hora")
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

    public int getOld_codigo() {
        return old_codigo;
    }

    public void setOld_codigo(int old_codigo) {
        this.old_codigo = old_codigo;
    }

    public GregorianCalendar getNew_dia() {
        return new_dia;
    }

    public void setNew_dia(GregorianCalendar new_dia) {
        this.new_dia = new_dia;
    }

    public GregorianCalendar getOld_dia() {
        return old_dia;
    }

    public void setOd_dia(GregorianCalendar old_dia) {
        this.old_dia = old_dia;
    }

    public double getNew_valor() {
        return new_valor;
    }

    public void setNew_valor(double new_valor) {
        this.new_valor = new_valor;
    }

    public double getOld_valor() {
        return old_valor;
    }

    public void setOd_valor(double old_valor) {
        this.old_valor = old_valor;
    }

    public String getNew_idioma() {
        return new_idioma;
    }

    public void setNew_idioma(String new_idioma) {
        this.new_idioma = new_idioma;
    }

    public String getOld_idioma() {
        return old_idioma;
    }

    public void setOld_idioma(String old_idioma) {
        this.old_idioma = old_idioma;
    }

    public String getNew_descricao() {
        return new_descricao;
    }

    public void setNew_descricao(String new_descricao) {
        this.new_descricao = new_descricao;
    }

    public String getOld_descricao() {
        return old_descricao;
    }

    public void setOld_descricao(String old_descricao) {
        this.old_descricao = old_descricao;
    }

    public String getNew_nome() {
        return new_nome;
    }

    public void setNew_nome(String new_nome) {
        this.new_nome = new_nome;
    }

    public String getOld_nome() {
        return old_nome;
    }

    public void setOd_nome(String old_nome) {
        this.old_nome = old_nome;
    }

    public int getNew_codIdioma() {
        return new_codIdioma;
    }

    public void setNew_codIdioma(int new_codIdioma) {
        this.new_codIdioma = new_codIdioma;
    }

    public int getOld_codIdioma() {
        return old_codIdioma;
    }

    public void setOd_codIdioma(int old_codIdioma) {
        this.old_codIdioma = old_codIdioma;
    }

    public int getNew_codClassificacao() {
        return new_codClassificacao;
    }

    public void setNew_codClassificacao(int new_codClassificacao) {
        this.new_codClassificacao = new_codClassificacao;
    }

    public int getOld_codClassificacao() {
        return old_codClassificacao;
    }

    public void setOld_codClassificacao(int old_codClassificacao) {
        this.old_codClassificacao = old_codClassificacao;
    }

    public int getNew_codLegenda() {
        return new_codLegenda;
    }

    public void setNew_codLegenda(int new_codLegenda) {
        this.new_codLegenda = new_codLegenda;
    }

    public int getOld_codLegenda() {
        return old_codLegenda;
    }

    public void setOld_codLegenda(int old_codLegenda) {
        this.old_codLegenda = old_codLegenda;
    }

    public int getNew_codCategoria() {
        return new_codCategoria;
    }

    public void setNew_codCategoria(int new_codCategoria) {
        this.new_codCategoria = new_codCategoria;
    }

    public int getOld_codCategoria() {
        return old_codCategoria;
    }

    public void setOld_codCategoria(int old_codCategoria) {
        this.old_codCategoria = old_codCategoria;
    }

    public String getNew_cpf() {
        return new_cpf;
    }

    public void setNew_cpf(String new_cpf) {
        this.new_cpf = new_cpf;
    }

    public String getOld_cpf() {
        return old_cpf;
    }

    public void setOld_cpf(String old_cpf) {
        this.old_cpf = old_cpf;
    }

    public String getNew_permissoes() {
        return new_permissoes;
    }

    public void setNew_permissoes(String new_permissoes) {
        this.new_permissoes = new_permissoes;
    }

    public String getOld_permissoes() {
        return old_permissoes;
    }

    public void setOld_permissoes(String old_permissoes) {
        this.old_permissoes = old_permissoes;
    }

    public GregorianCalendar getNew_horario() {
        return new_horario;
    }

    public void setNew_horario(GregorianCalendar new_horario) {
        this.new_horario = new_horario;
    }

    public GregorianCalendar getOld_horario() {
        return old_horario;
    }

    public void setOld_horario(GregorianCalendar old_horario) {
        this.old_horario = old_horario;
    }

    public int getNew_codSala() {
        return new_codSala;
    }

    public void setNew_codSala(int new_codSala) {
        this.new_codSala = new_codSala;
    }

    public int getOld_codSala() {
        return old_codSala;
    }

    public void setOld_codSala(int old_codSala) {
        this.old_codSala = old_codSala;
    }

    public int getNew_codFilme() {
        return new_codFilme;
    }

    public void setNew_codFilme(int new_codFilme) {
        this.new_codFilme = new_codFilme;
    }

    public int getOld_codFilme() {
        return old_codFilme;
    }

    public void setOld_codFilme(int old_codFilme) {
        this.old_codFilme = old_codFilme;
    }

    public String getNew_fileira() {
        return new_fileira;
    }

    public void setNew_fileira(String new_fileira) {
        this.new_fileira = new_fileira;
    }

    public String getOld_fileira() {
        return old_fileira;
    }

    public void setOld_fileira(String old_fileira) {
        this.old_fileira = old_fileira;
    }

    public int getNew_numero() {
        return new_numero;
    }

    public void setNew_numero(int new_numero) {
        this.new_numero = new_numero;
    }

    public int getOld_numero() {
        return old_numero;
    }

    public void setOld_numero(int old_numero) {
        this.old_numero = old_numero;
    }

    public int getNew_codSessao() {
        return new_codSessao;
    }

    public void setNew_codSessao(int new_codSessao) {
        this.new_codSessao = new_codSessao;
    }

    public int getOld_codSessao() {
        return old_codSessao;
    }

    public void setOld_codSessao(int old_codSessao) {
        this.old_codSessao = old_codSessao;
    }

    public int getNew_codPoltrona() {
        return new_codPoltrona;
    }

    public void setNew_codPoltrona(int new_codPoltrona) {
        this.new_codPoltrona = new_codPoltrona;
    }

    public int getOld_codPoltrona() {
        return old_codPoltrona;
    }

    public void setOld_codPoltrona(int old_codPoltrona) {
        this.old_codPoltrona = old_codPoltrona;
    }

    public GregorianCalendar getNew_emissao() {
        return new_emissao;
    }

    public void setNew_emissao(GregorianCalendar new_emissao) {
        this.new_emissao = new_emissao;
    }

    public GregorianCalendar getOld_emissao() {
        return old_emissao;
    }

    public void setOld_emissao(GregorianCalendar old_emissao) {
        this.old_emissao = old_emissao;
    }

    public double getNew_total() {
        return new_total;
    }

    public void setNew_total(double new_total) {
        this.new_total = new_total;
    }

    public double getOld_total() {
        return old_total;
    }

    public void setOld_total(double old_total) {
        this.old_total = old_total;
    }

    public String getNew_cpfCliente() {
        return new_cpfCliente;
    }

    public void setNew_cpfCliente(String new_cpfCliente) {
        this.new_cpfCliente = new_cpfCliente;
    }

    public String getOld_cpfCliente() {
        return old_cpfCliente;
    }

    public void setOld_cpfCliente(String old_cpfCliente) {
        this.old_cpfCliente = old_cpfCliente;
    }

    public int getNew_codUsuario() {
        return new_codUsuario;
    }

    public void setNew_codUsuario(int new_codUsuario) {
        this.new_codUsuario = new_codUsuario;
    }

    public int getOld_codUsuario() {
        return old_codUsuario;
    }

    public void setOld_codUsuario(int old_codUsuario) {
        this.old_codUsuario = old_codUsuario;
    }

    public int getNew_codVenda() {
        return new_codVenda;
    }

    public void setNew_codVenda(int new_codVenda) {
        this.new_codVenda = new_codVenda;
    }

    public int getOld_codVenda() {
        return old_codVenda;
    }

    public void setOld_codVenda(int old_codVenda) {
        this.old_codVenda = old_codVenda;
    }

    public int getNew_codIngresso() {
        return new_codIngresso;
    }

    public void setNew_codIngresso(int new_codIngresso) {
        this.new_codIngresso = new_codIngresso;
    }

    public int getOld_codIngresso() {
        return old_codIngresso;
    }

    public void setOld_codIngresso(int old_codIngresso) {
        this.old_codIngresso = old_codIngresso;
    }

    public int getNew_duracao() {
        return new_duracao;
    }

    public void setNew_duracao(int new_duracao) {
        this.new_duracao = new_duracao;
    }

    public int getOld_duracao() {
        return old_duracao;
    }

    public void setOld_duracao(int old_duracao) {
        this.old_duracao = old_duracao;
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
