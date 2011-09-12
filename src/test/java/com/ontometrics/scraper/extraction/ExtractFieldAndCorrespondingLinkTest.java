package com.ontometrics.scraper.extraction;

import static com.ontometrics.scraper.HtmlSample.ProgramListingPage;
import static com.ontometrics.scraper.extraction.HtmlExtractor.html;

import java.util.List;

import net.htmlparser.jericho.HTMLElementName;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtractFieldAndCorrespondingLinkTest {
	
	private static final Logger log = LoggerFactory.getLogger(ExtractFieldAndCorrespondingLinkTest.class);

	@Test
	public void canExtractFieldAndLinkFromTable() {
		List<Field> fields = new DefaultFieldExtractor()
				.source(html().url(ProgramListingPage.getUrl()).id(HTMLElementName.TABLE, "lst_indexcfda"))
				.getFields();
		
		log.info("fields: {}", fields);
		
	}

}
