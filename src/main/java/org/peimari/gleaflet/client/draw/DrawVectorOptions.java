package org.peimari.gleaflet.client.draw;

public class DrawVectorOptions extends DrawHandlerOptions {

    protected DrawVectorOptions() {
    }

	public native final void setShapeOptions(ShapeOptions shapeOptions)
	/*-{
		this.shapeOptions = shapeOptions;
	}-*/;

}
