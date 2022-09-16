package defpackage;
/* compiled from: PG */
/* renamed from: avil  reason: default package */
/* loaded from: classes2.dex */
public final class avil {
    public final aajl a;
    public final avim b;

    public avil(avim avimVar, aajl aajlVar) {
        this.b = avimVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avil) && this.b.equals(((avil) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("TimedSectionListDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
