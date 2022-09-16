package defpackage;
/* compiled from: PG */
/* renamed from: asor  reason: default package */
/* loaded from: classes2.dex */
public final class asor {
    private final asos a;

    public asor(asos asosVar) {
        this.a = asosVar;
    }

    public static asoq a(asos asosVar) {
        return new asoq(asosVar.mo52toBuilder());
    }

    public static final amvn b() {
        return new amvl().g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asor) && this.a.equals(((asor) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("LightsourceColorPaletteDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
