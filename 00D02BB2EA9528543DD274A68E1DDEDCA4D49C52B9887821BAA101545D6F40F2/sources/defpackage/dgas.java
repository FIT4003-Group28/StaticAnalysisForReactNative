package defpackage;
/* compiled from: PG */
/* renamed from: dgas  reason: default package */
/* loaded from: classes6.dex */
public final class dgas extends dsqw<dgas, dgar> implements dssk {
    public static final dgas e;
    private static volatile dssr<dgas> f;
    public int a;
    public int b;
    public String c = "";
    public int d;

    static {
        dgas dgasVar = new dgas();
        e = dgasVar;
        dsqw.cc(dgas.class, dgasVar);
    }

    private dgas() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dgas();
            }
            if (i2 == 4) {
                return new dgar();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgas> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgas.class) {
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
