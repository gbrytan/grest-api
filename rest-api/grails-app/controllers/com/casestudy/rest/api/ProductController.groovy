package com.casestudy.rest.api

import grails.rest.RestfulController
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class ProductController extends RestfulController {

    static responseFormats = ['json', 'xml']

    ProductController() {
    	super(Product)
    }

    // @Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
    def index() {
    	render ([products: Product.getAll(), productCount: Product.count()] as JSON)
    }
}