package defpackage;
/* compiled from: PG */
/* renamed from: drqz  reason: default package */
/* loaded from: classes6.dex */
public final class drqz extends dsqw<drqz, drpt> implements dssk {
    public static final drqz e;
    private static volatile dssr<drqz> f;
    public int a;
    public drqy b;
    public drpv c;
    public int d;

    static {
        drqz drqzVar = new drqz();
        e = drqzVar;
        dsqw.cc(drqz.class, drqzVar);
    }

    private drqz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", drpw.a});
            }
            if (i2 == 3) {
                return new drqz();
            }
            if (i2 == 4) {
                return new drpt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drqz.class) {
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
