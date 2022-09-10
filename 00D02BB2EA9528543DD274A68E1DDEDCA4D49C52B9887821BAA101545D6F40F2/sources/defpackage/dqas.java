package defpackage;
/* compiled from: PG */
/* renamed from: dqas  reason: default package */
/* loaded from: classes6.dex */
public final class dqas extends dsqw<dqas, dqap> implements dssk {
    public static final dqas c;
    private static volatile dssr<dqas> d;
    public int a;
    public dqar b;

    static {
        dqas dqasVar = new dqas();
        c = dqasVar;
        dsqw.cc(dqas.class, dqasVar);
    }

    private dqas() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqas();
            }
            if (i2 == 4) {
                return new dqap();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqas> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqas.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
