package defpackage;
/* compiled from: PG */
/* renamed from: dlxi  reason: default package */
/* loaded from: classes.dex */
public final class dlxi extends dsqw<dlxi, dlxh> implements dssk {
    public static final dlxi c;
    private static volatile dssr<dlxi> d;
    public dsrj<dlwm> a = dssu.b;
    public dsre b = dsqk.b;

    static {
        dlxi dlxiVar = new dlxi();
        c = dlxiVar;
        dsqw.cc(dlxi.class, dlxiVar);
    }

    private dlxi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u0013", new Object[]{"a", dlwm.class, "b"});
            }
            if (i2 == 3) {
                return new dlxi();
            }
            if (i2 == 4) {
                return new dlxh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlxi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlxi.class) {
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
