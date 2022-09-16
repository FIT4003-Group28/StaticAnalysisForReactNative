package defpackage;
/* compiled from: PG */
/* renamed from: aswx  reason: default package */
/* loaded from: classes2.dex */
public final class aswx {
    public final aajl a;
    public final asww b;

    public aswx(asww aswwVar, aajl aajlVar) {
        this.b = aswwVar;
        this.a = aajlVar;
    }

    public final arag a() {
        arag aragVar = this.b.c;
        return aragVar == null ? arag.a : aragVar;
    }

    public final awmt b() {
        awmt awmtVar = this.b.g;
        return awmtVar == null ? awmt.a : awmtVar;
    }

    public final Long c() {
        return Long.valueOf(this.b.e);
    }

    public final Long d() {
        return Long.valueOf(this.b.d);
    }

    public final boolean e() {
        return (this.b.b & 64) != 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aswx) && this.b.equals(((aswx) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("MacroMarkerMessageModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
