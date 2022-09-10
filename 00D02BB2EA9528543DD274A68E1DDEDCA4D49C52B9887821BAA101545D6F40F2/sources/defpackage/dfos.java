package defpackage;
/* compiled from: PG */
/* renamed from: dfos  reason: default package */
/* loaded from: classes6.dex */
public final class dfos extends dsqw<dfos, dfor> implements dssk {
    public static final dfos g;
    private static volatile dssr<dfos> h;
    public int a;
    public dfpk b;
    public dfpu c;
    public dfpe d;
    public dfow e;
    public dfou f;

    static {
        dfos dfosVar = new dfos();
        g = dfosVar;
        dsqw.cc(dfos.class, dfosVar);
    }

    private dfos() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dfos();
            }
            if (i2 == 4) {
                return new dfor();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfos> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dfos.class) {
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
