package defpackage;
/* compiled from: PG */
/* renamed from: dowb  reason: default package */
/* loaded from: classes6.dex */
public final class dowb extends dsqw<dowb, dovy> implements dssk {
    public static final dowb d;
    private static volatile dssr<dowb> e;
    public int a;
    public int b;
    public int c = 2;

    static {
        dowb dowbVar = new dowb();
        d = dowbVar;
        dsqw.cc(dowb.class, dowbVar);
    }

    private dowb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003ဌ\u0002", new Object[]{"a", "b", "c", dowa.c()});
            }
            if (i2 == 3) {
                return new dowb();
            }
            if (i2 == 4) {
                return new dovy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dowb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dowb.class) {
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
