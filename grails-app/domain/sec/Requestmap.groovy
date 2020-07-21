package sec

import org.springframework.http.HttpMethod

class Requestmap {
	String name
	String description
	String url
	String configAttribute
	HttpMethod httpMethod

	static mapping = {
		cache true
	}

	static constraints = {
		url blank: false, unique: 'httpMethod'
		configAttribute blank: false
		name blank:false
		description nullable:true
		httpMethod nullable:true
	}
}
