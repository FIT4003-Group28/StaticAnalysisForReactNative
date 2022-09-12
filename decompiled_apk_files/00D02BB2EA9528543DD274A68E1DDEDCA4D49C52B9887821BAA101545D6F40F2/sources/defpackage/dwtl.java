package defpackage;
/* compiled from: PG */
/* renamed from: dwtl  reason: default package */
/* loaded from: classes6.dex */
public final class dwtl extends dsqw<dwtl, dwtk> implements dssk {
    public static final dwtl d;
    private static volatile dssr<dwtl> e;
    public int a;
    public int b = 10;
    public dqao c;

    static {
        dwtl dwtlVar = new dwtl();
        d = dwtlVar;
        dsqw.cc(dwtl.class, dwtlVar);
    }

    private dwtl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwtl();
            }
            if (i2 == 4) {
                return new dwtk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwtl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwtl.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
