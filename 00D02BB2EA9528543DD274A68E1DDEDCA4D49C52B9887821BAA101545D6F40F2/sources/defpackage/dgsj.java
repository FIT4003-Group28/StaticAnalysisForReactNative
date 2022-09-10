package defpackage;
/* compiled from: PG */
/* renamed from: dgsj  reason: default package */
/* loaded from: classes6.dex */
public final class dgsj extends dsqw<dgsj, dgsg> implements dssk {
    public static final dgsj f;
    private static volatile dssr<dgsj> g;
    public int a;
    public int b = 1;
    public boolean c;
    public dgsf d;
    public dgsf e;

    static {
        dgsj dgsjVar = new dgsj();
        f = dgsjVar;
        dsqw.cc(dgsj.class, dgsjVar);
    }

    private dgsj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0006ဉ\u0003\u0007ဉ\u0004", new Object[]{"a", "b", dgsh.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dgsj();
            }
            if (i2 == 4) {
                return new dgsg();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgsj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgsj.class) {
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
