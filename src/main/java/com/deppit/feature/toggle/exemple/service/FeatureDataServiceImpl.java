package com.deppit.feature.toggle.exemple.service;

import com.deppit.feature.toggle.exemple.repository.FeatureRepository;
import com.deppit.feature.toggle.model.Feature;
import com.deppit.feature.toggle.service.FeatureDataServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FeatureDataServiceImpl implements FeatureDataServices {

    private final FeatureRepository featureRepository;

    @Override
    public Set<Feature> loadData(Set<Feature> set) {

        return featureRepository.findAll().stream()
                .map(feature -> Feature.builder()
                        .id(feature.getId())
                        .name(feature.getName())
                        .enable(feature.getEnable())
                        .build()).collect(Collectors.toSet());
    }
}
