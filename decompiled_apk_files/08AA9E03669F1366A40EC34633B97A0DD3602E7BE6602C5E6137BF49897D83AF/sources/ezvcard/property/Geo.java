package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.parameter.Pid;
import ezvcard.util.GeoUri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class Geo extends VCardProperty implements HasAltId {
    private GeoUri uri;

    public Geo(Double d2, Double d3) {
        this(new GeoUri.a(d2, d3).a());
    }

    public Geo(GeoUri geoUri) {
        this.uri = geoUri;
    }

    public Geo(Geo geo) {
        super(geo);
        this.uri = geo.uri;
    }

    public Double getLatitude() {
        if (this.uri == null) {
            return null;
        }
        return this.uri.a();
    }

    public void setLatitude(Double d2) {
        if (this.uri == null) {
            this.uri = new GeoUri.a(d2, null).a();
        } else {
            this.uri = new GeoUri.a(this.uri).a(d2).a();
        }
    }

    public Double getLongitude() {
        if (this.uri == null) {
            return null;
        }
        return this.uri.b();
    }

    public void setLongitude(Double d2) {
        if (this.uri == null) {
            this.uri = new GeoUri.a(null, d2).a();
        } else {
            this.uri = new GeoUri.a(this.uri).b(d2).a();
        }
    }

    public GeoUri getGeoUri() {
        return this.uri;
    }

    public void setGeoUri(GeoUri geoUri) {
        this.uri = geoUri;
    }

    public String getType() {
        return this.parameters.o();
    }

    public void setType(String str) {
        this.parameters.f(str);
    }

    public String getMediaType() {
        return this.parameters.j();
    }

    public void setMediaType(String str) {
        this.parameters.e(str);
    }

    @Override // ezvcard.property.VCardProperty
    public List<Pid> getPids() {
        return super.getPids();
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getPref() {
        return super.getPref();
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
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
    protected void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
        if (getLatitude() == null) {
            list.add(new ValidationWarning(13, new Object[0]));
        }
        if (getLongitude() == null) {
            list.add(new ValidationWarning(14, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("uri", this.uri);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Geo mo226copy() {
        return new Geo(this);
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        return (super.hashCode() * 31) + (this.uri == null ? 0 : this.uri.hashCode());
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Geo geo = (Geo) obj;
        if (this.uri == null) {
            if (geo.uri != null) {
                return false;
            }
        } else if (!this.uri.equals(geo.uri)) {
            return false;
        }
        return true;
    }
}
