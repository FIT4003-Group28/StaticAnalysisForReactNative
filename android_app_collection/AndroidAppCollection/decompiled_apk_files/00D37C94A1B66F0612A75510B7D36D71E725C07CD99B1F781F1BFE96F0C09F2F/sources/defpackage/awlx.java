package defpackage;
/* compiled from: PG */
/* renamed from: awlx  reason: default package */
/* loaded from: classes2.dex */
public final class awlx {
    public final aajl a;
    public final awmd b;

    public awlx(awmd awmdVar, aajl aajlVar) {
        this.b = awmdVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awlx) && this.b.equals(((awlx) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("StyleRunModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
