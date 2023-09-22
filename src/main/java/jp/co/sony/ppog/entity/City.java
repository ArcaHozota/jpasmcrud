package jp.co.sony.ppog.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 都市テーブルcityのエンティティ
 *
 * @author ArcaHozota
 * @since 2.17
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "city")
@Proxy(lazy = false)
@NamedQuery(name = "City.saiban", query = "select count(c.id) + 1 from City c")
@NamedQuery(name = "City.removeById", query = "update City as c set c.deleteFlg = 'removed' where c.id =:id")
@NamedQuery(name = "City.getCityInfos", query = "select cn from City cn inner join cn.country where cn.country.code"
		+ " = cn.countryCode and cn.deleteFlg = 'visible'")
public class City implements Serializable {

	private static final long serialVersionUID = 1815689293387304425L;

	/**
	 * This field corresponds to the database column ID
	 */
	@Id
	private Long id;

	/**
	 * This field corresponds to the database column NAME
	 */
	@Column(nullable = false)
	private String name;

	/**
	 * This field corresponds to the database column COUNTRY_CODE
	 */
	@Column(nullable = false)
	private String countryCode;

	/**
	 * This field corresponds to the database column DISTRICT
	 */
	@Column(nullable = false)
	private String district;

	/**
	 * This field corresponds to the database column POPULATION
	 */
	@Column(nullable = false)
	private Long population;

	/**
	 * This field corresponds to the database column LOGIC_DELETE_FLG
	 */
	@Column(nullable = false)
	private String deleteFlg;

	@ManyToOne
	@JoinColumn(name = "code")
	private Country country;
}