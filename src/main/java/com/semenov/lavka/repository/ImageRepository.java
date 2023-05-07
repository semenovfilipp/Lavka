package com.semenov.lavka.repository;

import com.semenov.lavka.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Создание интерфейса для расширения класса @Java Persistent Api
 */

public interface ImageRepository extends JpaRepository<Image, Long> {



}
