package defpackage;
/* compiled from: PG */
/* renamed from: avhs  reason: default package */
/* loaded from: classes2.dex */
public final class avhs {
    private final avhm a;

    public avhs(avhm avhmVar) {
        this.a = avhmVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avhs) && this.a.equals(((avhs) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("ThumbnailModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
