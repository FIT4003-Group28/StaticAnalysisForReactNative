package defpackage;
/* compiled from: PG */
/* renamed from: dfxw  reason: default package */
/* loaded from: classes6.dex */
public final class dfxw extends dsqw<dfxw, dfxv> implements dssk {
    public static final dfxw f;
    private static volatile dssr<dfxw> g;
    public int a;
    public int b;
    public dfwr c;
    public dfym d;
    public dfxq e;

    static {
        dfxw dfxwVar = new dfxw();
        f = dfxwVar;
        dsqw.cc(dfxw.class, dfxwVar);
    }

    private dfxw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဌ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005", new Object[]{"a", "b", dfwl.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfxw();
            }
            if (i2 == 4) {
                return new dfxv();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfxw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfxw.class) {
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
