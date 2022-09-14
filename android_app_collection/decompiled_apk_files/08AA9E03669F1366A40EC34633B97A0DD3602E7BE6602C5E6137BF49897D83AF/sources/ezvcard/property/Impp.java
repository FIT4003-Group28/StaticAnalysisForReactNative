package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.c;
import ezvcard.parameter.ImppType;
import ezvcard.parameter.Pid;
import ezvcard.parameter.VCardParameters;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@c(a = {VCardVersion.V3_0, VCardVersion.V4_0})
/* loaded from: classes.dex */
public class Impp extends VCardProperty implements HasAltId {
    private static final String AIM = "aim";
    private static final String ICQ = "icq";
    private static final String IRC = "irc";
    private static final String MSN = "msnim";
    private static final String SIP = "sip";
    private static final String SKYPE = "skype";
    private static final String XMPP = "xmpp";
    private static final String YAHOO = "ymsgr";
    private URI uri;

    public Impp(String str) {
        setUri(str);
    }

    public Impp(URI uri) {
        setUri(uri);
    }

    public Impp(String str, String str2) {
        setUri(str, str2);
    }

    public Impp(Impp impp) {
        super(impp);
        this.uri = impp.uri;
    }

    public static Impp aim(String str) {
        return new Impp(AIM, str);
    }

    public boolean isAim() {
        return isProtocol(AIM);
    }

    public static Impp yahoo(String str) {
        return new Impp(YAHOO, str);
    }

    public boolean isYahoo() {
        return isProtocol(YAHOO);
    }

    public static Impp msn(String str) {
        return new Impp(MSN, str);
    }

    public boolean isMsn() {
        return isProtocol(MSN);
    }

    public static Impp icq(String str) {
        return new Impp(ICQ, str);
    }

    public boolean isIcq() {
        return isProtocol(ICQ);
    }

    public static Impp irc(String str) {
        return new Impp(IRC, str);
    }

    public boolean isIrc() {
        return isProtocol(IRC);
    }

    public static Impp sip(String str) {
        return new Impp(SIP, str);
    }

    public boolean isSip() {
        return isProtocol(SIP);
    }

    public static Impp skype(String str) {
        return new Impp(SKYPE, str);
    }

    public boolean isSkype() {
        return isProtocol(SKYPE);
    }

    public static Impp xmpp(String str) {
        return new Impp(XMPP, str);
    }

    public boolean isXmpp() {
        return isProtocol(XMPP);
    }

    private boolean isProtocol(String str) {
        return this.uri != null && str.equals(this.uri.getScheme());
    }

    public URI getUri() {
        return this.uri;
    }

    public void setUri(String str) {
        setUri(str == null ? null : URI.create(str));
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public void setUri(String str, String str2) {
        try {
            this.uri = new URI(str, str2, null);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String getProtocol() {
        if (this.uri == null) {
            return null;
        }
        return this.uri.getScheme();
    }

    public String getHandle() {
        if (this.uri == null) {
            return null;
        }
        return this.uri.getSchemeSpecificPart();
    }

    public List<ImppType> getTypes() {
        VCardParameters vCardParameters = this.parameters;
        vCardParameters.getClass();
        return new VCardParameters.b<ImppType>(vCardParameters) { // from class: ezvcard.property.Impp.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                vCardParameters.getClass();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ezvcard.parameter.VCardParameters.c
            /* renamed from: _asObject */
            public ImppType mo221_asObject(String str) {
                return ImppType.a(str);
            }
        };
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
        if (this.uri == null) {
            list.add(new ValidationWarning(8, new Object[0]));
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
    public Impp mo226copy() {
        return new Impp(this);
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
        Impp impp = (Impp) obj;
        if (this.uri == null) {
            if (impp.uri != null) {
                return false;
            }
        } else if (!this.uri.equals(impp.uri)) {
            return false;
        }
        return true;
    }
}
