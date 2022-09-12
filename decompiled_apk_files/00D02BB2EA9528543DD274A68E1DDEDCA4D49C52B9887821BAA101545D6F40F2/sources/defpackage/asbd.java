package defpackage;
/* compiled from: PG */
/* renamed from: asbd  reason: default package */
/* loaded from: classes2.dex */
public final class asbd extends dsqw<asbd, asbc> implements dssk {
    public static final asbd e;
    private static volatile dssr<asbd> f;
    public int a;
    public boolean b;
    public long c;
    public int d;

    static {
        asbd asbdVar = new asbd();
        e = asbdVar;
        dsqw.cc(asbd.class, asbdVar);
    }

    private asbd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဃ\u0001\u0004င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new asbd();
            }
            if (i2 == 4) {
                return new asbc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<asbd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (asbd.class) {
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
