package defpackage;
/* compiled from: PG */
/* renamed from: eabj  reason: default package */
/* loaded from: classes6.dex */
public final class eabj extends dsqw<eabj, eabi> implements dssk {
    public static final eabj e;
    private static volatile dssr<eabj> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        eabj eabjVar = new eabj();
        e = eabjVar;
        dsqw.cc(eabj.class, eabjVar);
    }

    private eabj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new eabj();
            }
            if (i2 == 4) {
                return new eabi();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eabj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (eabj.class) {
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