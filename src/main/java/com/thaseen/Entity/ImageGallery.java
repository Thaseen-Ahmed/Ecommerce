package com.thaseen.Entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "image_gallery")
public class ImageGallery {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "description", nullable = false)
	private String description;	
	
	@Column(name = "price",nullable = false, precision = 10, scale = 2)
    private BigDecimal price;
	
	@Lob
    @Column(name = "Image", length = Integer.MAX_VALUE, nullable = true)
    private byte[] image;
    
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "create_date", nullable = false)
//    private Date createDate;

	public ImageGallery() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

//	public Date getCreateDate() {
//		return createDate;
//	}
//
//	public void setCreateDate(java.util.Date createDate2) {
//		this.createDate = (Date) createDate2;
//	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", image="
				+ Arrays.toString(image) + "]";
	}
   
}
