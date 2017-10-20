package com.casestudy.rest.api

class Product {

	String name
	String description
	String productCode
	boolean isImported = false

	Date dateCreated
	Date lastUpdated

    static constraints = {
    	name blank: false, size: 2..150
    	description blank: false, size: 2..255
    	productCode blank: false, size: 8..20
    	dateCreated nullable: true
    	lastUpdated nullable: true
    }
}
