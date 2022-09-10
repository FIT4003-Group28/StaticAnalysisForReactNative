package defpackage;
/* compiled from: PG */
/* renamed from: drsg  reason: default package */
/* loaded from: classes6.dex */
public final class drsg extends dsqw<drsg, drsd> implements dssk {
    public static final drsg d;
    private static volatile dssr<drsg> e;
    public int a;
    public drsf b;
    public int c;

    static {
        drsg drsgVar = new drsg();
        d = drsgVar;
        dsqw.cc(drsg.class, drsgVar);
    }

    private drsg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", drsc.a});
            }
            if (i2 == 3) {
                return new drsg();
            }
            if (i2 == 4) {
                return new drsd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drsg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drsg.class) {
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
