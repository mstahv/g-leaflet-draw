package org.peimari.gleaflet.client.draw;

public class DrawStartEvent extends DrawEvent {

    protected DrawStartEvent() {
    }

    public native final String getRawLayerType()
	/*-{
	 	return this.layerType;
	}-*/;

}
