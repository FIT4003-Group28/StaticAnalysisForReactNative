package defpackage;
/* compiled from: PG */
/* renamed from: avhp  reason: default package */
/* loaded from: classes2.dex */
public final class avhp {
    private final avhl a;

    public avhp(avhl avhlVar) {
        this.a = avhlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avhp) && this.a.equals(((avhp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("RgbColorModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
