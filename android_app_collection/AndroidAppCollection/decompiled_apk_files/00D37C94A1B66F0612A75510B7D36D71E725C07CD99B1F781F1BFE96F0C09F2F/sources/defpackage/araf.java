package defpackage;
/* compiled from: PG */
/* renamed from: araf  reason: default package */
/* loaded from: classes2.dex */
public final class araf {
    public final aajl a;
    public final arai b;

    public araf(arai araiVar, aajl aajlVar) {
        this.b = araiVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof araf) && this.b.equals(((araf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("StringRunModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
