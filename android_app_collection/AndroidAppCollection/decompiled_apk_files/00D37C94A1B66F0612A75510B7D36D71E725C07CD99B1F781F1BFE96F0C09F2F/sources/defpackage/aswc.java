package defpackage;
/* compiled from: PG */
/* renamed from: aswc  reason: default package */
/* loaded from: classes2.dex */
public final class aswc {
    public final aajl a;
    public final aswg b;

    public aswc(aswg aswgVar, aajl aajlVar) {
        this.b = aswgVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aswc) && this.b.equals(((aswc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("LoggingUrlModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
