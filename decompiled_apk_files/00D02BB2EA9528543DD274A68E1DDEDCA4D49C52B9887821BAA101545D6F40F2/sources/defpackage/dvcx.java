package defpackage;
/* compiled from: PG */
/* renamed from: dvcx  reason: default package */
/* loaded from: classes6.dex */
public final class dvcx extends dsqw<dvcx, dvcu> implements dssk {
    public static final dvcx c;
    private static volatile dssr<dvcx> e;
    public int a;
    public dvcr b;
    private int d;

    static {
        dvcx dvcxVar = new dvcx();
        c = dvcxVar;
        dsqw.cc(dvcx.class, dvcxVar);
    }

    private dvcx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", dvcw.c(), "b"});
            }
            if (i2 == 3) {
                return new dvcx();
            }
            if (i2 == 4) {
                return new dvcu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvcx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvcx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
