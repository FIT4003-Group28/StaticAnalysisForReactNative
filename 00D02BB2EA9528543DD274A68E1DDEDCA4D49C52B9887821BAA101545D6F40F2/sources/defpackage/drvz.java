package defpackage;
/* compiled from: PG */
/* renamed from: drvz  reason: default package */
/* loaded from: classes6.dex */
public final class drvz extends dsqw<drvz, drvy> implements dssk {
    public static final drvz c;
    private static volatile dssr<drvz> d;
    public int a;
    public int b = -1;

    static {
        drvz drvzVar = new drvz();
        c = drvzVar;
        dsqw.cc(drvz.class, drvzVar);
    }

    private drvz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drvz();
            }
            if (i2 == 4) {
                return new drvy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drvz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drvz.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
