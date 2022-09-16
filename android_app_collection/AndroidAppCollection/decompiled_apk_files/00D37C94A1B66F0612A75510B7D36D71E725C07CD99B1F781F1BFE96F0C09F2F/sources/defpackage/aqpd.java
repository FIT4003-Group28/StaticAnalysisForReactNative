package defpackage;
/* compiled from: PG */
/* renamed from: aqpd  reason: default package */
/* loaded from: classes2.dex */
public final class aqpd {
    private final aqpe a;

    public aqpd(aqpe aqpeVar) {
        this.a = aqpeVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqpd) && this.a.equals(((aqpd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("DownloadsPageFeatureVisibilityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
