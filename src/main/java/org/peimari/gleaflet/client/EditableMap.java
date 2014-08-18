package org.peimari.gleaflet.client;

import org.peimari.gleaflet.client.draw.LayerCreatedListener;
import org.peimari.gleaflet.client.draw.LayersDeletedListener;
import org.peimari.gleaflet.client.draw.LayersEditedListener;

import com.google.gwt.core.client.JavaScriptObject;

public class EditableMap extends Map {
	
	protected EditableMap() {}

	public native final JavaScriptObject addLayerCreatedListener(
			LayerCreatedListener listener) 
	/*-{
	 	var fn = $entry(function(e) {
				listener.@org.peimari.gleaflet.client.draw.LayerCreatedListener::onCreate(Lorg/peimari/gleaflet/client/draw/LayerCreatedEvent;)(e);
		});
		fn.prototype['gname'] = "draw:created";
		this.on(fn.prototype['gname'], fn);
		return fn;
	}-*/;
	
	public native final  void addLayersEditedListener(
			LayersEditedListener listener) 
	/*-{
		this.on("draw:edited", $entry(function(e) {
				listener.@org.peimari.gleaflet.client.draw.LayersEditedListener::onEdit(Lorg/peimari/gleaflet/client/draw/LayersEditedEvent;)(e);
		}));
	}-*/;

	public native final void addLayersDeletedListener(
			LayersDeletedListener listener) 
	/*-{
		this.on("draw:deleted", $entry(function(e) {
				listener.@org.peimari.gleaflet.client.draw.LayersDeletedListener::onDelete(Lorg/peimari/gleaflet/client/draw/LayersDeletedEvent;)(e);
		}));
	}-*/;

}
