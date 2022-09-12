package defpackage;
/* compiled from: PG */
/* renamed from: dieq  reason: default package */
/* loaded from: classes6.dex */
public final class dieq extends dsqw<dieq, diec> implements dssk {
    public static final dieq f;
    private static volatile dssr<dieq> g;
    public int a;
    public Object c;
    public int b = 0;
    public dspd d = dspd.b;
    public dspd e = dspd.b;

    static {
        dieq dieqVar = new dieq();
        f = dieqVar;
        dsqw.cc(dieq.class, dieqVar);
    }

    private dieq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ည\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ည\u0004", new Object[]{"c", "b", "a", "d", diei.class, dieo.class, "e"});
            }
            if (i2 == 3) {
                return new dieq();
            }
            if (i2 == 4) {
                return new diec();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dieq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dieq.class) {
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
