package defpackage;
/* compiled from: PG */
/* renamed from: rld  reason: default package */
/* loaded from: classes7.dex */
public final class rld extends dsqw<rld, rky> implements dssk {
    public static final rld b;
    private static volatile dssr<rld> c;
    public dsrj<rlc> a = dssu.b;

    static {
        rld rldVar = new rld();
        b = rldVar;
        dsqw.cc(rld.class, rldVar);
    }

    private rld() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", rlc.class});
            }
            if (i2 == 3) {
                return new rld();
            }
            if (i2 == 4) {
                return new rky();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<rld> dssrVar = c;
            if (dssrVar == null) {
                synchronized (rld.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<rlc> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
