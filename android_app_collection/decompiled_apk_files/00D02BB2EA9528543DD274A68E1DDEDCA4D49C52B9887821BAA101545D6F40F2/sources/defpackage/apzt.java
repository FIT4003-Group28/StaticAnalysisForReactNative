package defpackage;
/* compiled from: PG */
/* renamed from: apzt  reason: default package */
/* loaded from: classes2.dex */
public final class apzt extends dsqw<apzt, apzq> implements dssk {
    public static final apzt e;
    private static volatile dssr<apzt> f;
    public int a;
    public int b;
    public int c;
    public boolean d;

    static {
        apzt apztVar = new apzt();
        e = apztVar;
        dsqw.cc(apzt.class, apztVar);
    }

    private apzt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"a", "b", apzr.a, "c", "d"});
            }
            if (i2 == 3) {
                return new apzt();
            }
            if (i2 == 4) {
                return new apzq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<apzt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (apzt.class) {
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
}
