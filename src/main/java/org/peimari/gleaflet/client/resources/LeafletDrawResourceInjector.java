package org.peimari.gleaflet.client.resources;

import com.google.gwt.core.client.GWT;

public class LeafletDrawResourceInjector {

	protected static LeafletDrawClientBundle bundle;

	public static void ensureInjected() {
		if (bundle == null) {
			LeafletResourceInjector.ensureInjected();
			bundle = GWT.create(LeafletDrawClientBundle.class);
			LeafletDrawResourceInjector injector = GWT
					.create(LeafletDrawResourceInjector.class);
			injector.injectResources();
		}
	}
	
	/**
	 * Override this with deferred binding to customize injected stuff
	 */
	protected void injectResources() {
		bundle.drawCss().ensureInjected();
		injectScript(bundle.drawScript().getText());
	}

	private static native void injectScript(String script)
	/*-{
	    $wnd.eval(script);
	}-*/;

}
