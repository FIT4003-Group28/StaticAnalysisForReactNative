package defpackage;
/* compiled from: PG */
/* renamed from: ckyt  reason: default package */
/* loaded from: classes5.dex */
public final class ckyt extends dsqw<ckyt, ckys> implements dssk {
    public static final ckyt b;
    private static volatile dssr<ckyt> c;
    public dsrf a = dsqz.b;

    static {
        ckyt ckytVar = new ckyt();
        b = ckytVar;
        dsqw.cc(ckyt.class, ckytVar);
    }

    private ckyt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new ckyt();
            }
            if (i2 == 4) {
                return new ckys();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckyt> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ckyt.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
