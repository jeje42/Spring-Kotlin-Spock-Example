package com.familiall.files

import com.familial.files.FilesApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = FilesApplication)
class FilesApplicationSpec extends Specification {

    @Autowired
    ApplicationContext context

    def "App just starts"() {
        expect:
        context
    }

}
