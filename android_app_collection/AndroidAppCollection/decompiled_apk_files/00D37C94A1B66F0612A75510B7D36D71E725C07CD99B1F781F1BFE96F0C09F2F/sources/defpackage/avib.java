package defpackage;
/* compiled from: PG */
/* renamed from: avib  reason: default package */
/* loaded from: classes2.dex */
public final class avib {
    public final aajl a;
    public final avic b;

    public avib(avic avicVar, aajl aajlVar) {
        this.b = avicVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avib) && this.b.equals(((avib) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("TimedListDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
