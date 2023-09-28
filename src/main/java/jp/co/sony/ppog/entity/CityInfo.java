package jp.co.sony.ppog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "city_info")
public class CityInfo {

	/**
	 * 都市ID
	 */
	@Id
	private Long id;

	/**
	 * 都市名
	 */
	@Column(nullable = false)
	private String name;

	/**
	 * 大陸
	 */
	@Column(nullable = false)
	private String continent;

	/**
	 * 国家
	 */
	@Column(nullable = false)
	private String nation;

	/**
	 * 地域
	 */
	@Column(nullable = false)
	private String district;

	/**
	 * 人口
	 */
	@Column(nullable = false)
	private Long population;

	/**
	 * 公用語
	 */
	@Column(nullable = false)
	private String language;
}