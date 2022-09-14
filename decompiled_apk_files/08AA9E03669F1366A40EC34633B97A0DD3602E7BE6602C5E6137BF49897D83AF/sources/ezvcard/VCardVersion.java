package ezvcard;
/* loaded from: classes.dex */
public enum VCardVersion {
    V2_1("2.1", com.b.a.a.a.OLD, null),
    V3_0("3.0", com.b.a.a.a.NEW, null),
    V4_0("4.0", com.b.a.a.a.NEW, "urn:ietf:params:xml:ns:vcard-4.0");
    
    private final com.b.a.a.a syntaxStyle;
    private final String version;
    private final String xmlNamespace;

    VCardVersion(String str, com.b.a.a.a aVar, String str2) {
        this.version = str;
        this.syntaxStyle = aVar;
        this.xmlNamespace = str2;
    }

    public String getVersion() {
        return this.version;
    }

    public com.b.a.a.a getSyntaxStyle() {
        return this.syntaxStyle;
    }

    public String getXmlNamespace() {
        return this.xmlNamespace;
    }

    public static VCardVersion valueOfByStr(String str) {
        VCardVersion[] values;
        for (VCardVersion vCardVersion : values()) {
            if (vCardVersion.getVersion().equals(str)) {
                return vCardVersion;
            }
        }
        return null;
    }

    public static VCardVersion valueOfByXmlNamespace(String str) {
        VCardVersion[] values;
        for (VCardVersion vCardVersion : values()) {
            String xmlNamespace = vCardVersion.getXmlNamespace();
            if (xmlNamespace != null && xmlNamespace.equals(str)) {
                return vCardVersion;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.version;
    }
}
