package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.FeatureGroup;

import com.google.gwt.core.client.JavaScriptObject;

public class DrawControlOptions extends JavaScriptObject {

    protected DrawControlOptions() {}

    public static native DrawControlOptions create()
    /*-{
        return { draw:{}, edit:{}};
    }-*/;

    public native final void setDraw(DrawControlButtonOptions drawOptions)
    /*-{
        this.draw = drawOptions;
    }-*/;

    public native final void disableDraw()
    /*-{
        this.draw = false;
    }-*/;

    public native final void setEdit(DrawControlEditOptions editOptions)
    /*-{
        this.edit = editOptions;
    }-*/;

    public native final void disableEdit()
    /*-{
        this.edit = false;
    }-*/;

    public native final void setEditableFeatureGroup(FeatureGroup layerGroup)
    /*-{
        this.edit.featureGroup = layerGroup;
    }-*/;

}
