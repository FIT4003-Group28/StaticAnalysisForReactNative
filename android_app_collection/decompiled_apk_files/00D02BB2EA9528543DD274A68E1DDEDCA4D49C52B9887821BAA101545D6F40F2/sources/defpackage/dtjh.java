package defpackage;
/* compiled from: PG */
/* renamed from: dtjh  reason: default package */
/* loaded from: classes6.dex */
public final class dtjh extends dsqw<dtjh, dtjg> implements dssk {
    public static final dtjh c;
    private static volatile dssr<dtjh> d;
    public int a;
    public String b = "";

    static {
        dtjh dtjhVar = new dtjh();
        c = dtjhVar;
        dsqw.cc(dtjh.class, dtjhVar);
    }

    private dtjh() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtjh();
            }
            if (i2 == 4) {
                return new dtjg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtjh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtjh.class) {
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
