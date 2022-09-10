package defpackage;
/* compiled from: PG */
/* renamed from: dtok  reason: default package */
/* loaded from: classes6.dex */
public final class dtok extends dsqw<dtok, dtoj> implements dssk {
    public static final dtok d;
    private static volatile dssr<dtok> f;
    public dqjf a;
    public int b;
    public int c;
    private int e;

    static {
        dtok dtokVar = new dtok();
        d = dtokVar;
        dsqw.cc(dtok.class, dtokVar);
    }

    private dtok() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဌ\u0001\u0004င\u0002", new Object[]{"e", "a", "b", dqjh.c(), "c"});
            }
            if (i2 == 3) {
                return new dtok();
            }
            if (i2 == 4) {
                return new dtoj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtok> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtok.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
