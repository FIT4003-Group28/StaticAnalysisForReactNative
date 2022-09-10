package defpackage;
/* compiled from: PG */
/* renamed from: ckyf  reason: default package */
/* loaded from: classes5.dex */
public final class ckyf extends dsqw<ckyf, ckyd> implements dssk {
    public static final ckyf e;
    private static volatile dssr<ckyf> f;
    public int a;
    public long b;
    public int c;
    public dsrj<ckwb> d = dssu.b;

    static {
        ckyf ckyfVar = new ckyf();
        e = ckyfVar;
        dsqw.cc(ckyf.class, ckyfVar);
    }

    private ckyf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"a", "b", "d", ckwb.class, "c", ckye.a});
            }
            if (i2 == 3) {
                return new ckyf();
            }
            if (i2 == 4) {
                return new ckyd();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckyf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ckyf.class) {
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
