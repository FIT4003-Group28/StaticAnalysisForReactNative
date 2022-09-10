package defpackage;
/* compiled from: PG */
/* renamed from: dukx  reason: default package */
/* loaded from: classes.dex */
public final class dukx extends dsqw<dukx, dukw> implements dssk {
    public static final dukx c;
    private static volatile dssr<dukx> e;
    public int a = 100;
    public int b = 21;
    private int d;

    static {
        dukx dukxVar = new dukx();
        c = dukxVar;
        dsqw.cc(dukx.class, dukxVar);
    }

    private dukx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dukx();
            }
            if (i2 == 4) {
                return new dukw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dukx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dukx.class) {
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
