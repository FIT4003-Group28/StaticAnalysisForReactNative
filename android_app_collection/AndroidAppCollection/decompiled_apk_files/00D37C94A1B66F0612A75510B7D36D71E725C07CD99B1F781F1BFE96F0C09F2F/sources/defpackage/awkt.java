package defpackage;
/* compiled from: PG */
/* renamed from: awkt  reason: default package */
/* loaded from: classes2.dex */
public final class awkt {
    private final awku a;

    public awkt(awku awkuVar) {
        this.a = awkuVar;
    }

    public static awks a(awku awkuVar) {
        return new awks(awkuVar.mo52toBuilder());
    }

    public static final amvn b() {
        return new amvl().g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awkt) && this.a.equals(((awkt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("YtMainVideoEntityLocalizedStringsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
