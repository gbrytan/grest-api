package com.casestudy.rest.api

import grails.converters.*

class HttpErrorController {

    def notFound() {
    	response.status = 404
    	render ([error: "Requested resource not found."] as JSON)
    }

    def internalServerError() {
    	response.status = 500
    	render ([error: "Something went wrong. Please repot this to your system administrator."] as JSON)
    }
}
