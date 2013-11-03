package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.LayerGroup;

public class LayersEditedEvent extends DrawEvent {
	
	protected LayersEditedEvent() {}
	
	/**
	 * @return layers that where edited in this transaction
	 */
	public native final LayerGroup getLayers()
	/*-{
	 	return this.layers;
	}-*/;
	
}
