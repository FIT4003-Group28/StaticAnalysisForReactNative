package defpackage;
/* compiled from: PG */
/* renamed from: dqnt  reason: default package */
/* loaded from: classes6.dex */
public final class dqnt extends dsqw<dqnt, dqns> implements dssk {
    public static final dqnt e;
    private static volatile dssr<dqnt> f;
    public int a;
    public dqnp b;
    public dqnr c;
    public String d = "";

    static {
        dqnt dqntVar = new dqnt();
        e = dqntVar;
        dsqw.cc(dqnt.class, dqntVar);
    }

    private dqnt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dqnt();
            }
            if (i2 == 4) {
                return new dqns();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqnt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqnt.class) {
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
