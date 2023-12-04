package com.thaseen.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thaseen.Entity.ImageGallery;

@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>{

	}

