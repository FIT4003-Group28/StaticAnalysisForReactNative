package defpackage;
/* compiled from: PG */
/* renamed from: dncf  reason: default package */
/* loaded from: classes6.dex */
public final class dncf extends dsqw<dncf, dnce> implements dssk {
    public static final dncf f;
    private static volatile dssr<dncf> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        dncf dncfVar = new dncf();
        f = dncfVar;
        dsqw.cc(dncf.class, dncfVar);
    }

    private dncf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dncf();
            }
            if (i2 == 4) {
                return new dnce();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dncf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dncf.class) {
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
