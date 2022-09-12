package defpackage;
/* compiled from: PG */
/* renamed from: dkkl  reason: default package */
/* loaded from: classes6.dex */
public final class dkkl extends dsqw<dkkl, dkki> implements dssk {
    public static final dkkl b;
    private static volatile dssr<dkkl> c;
    public dsrj<dkkk> a = dssu.b;

    static {
        dkkl dkklVar = new dkkl();
        b = dkklVar;
        dsqw.cc(dkkl.class, dkklVar);
    }

    private dkkl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dkkk.class});
            }
            if (i2 == 3) {
                return new dkkl();
            }
            if (i2 == 4) {
                return new dkki();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkkl> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dkkl.class) {
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
