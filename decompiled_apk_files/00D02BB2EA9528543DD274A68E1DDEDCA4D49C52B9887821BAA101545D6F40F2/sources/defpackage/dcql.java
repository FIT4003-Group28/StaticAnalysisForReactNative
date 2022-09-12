package defpackage;
/* compiled from: PG */
/* renamed from: dcql  reason: default package */
/* loaded from: classes5.dex */
final class dcql implements dcqq {
    private final dcqp a;
    private final String b;

    public dcql(dcqp dcqpVar, String str) {
        dcuj.a(dcqpVar, "log site");
        this.a = dcqpVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dcql)) {
            return false;
        }
        dcql dcqlVar = (dcql) obj;
        return this.a.equals(dcqlVar.a) && this.b.equals(dcqlVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + str.length());
        sb.append("SpecializedLogSiteKey{ logSite=");
        sb.append(valueOf);
        sb.append(", extraKey='");
        sb.append(str);
        sb.append("' }");
        return sb.toString();
    }
}
