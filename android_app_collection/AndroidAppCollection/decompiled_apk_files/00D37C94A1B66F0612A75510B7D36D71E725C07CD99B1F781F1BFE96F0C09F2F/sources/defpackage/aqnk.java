package defpackage;
/* compiled from: PG */
/* renamed from: aqnk  reason: default package */
/* loaded from: classes2.dex */
public final class aqnk {
    private final aqnl a;

    public aqnk(aqnl aqnlVar) {
        this.a = aqnlVar;
    }

    public static aqnj a(aqnl aqnlVar) {
        return new aqnj(aqnlVar.mo52toBuilder());
    }

    public static final amvn b() {
        return new amvl().g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqnk) && this.a.equals(((aqnk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("DownloadFormatModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
