package defpackage;
/* compiled from: PG */
/* renamed from: avho  reason: default package */
/* loaded from: classes2.dex */
public final class avho {
    public final avhk a;

    public avho(avhk avhkVar) {
        this.a = avhkVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avho) && this.a.equals(((avho) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("LowResThumbnailModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
