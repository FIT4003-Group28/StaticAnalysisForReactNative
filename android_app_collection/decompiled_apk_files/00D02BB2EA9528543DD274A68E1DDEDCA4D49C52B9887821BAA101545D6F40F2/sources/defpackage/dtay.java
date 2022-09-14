package defpackage;
/* compiled from: PG */
/* renamed from: dtay  reason: default package */
/* loaded from: classes6.dex */
public final class dtay extends dsqw<dtay, dtax> implements dssk {
    public static final dtay e;
    private static volatile dssr<dtay> f;
    public int a;
    public int b;
    public int c;
    public dtak d;

    static {
        dtay dtayVar = new dtay();
        e = dtayVar;
        dsqw.cc(dtay.class, dtayVar);
    }

    private dtay() {
        dsqz dsqzVar = dsqz.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0006ဉ\u0005", new Object[]{"a", "b", dtau.a, "c", dtat.a, "d"});
            }
            if (i2 == 3) {
                return new dtay();
            }
            if (i2 == 4) {
                return new dtax();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtay> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtay.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void c(dtak dtakVar) {
        dtakVar.getClass();
        this.d = dtakVar;
        this.a |= 32;
    }
}
