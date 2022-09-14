package defpackage;
/* compiled from: PG */
/* renamed from: dqbv  reason: default package */
/* loaded from: classes6.dex */
public final class dqbv extends dsqw<dqbv, dqbr> implements dssk {
    public static final dqbv e;
    private static volatile dssr<dqbv> g;
    public Object b;
    public dqbt c;
    private int f;
    public int a = 0;
    public String d = "";

    static {
        dqbv dqbvVar = new dqbv();
        e = dqbvVar;
        dsqw.cc(dqbv.class, dqbvVar);
    }

    private dqbv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ဉ\u0005\u0006ဈ\u0006", new Object[]{"b", "a", "f", dqem.class, dqcb.class, dqcw.class, dpro.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dqbv();
            }
            if (i2 == 4) {
                return new dqbr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqbv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqbv.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
