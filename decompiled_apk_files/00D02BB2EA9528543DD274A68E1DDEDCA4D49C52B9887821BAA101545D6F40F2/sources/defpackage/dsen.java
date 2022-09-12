package defpackage;
/* compiled from: PG */
/* renamed from: dsen  reason: default package */
/* loaded from: classes6.dex */
public final class dsen extends dsqw<dsen, dsem> implements dssk {
    public static final dsen c;
    private static volatile dssr<dsen> e;
    public dstv a;
    public float b;
    private int d;

    static {
        dsen dsenVar = new dsen();
        c = dsenVar;
        dsqw.cc(dsen.class, dsenVar);
    }

    private dsen() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dsen();
            }
            if (i2 == 4) {
                return new dsem();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsen> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsen.class) {
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
