package defpackage;
/* compiled from: PG */
/* renamed from: dmma  reason: default package */
/* loaded from: classes.dex */
public final class dmma extends dsqw<dmma, dmlz> implements dssk {
    public static final dmma c;
    private static volatile dssr<dmma> e;
    public int a;
    public int b;
    private int d;

    static {
        dmma dmmaVar = new dmma();
        c = dmmaVar;
        dsqw.cc(dmma.class, dmmaVar);
    }

    private dmma() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dmma();
            }
            if (i2 == 4) {
                return new dmlz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmma> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmma.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
