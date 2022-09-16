package defpackage;
/* compiled from: PG */
/* renamed from: arat  reason: default package */
/* loaded from: classes2.dex */
public final class arat {
    public final aajl a;
    public final arav b;

    public arat(arav aravVar, aajl aajlVar) {
        this.b = aravVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof arat) && this.b.equals(((arat) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("FormfillFieldResultModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
