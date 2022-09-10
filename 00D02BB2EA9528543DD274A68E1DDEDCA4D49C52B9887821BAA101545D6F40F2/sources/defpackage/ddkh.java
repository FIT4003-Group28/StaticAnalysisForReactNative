package defpackage;
/* compiled from: PG */
/* renamed from: ddkh  reason: default package */
/* loaded from: classes.dex */
public final class ddkh extends dsqw<ddkh, ddkg> implements dssk {
    public static final ddkh d;
    private static volatile dssr<ddkh> e;
    public int a;
    public String b = "";
    public boolean c;

    static {
        ddkh ddkhVar = new ddkh();
        d = ddkhVar;
        dsqw.cc(ddkh.class, ddkhVar);
    }

    private ddkh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddkh();
            }
            if (i2 == 4) {
                return new ddkg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddkh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddkh.class) {
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
