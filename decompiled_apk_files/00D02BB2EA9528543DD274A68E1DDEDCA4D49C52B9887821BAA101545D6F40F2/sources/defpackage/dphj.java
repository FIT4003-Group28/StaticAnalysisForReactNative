package defpackage;
/* compiled from: PG */
/* renamed from: dphj  reason: default package */
/* loaded from: classes6.dex */
public final class dphj extends dsqw<dphj, dphg> implements dssk {
    public static final dphj b;
    private static volatile dssr<dphj> c;
    public dsrj<dphi> a = dssu.b;

    static {
        dphj dphjVar = new dphj();
        b = dphjVar;
        dsqw.cc(dphj.class, dphjVar);
    }

    private dphj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dphi.class});
            }
            if (i2 == 3) {
                return new dphj();
            }
            if (i2 == 4) {
                return new dphg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dphj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dphj.class) {
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
        dsrj<dphi> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
