package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Filme.class)
public abstract class Filme_ {

	public static volatile SingularAttribute<Filme, Legenda> legenda;
	public static volatile SingularAttribute<Filme, Integer> codigo;
	public static volatile SingularAttribute<Filme, Categoria> categoria;
	public static volatile SingularAttribute<Filme, Double> valor;
	public static volatile SingularAttribute<Filme, String> nome;
	public static volatile SingularAttribute<Filme, Idioma> idioma;
	public static volatile SingularAttribute<Filme, Classificacao> classificacao;
	public static volatile SingularAttribute<Filme, Integer> duracao;

}

