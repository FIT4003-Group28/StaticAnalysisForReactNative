package defpackage;
/* compiled from: PG */
/* renamed from: dobf  reason: default package */
/* loaded from: classes6.dex */
public final class dobf extends dsqw<dobf, dobe> implements dssk {
    public static final dobf e;
    private static volatile dssr<dobf> f;
    public int a;
    public int b;
    public boolean c;
    public dobk d;

    static {
        dobf dobfVar = new dobf();
        e = dobfVar;
        dsqw.cc(dobf.class, dobfVar);
    }

    private dobf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", dqgh.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new dobf();
            }
            if (i2 == 4) {
                return new dobe();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dobf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dobf.class) {
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
