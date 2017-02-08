package org.peimari.gleaflet.client;

import org.peimari.gleaflet.client.draw.LayerCreatedListener;
import org.peimari.gleaflet.client.draw.LayersDeletedListener;
import org.peimari.gleaflet.client.draw.LayersEditedListener;
import org.peimari.gleaflet.client.draw.DrawStartListener;
import org.peimari.gleaflet.client.draw.DrawStopListener;
import org.peimari.gleaflet.client.draw.EditStartListener;
import org.peimari.gleaflet.client.draw.EditStopListener;
import org.peimari.gleaflet.client.draw.DeleteStartListener;
import org.peimari.gleaflet.client.draw.DeleteStopListener;

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

	public native final void addDrawStartListener(
			DrawStartListener listener)
	/*-{
		this.on("draw:drawstart", $entry(function(e) {
				listener.@org.peimari.gleaflet.client.draw.DrawStartListener::onDrawStart(Lorg/peimari/gleaflet/client/draw/DrawStartEvent;)(e);
		}));
	}-*/;

	public native final void addDrawStopListener(
			DrawStopListener listener)
	/*-{
		this.on("draw:drawstop", $entry(function(e) {
				listener.@org.peimari.gleaflet.client.draw.DrawStopListener::onDrawStop(Lorg/peimari/gleaflet/client/draw/DrawStopEvent;)(e);
		}));
	}-*/;

	public native final void addEditStartListener(
			EditStartListener listener)
	/*-{
		this.on("draw:editstart", $entry(function(e) {
				listener.@org.peimari.gleaflet.client.draw.EditStartListener::onEditStart(Lorg/peimari/gleaflet/client/draw/EditStartEvent;)(e);
		}));
	}-*/;

	public native final void addEditStopListener(
			EditStopListener listener)
	/*-{
		this.on("draw:editstop", $entry(function(e) {
				listener.@org.peimari.gleaflet.client.draw.EditStopListener::onEditStop(Lorg/peimari/gleaflet/client/draw/EditStopEvent;)(e);
		}));
	}-*/;

	public native final void addDeleteStartListener(
			DeleteStartListener listener)
	/*-{
		this.on("draw:deletestart", $entry(function(e) {
				listener.@org.peimari.gleaflet.client.draw.DeleteStartListener::onDeleteStart(Lorg/peimari/gleaflet/client/draw/DeleteStartEvent;)(e);
		}));
	}-*/;

	public native final void addDeleteStopListener(
			DeleteStopListener listener)
	/*-{
		this.on("draw:deletestop", $entry(function(e) {
				listener.@org.peimari.gleaflet.client.draw.DeleteStopListener::onDeleteStop(Lorg/peimari/gleaflet/client/draw/DeleteStopEvent;)(e);
		}));
	}-*/;

}
