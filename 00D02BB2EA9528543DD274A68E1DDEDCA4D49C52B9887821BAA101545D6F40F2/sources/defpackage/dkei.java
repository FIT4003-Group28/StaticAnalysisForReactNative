package defpackage;
/* compiled from: PG */
/* renamed from: dkei  reason: default package */
/* loaded from: classes.dex */
public final class dkei extends dsqw<dkei, dkef> implements dssk {
    public static final dkei f;
    private static volatile dssr<dkei> g;
    public int a;
    public dsrj<dkei> b = dssu.b;
    public dkeh c;
    public dqlw d;
    public dqlz e;

    static {
        dkei dkeiVar = new dkei();
        f = dkeiVar;
        dsqw.cc(dkei.class, dkeiVar);
    }

    private dkei() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0005ဉ\u0002", new Object[]{"a", "b", dkei.class, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dkei();
            }
            if (i2 == 4) {
                return new dkef();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkei> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkei.class) {
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
