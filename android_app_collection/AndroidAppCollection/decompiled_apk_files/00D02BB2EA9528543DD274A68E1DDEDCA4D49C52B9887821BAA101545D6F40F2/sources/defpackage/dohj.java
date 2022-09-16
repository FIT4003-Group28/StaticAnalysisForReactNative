package defpackage;
/* compiled from: PG */
/* renamed from: dohj  reason: default package */
/* loaded from: classes6.dex */
public final class dohj extends dsqw<dohj, dohi> implements dssk {
    public static final dohj c;
    private static volatile dssr<dohj> d;
    public int a;
    public int b;

    static {
        dohj dohjVar = new dohj();
        c = dohjVar;
        dsqw.cc(dohj.class, dohjVar);
    }

    private dohj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dpqw.c()});
            }
            if (i2 == 3) {
                return new dohj();
            }
            if (i2 == 4) {
                return new dohi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dohj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dohj.class) {
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
