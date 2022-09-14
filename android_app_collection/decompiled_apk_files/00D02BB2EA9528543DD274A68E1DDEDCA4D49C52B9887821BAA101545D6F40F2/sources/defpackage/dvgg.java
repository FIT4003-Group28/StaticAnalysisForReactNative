package defpackage;
/* compiled from: PG */
/* renamed from: dvgg  reason: default package */
/* loaded from: classes6.dex */
public final class dvgg extends dsqw<dvgg, dvgd> implements dssk {
    public static final dvgg c;
    private static volatile dssr<dvgg> e;
    public long a;
    public int b;
    private int d;

    static {
        dvgg dvggVar = new dvgg();
        c = dvggVar;
        dsqw.cc(dvgg.class, dvggVar);
    }

    private dvgg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0002", new Object[]{"d", "a", "b", dvge.a});
            }
            if (i2 == 3) {
                return new dvgg();
            }
            if (i2 == 4) {
                return new dvgd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvgg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvgg.class) {
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
