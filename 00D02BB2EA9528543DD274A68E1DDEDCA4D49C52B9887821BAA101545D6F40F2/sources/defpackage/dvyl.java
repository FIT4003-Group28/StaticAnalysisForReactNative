package defpackage;
/* compiled from: PG */
/* renamed from: dvyl  reason: default package */
/* loaded from: classes.dex */
public final class dvyl extends dsqw<dvyl, dvyi> implements dssk {
    public static final dvyl b;
    private static volatile dssr<dvyl> d;
    public int a;
    private int c;

    static {
        dvyl dvylVar = new dvyl();
        b = dvylVar;
        dsqw.cc(dvyl.class, dvylVar);
    }

    private dvyl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dvyj.a});
            }
            if (i2 == 3) {
                return new dvyl();
            }
            if (i2 == 4) {
                return new dvyi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvyl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvyl.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
