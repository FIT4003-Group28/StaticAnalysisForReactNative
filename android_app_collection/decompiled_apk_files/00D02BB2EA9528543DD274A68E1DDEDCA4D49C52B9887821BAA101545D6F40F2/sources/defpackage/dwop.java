package defpackage;
/* compiled from: PG */
/* renamed from: dwop  reason: default package */
/* loaded from: classes.dex */
public final class dwop extends dsqw<dwop, dwom> implements dssk {
    public static final dwop f;
    private static volatile dssr<dwop> h;
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public boolean e;
    private int g;

    static {
        dwop dwopVar = new dwop();
        f = dwopVar;
        dsqw.cc(dwop.class, dwopVar);
    }

    private dwop() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဇ\u0005", new Object[]{"g", "a", "b", "c", "d", dwon.a, "e"});
            }
            if (i2 == 3) {
                return new dwop();
            }
            if (i2 == 4) {
                return new dwom();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwop> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwop.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
