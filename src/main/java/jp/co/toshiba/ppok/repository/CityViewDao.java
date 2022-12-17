package jp.co.toshiba.ppok.repository;

import jp.co.toshiba.ppok.entity.CityDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * searching dao of table WORLD_CITY_VIEW
 *
 * @author Administrator
 * @date 2022-12-17
 */
@Repository
public interface CityViewDao extends JpaRepository<CityDto, Long> {
}