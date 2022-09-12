package defpackage;
/* compiled from: PG */
/* renamed from: dtam  reason: default package */
/* loaded from: classes6.dex */
public final class dtam extends dsqw<dtam, dtal> implements dssk {
    public static final dtam d;
    private static volatile dssr<dtam> e;
    public int a;
    public dtak b;
    public dtak c;

    static {
        dtam dtamVar = new dtam();
        d = dtamVar;
        dsqw.cc(dtam.class, dtamVar);
    }

    private dtam() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtam();
            }
            if (i2 == 4) {
                return new dtal();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtam> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtam.class) {
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
