package defpackage;
/* compiled from: PG */
/* renamed from: ddrw  reason: default package */
/* loaded from: classes.dex */
public final class ddrw extends dsqw<ddrw, ddrv> implements dssk {
    public static final ddrw e;
    private static volatile dssr<ddrw> f;
    public int a;
    public int b = -1;
    public boolean c;
    public boolean d;

    static {
        ddrw ddrwVar = new ddrw();
        e = ddrwVar;
        dsqw.cc(ddrw.class, ddrwVar);
    }

    private ddrw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddrw();
            }
            if (i2 == 4) {
                return new ddrv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddrw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddrw.class) {
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
