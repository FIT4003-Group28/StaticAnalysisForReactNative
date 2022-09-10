package defpackage;
/* compiled from: PG */
/* renamed from: dtzx  reason: default package */
/* loaded from: classes6.dex */
public final class dtzx extends dsqw<dtzx, dtzw> implements dssk {
    public static final dtzx c;
    private static volatile dssr<dtzx> d;
    public dspt a;
    public dspt b;

    static {
        dtzx dtzxVar = new dtzx();
        c = dtzxVar;
        dsqw.cc(dtzx.class, dtzxVar);
    }

    private dtzx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtzx();
            }
            if (i2 == 4) {
                return new dtzw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtzx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtzx.class) {
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
