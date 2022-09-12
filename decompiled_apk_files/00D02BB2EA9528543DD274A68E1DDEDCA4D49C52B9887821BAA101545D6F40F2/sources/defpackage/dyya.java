package defpackage;
/* compiled from: PG */
/* renamed from: dyya  reason: default package */
/* loaded from: classes6.dex */
public final class dyya {
    public static final eajc a = eajc.b(":status");
    public static final eajc b = eajc.b(":method");
    public static final eajc c = eajc.b(":path");
    public static final eajc d = eajc.b(":scheme");
    public static final eajc e = eajc.b(":authority");
    public final eajc f;
    public final eajc g;
    final int h;

    static {
        eajc.b(":host");
        eajc.b(":version");
    }

    public dyya(String str, String str2) {
        this(eajc.b(str), eajc.b(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dyya) {
            dyya dyyaVar = (dyya) obj;
            if (this.f.equals(dyyaVar.f) && this.g.equals(dyyaVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f.c(), this.g.c());
    }

    public dyya(eajc eajcVar, String str) {
        this(eajcVar, eajc.b(str));
    }

    public dyya(eajc eajcVar, eajc eajcVar2) {
        this.f = eajcVar;
        this.g = eajcVar2;
        this.h = eajcVar.h() + 32 + eajcVar2.h();
    }
}
