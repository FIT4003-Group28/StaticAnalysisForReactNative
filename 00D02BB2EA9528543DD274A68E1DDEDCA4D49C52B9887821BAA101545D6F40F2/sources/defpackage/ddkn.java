package defpackage;
/* compiled from: PG */
/* renamed from: ddkn  reason: default package */
/* loaded from: classes.dex */
public final class ddkn extends dsqw<ddkn, ddkm> implements dssk {
    public static final ddkn d;
    private static volatile dssr<ddkn> e;
    public int a;
    public int b;
    public boolean c;

    static {
        ddkn ddknVar = new ddkn();
        d = ddknVar;
        dsqw.cc(ddkn.class, ddknVar);
    }

    private ddkn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddkn();
            }
            if (i2 == 4) {
                return new ddkm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddkn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddkn.class) {
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
