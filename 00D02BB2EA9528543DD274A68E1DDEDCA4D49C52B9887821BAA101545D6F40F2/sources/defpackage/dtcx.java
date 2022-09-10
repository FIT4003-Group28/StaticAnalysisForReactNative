package defpackage;
/* compiled from: PG */
/* renamed from: dtcx  reason: default package */
/* loaded from: classes6.dex */
public final class dtcx extends dsqw<dtcx, dtcw> implements dssk {
    public static final dtcx c;
    private static volatile dssr<dtcx> d;
    public int a;
    public String b = "";

    static {
        dtcx dtcxVar = new dtcx();
        c = dtcxVar;
        dsqw.cc(dtcx.class, dtcxVar);
    }

    private dtcx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtcx();
            }
            if (i2 == 4) {
                return new dtcw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtcx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtcx.class) {
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
