package defpackage;
/* compiled from: PG */
/* renamed from: drew  reason: default package */
/* loaded from: classes6.dex */
public final class drew extends dsqw<drew, drer> implements dssk {
    public static final drew g;
    private static volatile dssr<drew> h;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public int e;
    public int f;

    static {
        drew drewVar = new drew();
        g = drewVar;
        dsqw.cc(drew.class, drewVar);
    }

    private drew() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"c", "b", "a", "d", "e", "f", drey.c(), drev.class, dret.class});
            }
            if (i2 == 3) {
                return new drew();
            }
            if (i2 == 4) {
                return new drer();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drew> dssrVar = h;
            if (dssrVar == null) {
                synchronized (drew.class) {
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
