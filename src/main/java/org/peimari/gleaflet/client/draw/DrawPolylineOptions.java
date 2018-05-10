package org.peimari.gleaflet.client.draw;

import com.google.gwt.core.client.JavaScriptObject;
import org.peimari.gleaflet.client.PolylineOptions;

public class DrawPolylineOptions extends JavaScriptObject {

    protected DrawPolylineOptions() {}

    public static native DrawPolylineOptions create()
    /*-{
        return {};
	}-*/;

    public native final void setAllowIntersection(boolean allowIntersection)
    /*-{
        this.allowIntersection = allowIntersection;
	}-*/;

    public native final void setDrawError(DrawError drawError)
    /*-{
        this.drawError = drawError;
	}-*/;

    public native final void setGuidelineDistance(int guidelineDistance)
    /*-{
        this.guidelineDistance = guidelineDistance;
	}-*/;

    public native final void setShapeOptions(PolylineOptions shapeOptions)
    /*-{
        this.shapeOptions = shapeOptions;
	}-*/;

	public native final void setShowLength(boolean showLength)
    /*-{
        this.showLength = showLength;
	}-*/;

    public native final void setMetric(boolean metric)
    /*-{
        this.metric = metric;
	}-*/;

    public native final void setFeet(boolean feet)
    /*-{
        this.feet = feet;
	}-*/;

    public native final void setNautic(boolean nautic)
    /*-{
        this.nautic = nautic;
	}-*/;

    public native final void setZIndexOffset(int zIndexOffset)
    /*-{
        this.zIndexOffset = zIndexOffset;
	}-*/;

    public native final void setRepeatMode(boolean repeatMode)
    /*-{
        this.repeatMode = repeatMode;
    }-*/;

}
