package defpackage;
/* compiled from: PG */
/* renamed from: dvgs  reason: default package */
/* loaded from: classes.dex */
public final class dvgs extends dsqw<dvgs, dvgr> implements dssk {
    public static final dvgs b;
    private static volatile dssr<dvgs> c;
    public dsrj<dvgq> a = dssu.b;

    static {
        dvgs dvgsVar = new dvgs();
        b = dvgsVar;
        dsqw.cc(dvgs.class, dvgsVar);
    }

    private dvgs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dvgq.class});
            }
            if (i2 == 3) {
                return new dvgs();
            }
            if (i2 == 4) {
                return new dvgr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvgs> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dvgs.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
