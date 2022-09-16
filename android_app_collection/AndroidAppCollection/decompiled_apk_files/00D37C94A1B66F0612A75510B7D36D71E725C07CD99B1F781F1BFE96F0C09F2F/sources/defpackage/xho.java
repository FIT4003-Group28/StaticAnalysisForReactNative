package defpackage;
/* compiled from: PG */
/* renamed from: xho  reason: default package */
/* loaded from: classes4.dex */
public final class xho {
    public static final xho a = a(null, null);
    public final aalc b;
    private final String c;

    public xho() {
    }

    public xho(String str, aalc aalcVar) {
        this.c = str;
        this.b = aalcVar;
    }

    public static xho a(String str, aalc aalcVar) {
        return new xho(str, aalcVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xho) {
            xho xhoVar = (xho) obj;
            String str = this.c;
            if (str != null ? str.equals(xhoVar.c) : xhoVar.c == null) {
                aalc aalcVar = this.b;
                aalc aalcVar2 = xhoVar.b;
                if (aalcVar != null ? aalcVar.equals(aalcVar2) : aalcVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        aalc aalcVar = this.b;
        if (aalcVar != null) {
            i = aalcVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(valueOf).length());
        sb.append("AdOverlayContentMetadata{title=");
        sb.append(str);
        sb.append(", videoThumbnailDetails=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
