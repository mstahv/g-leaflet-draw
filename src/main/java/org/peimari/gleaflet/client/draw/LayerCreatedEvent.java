package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.Layer;

public class LayerCreatedEvent extends DrawEvent {
	
	protected LayerCreatedEvent() {}
	
	public native final String getRawLayerType()
	/*-{
	 	return this.layerType;
	}-*/;
	
	public final LayerType getLayerType() {
		String rawLayerType = getRawLayerType();
		for(LayerType t : LayerType.values()) {
			if(t.toString().equals(rawLayerType)) {
				return t;
			}
		}
		return null;
	}

	public native final Layer getLayer()
	/*-{
	 	return this.layer;
	 }-*/;
}
