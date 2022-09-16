package defpackage;
/* compiled from: PG */
/* renamed from: aueg  reason: default package */
/* loaded from: classes2.dex */
public final class aueg {
    public final aajl a;
    public final auei b;

    public aueg(auei aueiVar, aajl aajlVar) {
        this.b = aueiVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aueg) && this.b.equals(((aueg) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("CollageThumbnailDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
