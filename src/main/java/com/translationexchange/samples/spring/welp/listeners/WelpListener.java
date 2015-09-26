package com.translationexchange.samples.spring.welp.listeners;

import com.translationexchange.core.Tml;
import com.translationexchange.core.Utils;
import com.translationexchange.j2ee.listeners.TmlListener;

public class WelpListener extends TmlListener {

	protected void configureTml() {

		Tml.getConfig().setApplication(Utils.buildMap(
//			"key",		"05ebcb1f085f8e2b97b572b5efe61f056159cbbb72b79ef2989bd7260d0c7001",
//			"token", 	"c41b8ffaf8c98eb290f9cb9d353afbb72d48a14ecda2e3eacda2b581948a8f2f",
//			"host", 	"http://localhost:3000"
			"key",		"0332a07e97af3d81f6fe9723cc083df3a45fbd39d1380691c62e445c598b8d5c",
			"token", 	"0d94597cec4aa324ac764f53f6cb0e33ef5b3954144364f91f27fde8e8fc36fb"
		));

//		Tml.getConfig().setCache(Utils.buildMap(
//			"enabled",  true,	
//	    	"class", 	"com.translationexchange.cache.Memcached",
//	        "host", 	"localhost:11211",
//	        "namespace", "c41b8ffaf8c98"
//		));

		Tml.getConfig().setCache(Utils.buildMap(
				"enabled",  false,	
		    	"class", 	"com.translationexchange.cache.EHCache",
		        "namespace", "0332a07e97af3d81f6fe9723cc083df3a45fbd39d1380691c62e445c598b8d5c"
		));
		
	}
	
}
