class UrlMappings {

	static mappings = {
        "500"(controller: 'httpError', action: 'internalServerError')
        "404"(controller: 'httpError', action: 'notFound')

        "/api/products" (controller: "product", parseRequest: true) {
        	action = [GET: "show", POST: "save", PUT: "update", DELETE: "delete"]
        }
        // "/api/products/search/$keyword" (controller: "product", parseRequest: true) {
        // 	action = [GET: "findNameByMatch"]
        // }
	}
}