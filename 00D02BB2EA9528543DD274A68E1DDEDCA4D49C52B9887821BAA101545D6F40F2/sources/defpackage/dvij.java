package defpackage;
/* compiled from: PG */
/* renamed from: dvij  reason: default package */
/* loaded from: classes.dex */
public final class dvij extends dsqw<dvij, dvii> implements dssk {
    public static final dvij c;
    private static volatile dssr<dvij> d;
    public int a;
    public boolean b;

    static {
        dvij dvijVar = new dvij();
        c = dvijVar;
        dsqw.cc(dvij.class, dvijVar);
    }

    private dvij() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvij();
            }
            if (i2 == 4) {
                return new dvii();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvij> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvij.class) {
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
