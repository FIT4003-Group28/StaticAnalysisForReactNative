package defpackage;
/* compiled from: PG */
/* renamed from: dppn  reason: default package */
/* loaded from: classes6.dex */
public final class dppn extends dsqw<dppn, dppm> implements dssk {
    public static final dppn f;
    private static volatile dssr<dppn> g;
    public int a;
    public int b = 0;
    public Object c;
    public dpov d;
    public dppt e;

    static {
        dppn dppnVar = new dppn();
        f = dppnVar;
        dsqw.cc(dppn.class, dppnVar);
    }

    private dppn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ြ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005ြ\u0000", new Object[]{"c", "b", "a", dpqb.class, "d", "e", dpqh.class});
            }
            if (i2 == 3) {
                return new dppn();
            }
            if (i2 == 4) {
                return new dppm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dppn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dppn.class) {
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
