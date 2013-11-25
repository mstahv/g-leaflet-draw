package org.peimari.gleaflet.client.draw;

import com.google.gwt.core.client.JavaScriptObject;

abstract class DrawFeature extends JavaScriptObject {

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
	
	public native final  void addLayerCreatedListener(
			LayerCreatedListener listener) 
	/*-{
		this.on("draw:created", function(e) {
				$entry(listener.@org.peimari.gleaflet.client.draw.LayerCreatedListener::onCreate(Lorg/peimari/gleaflet/client/draw/LayerCreatedEvent;)(e));
		});
	}-*/;

}
