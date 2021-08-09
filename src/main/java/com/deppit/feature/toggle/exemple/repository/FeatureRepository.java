package com.deppit.feature.toggle.exemple.repository;

import com.deppit.feature.toggle.exemple.entity.FeatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<FeatureEntity, Long> {

}
