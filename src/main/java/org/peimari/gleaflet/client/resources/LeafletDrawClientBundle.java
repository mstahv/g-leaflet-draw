package org.peimari.gleaflet.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.TextResource;

public interface LeafletDrawClientBundle extends ClientBundle {
 
    @Source("leaflet.draw.js")
    @DoNotEmbed
    TextResource drawScript();

    @Source("leaflet.draw.css")
    @CssResource.NotStrict
    CssResource drawCss();

    @Source("images/spritesheet.svg")
    @DoNotEmbed
    DataResource spritesheetSVG();

    @Source("images/spritesheet.png")
    @DoNotEmbed
    DataResource spritesheet();

    @Source("images/spritesheet-2x.png")
    @DoNotEmbed
    DataResource spritesheet2x();

}
