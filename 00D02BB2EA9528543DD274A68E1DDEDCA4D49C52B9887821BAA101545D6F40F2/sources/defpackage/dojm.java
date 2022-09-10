package defpackage;
/* compiled from: PG */
/* renamed from: dojm  reason: default package */
/* loaded from: classes6.dex */
public final class dojm extends dsqw<dojm, dojk> implements dssk {
    public static final dojm f;
    private static volatile dssr<dojm> g;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public dolm e;

    static {
        dojm dojmVar = new dojm();
        f = dojmVar;
        dsqw.cc(dojm.class, dojmVar);
    }

    private dojm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0004ျ\u0000\u0005ဉ\u0001\u0006ြ\u0000", new Object[]{"c", "b", "a", "d", dojl.a, "e", dpov.class});
            }
            if (i2 == 3) {
                return new dojm();
            }
            if (i2 == 4) {
                return new dojk();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dojm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dojm.class) {
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
