package defpackage;
/* compiled from: PG */
/* renamed from: drxf  reason: default package */
/* loaded from: classes6.dex */
public final class drxf extends dsqw<drxf, drxc> implements dssk {
    public static final drxf e;
    private static volatile dssr<drxf> f;
    public int a;
    public int b;
    public String c = "";
    public int d;

    static {
        drxf drxfVar = new drxf();
        e = drxfVar;
        dsqw.cc(drxf.class, drxfVar);
    }

    private drxf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", drxb.a, "c", "d", drxd.a});
            }
            if (i2 == 3) {
                return new drxf();
            }
            if (i2 == 4) {
                return new drxc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drxf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drxf.class) {
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
