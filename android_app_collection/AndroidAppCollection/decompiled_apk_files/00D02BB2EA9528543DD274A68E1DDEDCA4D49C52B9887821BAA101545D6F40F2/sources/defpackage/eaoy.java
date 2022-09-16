package defpackage;
/* compiled from: PG */
/* renamed from: eaoy  reason: default package */
/* loaded from: classes.dex */
final class eaoy extends eaoz {
    private static final long serialVersionUID = 31156755687123L;
    private final byte n;

    public eaoy(String str, byte b) {
        super(str);
        this.n = b;
    }

    private Object readResolve() {
        switch (this.n) {
            case 1:
                return a;
            case 2:
                return b;
            case 3:
                return c;
            case 4:
                return d;
            case 5:
                return e;
            case 6:
                return f;
            case 7:
                return g;
            case 8:
                return h;
            case 9:
                return i;
            case 10:
                return j;
            case 11:
                return k;
            default:
                return l;
        }
    }

    @Override // defpackage.eaoz
    public final eaox a(eaok eaokVar) {
        eaok d = eaor.d(eaokVar);
        switch (this.n) {
            case 1:
                return d.S();
            case 2:
                return d.Q();
            case 3:
                return d.H();
            case 4:
                return d.M();
            case 5:
                return d.K();
            case 6:
                return d.F();
            case 7:
                return d.B();
            case 8:
                return d.x();
            case 9:
                return d.u();
            case 10:
                return d.r();
            case 11:
                return d.o();
            default:
                return d.l();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eaoy) && this.n == ((eaoy) obj).n;
    }

    public final int hashCode() {
        return 1 << this.n;
    }
}
