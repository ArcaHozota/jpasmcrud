package jp.co.sony.ppog.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 都市情報ビューWORLD_CITY_VIEWのエンティティ
 *
 * @author Administrator
 */
@Entity
@Getter
@Setter
@ToString
@Table(name = "WORLD_CITY_VIEW")
@Proxy(lazy = false)
@NamedQuery(name = "CityView.findByNations", query = "select cv from CityView as cv where cv.nation =:nation")
@NamedQuery(name = "CityView.getByNations", query = "select cv from CityView as cv where cv.nation =:nation order by cv.id asc")
@NamedQuery(name = "CityView.getByNames", query = "select cv from CityView as cv where cv.name like concat('%', :name, '%') order by cv.id asc")
public class CityView implements Serializable {

    private static final long serialVersionUID = 6678964783710878220L;

    /**
     * This field corresponds to the database column ID
     */
    @Id
    @Column(name = "CITY_ID")
    private Long id;

    /**
     * This field corresponds to the database column NAME
     */
    @Column(name = "CITY_NAME", nullable = false)
    private String name;

    /**
     * This field corresponds to the database column CONTINENT
     */
    @Column(nullable = false)
    private String continent;

    /**
     * This field corresponds to the database column NATION
     */
    @Column(name = "COUNTRY_NAME", nullable = false)
    private String nation;

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
}
