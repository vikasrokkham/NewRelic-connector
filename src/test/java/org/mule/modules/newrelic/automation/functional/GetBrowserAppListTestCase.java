/**
 *
 */
package org.mule.modules.newrelic.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.newrelic.NewRelicConnector;
import org.mule.modules.newrelic.automation.runner.FunctionalTestSuite;

import com.mule.modules.newrelic.beans.BrowserAppListGetResponse;

public class GetBrowserAppListTestCase extends NewRelicAbstractTestCase{

	public GetBrowserAppListTestCase() {
		super(NewRelicConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	  @Category({FunctionalTestSuite.class})
	  public void testFlow() throws Exception {
		BrowserAppListGetResponse res =(getConnector().getBrowserAppList(getKey(), null, null, null));
		System.out.println("********************************************"+res.getBrowser_applications()[0].getBrowser_monitoring_key());
	    assertNotNull(res);
	  }
}
