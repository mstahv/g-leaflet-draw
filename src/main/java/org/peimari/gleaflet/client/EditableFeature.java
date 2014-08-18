package org.peimari.gleaflet.client;

public class EditableFeature extends AbstractPath implements ILayer {

	protected EditableFeature() {
	}

	public native final void enable() 
	/*-{
		this.editing.enable();
	}-*/;

	public native final void disable() 
	/*-{
		this.editing.disable();
	}-*/;
	
	public native final void addEditListener(FeatureEditedListener listener) 
	/*-{
		this.on("edit", $entry(function(e) {
			listener.@org.peimari.gleaflet.client.FeatureEditedListener::onEdit()();
		}));
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
		return this.editing.enabled();
	}-*/;

}
