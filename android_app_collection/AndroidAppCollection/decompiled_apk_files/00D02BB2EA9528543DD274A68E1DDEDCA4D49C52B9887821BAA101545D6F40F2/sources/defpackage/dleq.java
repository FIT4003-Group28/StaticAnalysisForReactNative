package defpackage;
/* compiled from: PG */
/* renamed from: dleq  reason: default package */
/* loaded from: classes6.dex */
public final class dleq extends dsqw<dleq, dlen> implements dssk {
    public static final dleq f;
    private static volatile dssr<dleq> g;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public int e;

    static {
        dleq dleqVar = new dleq();
        f = dleqVar;
        dsqw.cc(dleq.class, dleqVar);
    }

    private dleq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဿ\u0000\u0003ြ\u0000\u0004င\u0003", new Object[]{"c", "b", "a", "d", dlep.c(), dler.a, dlek.class, "e"});
            }
            if (i2 == 3) {
                return new dleq();
            }
            if (i2 == 4) {
                return new dlen();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dleq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dleq.class) {
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
