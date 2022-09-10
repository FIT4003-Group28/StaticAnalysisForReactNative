package defpackage;
/* compiled from: PG */
/* renamed from: dfdw  reason: default package */
/* loaded from: classes6.dex */
public final class dfdw extends dsqw<dfdw, dfdv> implements dssk {
    public static final dfdw d;
    private static volatile dssr<dfdw> e;
    public int a;
    public double b;
    public long c;

    static {
        dfdw dfdwVar = new dfdw();
        d = dfdwVar;
        dsqw.cc(dfdw.class, dfdwVar);
    }

    private dfdw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfdw();
            }
            if (i2 == 4) {
                return new dfdv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfdw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfdw.class) {
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
