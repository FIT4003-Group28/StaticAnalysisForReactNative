package defpackage;
/* compiled from: PG */
/* renamed from: dtqg  reason: default package */
/* loaded from: classes6.dex */
public final class dtqg extends dsqw<dtqg, dtqf> implements dssk {
    public static final dtqg c;
    private static volatile dssr<dtqg> d;
    public int a;
    public dtqi b;

    static {
        dtqg dtqgVar = new dtqg();
        c = dtqgVar;
        dsqw.cc(dtqg.class, dtqgVar);
    }

    private dtqg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtqg();
            }
            if (i2 == 4) {
                return new dtqf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtqg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtqg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
