package org.peimari.gleaflet.client.draw;

public class DrawStopEvent extends DrawEvent {

    protected DrawStopEvent() {
    }

    public native final String getRawLayerType()
	/*-{
	 	return this.layerType;
	}-*/;

}
