package defpackage;
/* compiled from: PG */
/* renamed from: dtjf  reason: default package */
/* loaded from: classes6.dex */
public final class dtjf extends dsqw<dtjf, dtjc> implements dssk {
    public static final dtjf d;
    private static volatile dssr<dtjf> e;
    public int a;
    public int b;
    public int c;

    static {
        dtjf dtjfVar = new dtjf();
        d = dtjfVar;
        dsqw.cc(dtjf.class, dtjfVar);
    }

    private dtjf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဆ\u0001", new Object[]{"a", "b", dtjd.a, "c"});
            }
            if (i2 == 3) {
                return new dtjf();
            }
            if (i2 == 4) {
                return new dtjc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtjf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtjf.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
