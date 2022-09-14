package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.util.GeoUri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.i18n.TextBundle;
/* loaded from: classes.dex */
public class PlaceProperty extends VCardProperty implements HasAltId {
    protected GeoUri geoUri;
    protected String text;
    protected String uri;

    public PlaceProperty() {
    }

    public PlaceProperty(double d2, double d3) {
        setCoordinates(d2, d3);
    }

    public PlaceProperty(String str) {
        setText(str);
    }

    public PlaceProperty(PlaceProperty placeProperty) {
        super(placeProperty);
        this.geoUri = placeProperty.geoUri;
        this.uri = placeProperty.uri;
        this.text = placeProperty.text;
    }

    public Double getLatitude() {
        if (this.geoUri == null) {
            return null;
        }
        return this.geoUri.a();
    }

    public Double getLongitude() {
        if (this.geoUri == null) {
            return null;
        }
        return this.geoUri.b();
    }

    public GeoUri getGeoUri() {
        return this.geoUri;
    }

    public void setCoordinates(double d2, double d3) {
        setGeoUri(new GeoUri.a(Double.valueOf(d2), Double.valueOf(d3)).a());
    }

    public void setGeoUri(GeoUri geoUri) {
        this.geoUri = geoUri;
        this.uri = null;
        this.text = null;
    }

    public String getUri() {
        return this.uri;
    }

    public void setUri(String str) {
        this.uri = str;
        this.geoUri = null;
        this.text = null;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
        this.geoUri = null;
        this.uri = null;
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.a();
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.a2(str);
    }

    @Override // ezvcard.property.VCardProperty
    public String getLanguage() {
        return super.getLanguage();
    }

    @Override // ezvcard.property.VCardProperty
    public void setLanguage(String str) {
        super.setLanguage(str);
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.uri == null && this.text == null && this.geoUri == null) {
            list.add(new ValidationWarning(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("geoUri", this.geoUri);
        linkedHashMap.put("uri", this.uri);
        linkedHashMap.put(TextBundle.TEXT_ENTRY, this.text);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int i = 0;
        int hashCode = ((((super.hashCode() * 31) + (this.geoUri == null ? 0 : this.geoUri.hashCode())) * 31) + (this.text == null ? 0 : this.text.hashCode())) * 31;
        if (this.uri != null) {
            i = this.uri.hashCode();
        }
        return hashCode + i;
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        PlaceProperty placeProperty = (PlaceProperty) obj;
        if (this.geoUri == null) {
            if (placeProperty.geoUri != null) {
                return false;
            }
        } else if (!this.geoUri.equals(placeProperty.geoUri)) {
            return false;
        }
        if (this.text == null) {
            if (placeProperty.text != null) {
                return false;
            }
        } else if (!this.text.equals(placeProperty.text)) {
            return false;
        }
        if (this.uri == null) {
            if (placeProperty.uri != null) {
                return false;
            }
        } else if (!this.uri.equals(placeProperty.uri)) {
            return false;
        }
        return true;
    }
}
