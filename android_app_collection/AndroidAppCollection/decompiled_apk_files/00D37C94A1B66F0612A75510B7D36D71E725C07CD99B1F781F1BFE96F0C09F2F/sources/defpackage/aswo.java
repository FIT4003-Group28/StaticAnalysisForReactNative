package defpackage;
/* compiled from: PG */
/* renamed from: aswo  reason: default package */
/* loaded from: classes2.dex */
public final class aswo {
    private final aswr a;

    public aswo(aswr aswrVar) {
        this.a = aswrVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aswo) && this.a.equals(((aswo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("LogoLottieAnimationDetailsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
