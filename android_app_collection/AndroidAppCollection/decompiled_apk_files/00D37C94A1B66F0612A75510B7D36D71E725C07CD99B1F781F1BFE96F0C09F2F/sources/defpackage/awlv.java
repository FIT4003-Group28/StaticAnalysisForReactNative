package defpackage;
/* compiled from: PG */
/* renamed from: awlv  reason: default package */
/* loaded from: classes2.dex */
public final class awlv {
    public final aajl a;
    public final awmc b;

    public awlv(awmc awmcVar, aajl aajlVar) {
        this.b = awmcVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awlv) && this.b.equals(((awlv) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("DecorationRunModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
