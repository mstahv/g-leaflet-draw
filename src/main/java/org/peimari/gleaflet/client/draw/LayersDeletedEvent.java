package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.LayerGroup;

public class LayersDeletedEvent extends DrawEvent {
	
	protected LayersDeletedEvent() {}
	
	/**
	 * @return layers that where deleted in this transaction
	 */
	public native final LayerGroup getLayers()
	/*-{
	 	return this.layers;
	}-*/;
	
}
