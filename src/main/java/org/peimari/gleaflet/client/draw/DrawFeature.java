package org.peimari.gleaflet.client.draw;

import com.google.gwt.core.client.JavaScriptObject;

public abstract class DrawFeature extends JavaScriptObject {

	protected DrawFeature() {
	}

	public native final void enable() 
	/*-{
		this.enable();
	}-*/;

	public native final void disable() 
	/*-{
		this.disable();
	}-*/;
	
	public final void setEnabled(boolean enabled) {
		if(isEnabled() != enabled) {
			if(enabled) {
				enable();
			} else {
				disable();
			}
		}
	}

	public final native boolean isEnabled() 
	/*-{
		return this.enabled();
	}-*/;
	
}
