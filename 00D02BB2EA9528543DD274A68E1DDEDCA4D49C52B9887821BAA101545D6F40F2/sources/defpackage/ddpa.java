package defpackage;
/* compiled from: PG */
/* renamed from: ddpa  reason: default package */
/* loaded from: classes.dex */
public final class ddpa extends dsqw<ddpa, ddox> implements dssk {
    public static final ddpa d;
    private static volatile dssr<ddpa> e;
    public int a;
    public int b = -1;
    public int c;

    static {
        ddpa ddpaVar = new ddpa();
        d = ddpaVar;
        dsqw.cc(ddpa.class, ddpaVar);
    }

    private ddpa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", ddoz.c()});
            }
            if (i2 == 3) {
                return new ddpa();
            }
            if (i2 == 4) {
                return new ddox();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddpa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddpa.class) {
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
