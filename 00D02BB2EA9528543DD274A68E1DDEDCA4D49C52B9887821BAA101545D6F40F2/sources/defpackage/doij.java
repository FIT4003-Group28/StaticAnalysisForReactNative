package defpackage;
/* compiled from: PG */
/* renamed from: doij  reason: default package */
/* loaded from: classes6.dex */
public final class doij extends dsqw<doij, doii> implements dssk {
    public static final doij c;
    private static volatile dssr<doij> e;
    public int a;
    public dolm b;
    private int d;

    static {
        doij doijVar = new doij();
        c = doijVar;
        dsqw.cc(doij.class, doijVar);
    }

    private doij() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", doig.a, "b"});
            }
            if (i2 == 3) {
                return new doij();
            }
            if (i2 == 4) {
                return new doii();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doij> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doij.class) {
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
