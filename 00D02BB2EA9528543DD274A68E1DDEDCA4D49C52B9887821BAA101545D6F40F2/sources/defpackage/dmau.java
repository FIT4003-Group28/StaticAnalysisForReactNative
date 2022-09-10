package defpackage;
/* compiled from: PG */
/* renamed from: dmau  reason: default package */
/* loaded from: classes6.dex */
public final class dmau extends dsqw<dmau, dmat> implements dssk {
    public static final dmau f;
    private static volatile dssr<dmau> g;
    public int a;
    public dmbw b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        dmau dmauVar = new dmau();
        f = dmauVar;
        dsqw.cc(dmau.class, dmauVar);
    }

    private dmau() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0003\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", "e", "c", "d"});
            }
            if (i2 == 3) {
                return new dmau();
            }
            if (i2 == 4) {
                return new dmat();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmau> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmau.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
