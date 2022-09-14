package defpackage;
/* compiled from: PG */
/* renamed from: dxvo  reason: default package */
/* loaded from: classes6.dex */
public final class dxvo extends dsqw<dxvo, dxvn> implements dssk {
    public static final dxvo g;
    private static volatile dssr<dxvo> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        dxvo dxvoVar = new dxvo();
        g = dxvoVar;
        dsqw.cc(dxvo.class, dxvoVar);
    }

    private dxvo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0000\u0006\u0000\u0000\u0003\t\u0006\u0000\u0000\u0000\u0003\u0004\u0004\u0004\u0005\u0004\u0007\f\b\f\t\f", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dxvo();
            }
            if (i2 == 4) {
                return new dxvn();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxvo> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dxvo.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
