package defpackage;
/* compiled from: PG */
/* renamed from: eagj  reason: default package */
/* loaded from: classes6.dex */
public final class eagj {
    public static final eajc a = eajc.b(":");
    public static final eajc b = eajc.b(":status");
    public static final eajc c = eajc.b(":method");
    public static final eajc d = eajc.b(":path");
    public static final eajc e = eajc.b(":scheme");
    public static final eajc f = eajc.b(":authority");
    public final eajc g;
    public final eajc h;
    final int i;

    public eagj(String str, String str2) {
        this(eajc.b(str), eajc.b(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eagj) {
            eagj eagjVar = (eagj) obj;
            if (this.g.equals(eagjVar.g) && this.h.equals(eagjVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.g.hashCode() + 527) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return eafa.v("%s: %s", this.g.c(), this.h.c());
    }

    public eagj(eajc eajcVar, String str) {
        this(eajcVar, eajc.b(str));
    }

    public eagj(eajc eajcVar, eajc eajcVar2) {
        this.g = eajcVar;
        this.h = eajcVar2;
        this.i = eajcVar.h() + 32 + eajcVar2.h();
    }
}
