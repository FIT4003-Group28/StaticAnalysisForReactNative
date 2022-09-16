package defpackage;
/* compiled from: PG */
/* renamed from: awlu  reason: default package */
/* loaded from: classes2.dex */
public final class awlu {
    public final aajl a;
    public final awmb b;

    public awlu(awmb awmbVar, aajl aajlVar) {
        this.b = awmbVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awlu) && this.b.equals(((awlu) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("CommandRunModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
