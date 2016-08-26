package org.peimari.gleaflet.client.draw;

import com.google.gwt.core.client.JavaScriptObject;

import java.util.Set;

/**
 * At the moment the only option you can configure is which shape the user can use.
 */
public class DrawControlButtonOptions extends JavaScriptObject {


    protected DrawControlButtonOptions() {
    }

    public static native DrawControlButtonOptions create()
    /*-{
            return {};
    }-*/;

    /**
     * Only the DrawFeatures buttons listed in the visibleButtons set will be visible
     * @param visibleButtons
     */
    public final void setVisibleButtons(Set<String> visibleButtons) {
        setCircleVisibility(visibleButtons.contains("circle"));
        setMarkerVisibility(visibleButtons.contains("marker"));
        setPolygonVisibility(visibleButtons.contains("polygon"));
        setPolylineVisibility(visibleButtons.contains("polyline"));
        setRectangleVisibility(visibleButtons.contains("rectangle"));
        setSimpleshapeVisibility(visibleButtons.contains("simpleShape"));
    }

    public native final void setCircleVisibility(boolean circle)
    /*-{
        this.circle = circle;
    }-*/;

    public native final void setMarkerVisibility(boolean marker)
    /*-{
        this.marker = marker;
    }-*/;

    public native final void setPolygonVisibility(boolean polygon)
    /*-{
        this.polygon = polygon;
    }-*/;

    public native final void setPolylineVisibility(boolean polyline)
    /*-{
        this.polyline = polyline;
    }-*/;

    public native final void setRectangleVisibility(boolean rectangle)
    /*-{
        this.rectangle = rectangle;
    }-*/;

    public native final void setSimpleshapeVisibility(boolean simpleshape)
    /*-{
        this.simpleshape = simpleshape;
    }-*/;

    public native final void setPolygonHandlerOptions(DrawPolygonHandlerOptions polygonHandlerOptions)
    /*-{
        this.polygon = polygonHandlerOptions;
    }-*/;

}