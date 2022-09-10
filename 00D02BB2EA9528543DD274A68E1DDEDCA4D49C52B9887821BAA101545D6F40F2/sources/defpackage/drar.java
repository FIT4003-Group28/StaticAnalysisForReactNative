package defpackage;
/* compiled from: PG */
/* renamed from: drar  reason: default package */
/* loaded from: classes6.dex */
public final class drar extends dsqw<drar, draq> implements dssk {
    public static final drar f;
    private static volatile dssr<drar> g;
    public int a;
    public int b;
    public drap c;
    public drap d;
    public dgfg e;

    static {
        drar drarVar = new drar();
        f = drarVar;
        dsqw.cc(drar.class, drarVar);
    }

    private drar() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", dram.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new drar();
            }
            if (i2 == 4) {
                return new draq();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drar> dssrVar = g;
            if (dssrVar == null) {
                synchronized (drar.class) {
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
