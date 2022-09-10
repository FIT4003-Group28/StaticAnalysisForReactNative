package defpackage;
/* compiled from: PG */
/* renamed from: drxq  reason: default package */
/* loaded from: classes6.dex */
public final class drxq extends dsqw<drxq, drxp> implements dssk {
    public static final drxq d;
    private static volatile dssr<drxq> e;
    public int a;
    public dsay b;
    public dsau c;

    static {
        drxq drxqVar = new drxq();
        d = drxqVar;
        dsqw.cc(drxq.class, drxqVar);
    }

    private drxq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drxq();
            }
            if (i2 == 4) {
                return new drxp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drxq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drxq.class) {
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
