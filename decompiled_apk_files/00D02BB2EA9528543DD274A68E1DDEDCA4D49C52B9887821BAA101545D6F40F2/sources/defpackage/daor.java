package defpackage;
/* compiled from: PG */
/* renamed from: daor  reason: default package */
/* loaded from: classes5.dex */
public final class daor {
    public String a = "Unknown";
    public String b = "Unknown";

    public static String c(String str, boolean z) {
        if ("VisibleUsingXml".equals(str) || "Visible".equals(str) || "Invisible".equals(str)) {
            return z ? "Invisible".equals(str) ? "Invisible_to_Visible" : str : "VisibleUsingXml".equals(str) ? "VisibleUsingXml_to_Invisible" : "Visible".equals(str) ? "Visible_to_Invisible" : str;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Illegal visibility state: ".concat(valueOf) : new String("Illegal visibility state: "));
    }

    public static final String d(boolean z, boolean z2) {
        return z ? true != z2 ? "Visible" : "VisibleUsingXml" : "Invisible";
    }

    public final void a(boolean z, boolean z2) {
        this.a = this.a.equals("Unknown") ? d(z, z2) : this.a;
    }

    public final void b(boolean z, boolean z2) {
        this.b = this.b.equals("Unknown") ? d(z, z2) : this.b;
    }
}
