package cz.spsmb.ctvrtak.c_spring.b_config2.resources

import cz.spsmb.ctvrtak.c_spring.b_config2.main.service.SearchEngineService
import cz.spsmb.ctvrtak.c_spring.b_config2.main.data.DocumentRepository
import cz.spsmb.ctvrtak.c_spring.a_config.main.java.Doc;

beans {
	
	engine(SearchEngineService){
		documentDAO = ref("documentDAO")
	}	
	
	documentDAO(DocumentRepository){
		doc1 = ref("doc1")
		doc2 = ref("doc2")
		doc3 = ref("doc3")
		doc4 = ref("doc4")
	}
	
	doc1(Document){
		name = "Book Template"
		type = ref("pdfType")
		location = "/Users/felipeg/Documents/Random/Book Template.pdf"
	}
	
	doc2(Document){
		name = "Sample Contract"
		type = ref("pdfType")
		location = "/Users/felipeg/Documents/Contracts/Sample Contract.pdf"
	}
	
	doc3(Document){
		name = "Clustering with RabbitMQ"
		type = ref("noteType")
		location = "/Users/felipeg/Documents/Random/Clustering with RabbitMQ.txt"
	}
	
	doc4(Document){
		name = "Pro Spring Security Book"
		type = ref("webType")
		location = "http://www.apress.com/9781430248187"
	}
	
	webType(com.apress.isf.java.model.Type){
		name = "WEB"
		desc = "Web Link"
		extension = ".url"
	}
	
	pdfType(com.apress.isf.java.model.Type){
		name = "PDF"
		desc = "Portable Document Format"
		extension = ".url"
	}
	
	noteType(com.apress.isf.java.model.Type){
		name = "NOTE"
		desc = "Text Notes"
		extension = ".txt"
	}
}