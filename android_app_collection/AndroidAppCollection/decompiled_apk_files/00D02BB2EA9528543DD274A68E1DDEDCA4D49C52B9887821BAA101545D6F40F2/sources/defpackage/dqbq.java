package defpackage;
/* compiled from: PG */
/* renamed from: dqbq  reason: default package */
/* loaded from: classes6.dex */
public final class dqbq extends dsqw<dqbq, dqbj> implements dssk {
    public static final dqbq g;
    private static volatile dssr<dqbq> i;
    public Object b;
    public dpug c;
    public int d;
    private int h;
    public int a = 0;
    public int e = 77946;
    public String f = "";

    static {
        dqbq dqbqVar = new dqbq();
        g = dqbqVar;
        dsqw.cc(dqbq.class, dqbqVar);
    }

    private dqbq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"b", "a", "h", "c", dqbp.class, dqbn.class, "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dqbq();
            }
            if (i3 == 4) {
                return new dqbj();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqbq> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dqbq.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
