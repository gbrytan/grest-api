// Place your Spring DSL code here
import grails.rest.render.json.JsonRenderer
import com.casestudy.rest.api.Product

beans = {

	productJsonRenderer(JsonRenderer, Product) {
		excludes = ['class', 'dateCreated', 'lastUpdated']
	}
}
