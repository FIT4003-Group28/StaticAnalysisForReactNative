package defpackage;
/* compiled from: PG */
/* renamed from: dqal  reason: default package */
/* loaded from: classes6.dex */
public final class dqal extends dsqw<dqal, dqak> implements dssk {
    public static final dqal e;
    private static volatile dssr<dqal> f;
    public int a;
    public boolean b;
    public boolean c;
    public dqaa d;

    static {
        dqal dqalVar = new dqal();
        e = dqalVar;
        dsqw.cc(dqal.class, dqalVar);
    }

    private dqal() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dqal();
            }
            if (i2 == 4) {
                return new dqak();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqal> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqal.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
