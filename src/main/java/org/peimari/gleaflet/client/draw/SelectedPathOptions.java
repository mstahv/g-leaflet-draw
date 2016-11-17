package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.PathOptions;

public class SelectedPathOptions extends PathOptions {

    protected SelectedPathOptions() {}

    public static native SelectedPathOptions create()
    /*-{
        return {};
	}-*/;

    public native final void setMaintainColor(boolean maintainColor)
    /*-{
        this.maintainColor = maintainColor;
	}-*/;

}
