import com.casestudy.rest.api.Product

class BootStrap {

    def init = { servletContext ->
    	new Product(name: "GX-0983", description: "Casio G-Shock watch", productCode: "2034920-CGX", isImported: true).save(flush: true, failOnError: true)
    	new Product(name: "Samsung A7 2017", description: "Samsung A7 2017 version", productCode: "SA7-384920", isImported: true).save(flush: true, failOnError: true)
    	new Product(name: "Gopro Hero 5 Black", description: "Gopro Hero 5 black", productCode: "GP-93094502", isImported: true).save(flush: true, failOnError: true)
    	new Product(name: "Rakk Xt 2", description: "Rakk Kimat keyboard", productCode: "RK-4920453", isImported: false).save(flush: true, failOnError: true)
    }
    def destroy = {
    }
}
