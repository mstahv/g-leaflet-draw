package org.peimari.gleaflet.client;

import org.peimari.gleaflet.client.draw.LayerCreatedListener;
import org.peimari.gleaflet.client.draw.LayersEditedListener;

public class EditableMap extends Map {
	
	protected EditableMap() {}

	public native final  void addLayerCreatedListener(
			LayerCreatedListener listener) 
	/*-{
		this.on("draw:created", function(e) {
				$entry(listener.@org.peimari.gleaflet.client.draw.LayerCreatedListener::onCreated(Lorg/peimari/gleaflet/client/draw/LayerCreatedEvent;)(e));
		});
	}-*/;

	public native final  void addLayersEditedListener(
			LayersEditedListener listener) 
	/*-{
		this.on("draw:edited", function(e) {
				$entry(listener.@org.peimari.gleaflet.client.draw.LayersEditedListener::onCreated(Lorg/peimari/gleaflet/client/draw/LayersEditedEvent;)(e));
		});
	}-*/;

}
