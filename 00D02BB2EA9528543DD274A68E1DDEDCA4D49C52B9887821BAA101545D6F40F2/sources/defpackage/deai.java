package defpackage;
/* compiled from: PG */
/* renamed from: deai  reason: default package */
/* loaded from: classes6.dex */
public final class deai extends dsqw<deai, deah> implements dssk {
    public static final deai f;
    private static volatile dssr<deai> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        deai deaiVar = new deai();
        f = deaiVar;
        dsqw.cc(deai.class, deaiVar);
    }

    private deai() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", dnde.a});
            }
            if (i2 == 3) {
                return new deai();
            }
            if (i2 == 4) {
                return new deah();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<deai> dssrVar = g;
            if (dssrVar == null) {
                synchronized (deai.class) {
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
