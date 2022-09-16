package defpackage;
/* compiled from: PG */
/* renamed from: dqop  reason: default package */
/* loaded from: classes6.dex */
public final class dqop extends dsqw<dqop, dqoo> implements dssk {
    public static final dsrg<Integer, dpol> d = new dqon();
    public static final dqop e;
    private static volatile dssr<dqop> g;
    public int a;
    public int b;
    public dsrf c = dsqz.b;
    private int f;

    static {
        dqop dqopVar = new dqop();
        e = dqopVar;
        dsqw.cc(dqop.class, dqopVar);
    }

    private dqop() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003\u001e", new Object[]{"f", "a", "b", "c", dpol.c()});
            }
            if (i2 == 3) {
                return new dqop();
            }
            if (i2 == 4) {
                return new dqoo();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqop> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqop.class) {
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
