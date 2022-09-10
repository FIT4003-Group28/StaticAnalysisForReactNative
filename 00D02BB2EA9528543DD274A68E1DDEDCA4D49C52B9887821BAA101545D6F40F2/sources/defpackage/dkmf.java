package defpackage;
/* compiled from: PG */
/* renamed from: dkmf  reason: default package */
/* loaded from: classes.dex */
public final class dkmf extends dsqw<dkmf, dkme> implements dssk {
    public static final dkmf b;
    private static volatile dssr<dkmf> d;
    public boolean a;
    private int c;

    static {
        dkmf dkmfVar = new dkmf();
        b = dkmfVar;
        dsqw.cc(dkmf.class, dkmfVar);
    }

    private dkmf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkmf();
            }
            if (i2 == 4) {
                return new dkme();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkmf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkmf.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
