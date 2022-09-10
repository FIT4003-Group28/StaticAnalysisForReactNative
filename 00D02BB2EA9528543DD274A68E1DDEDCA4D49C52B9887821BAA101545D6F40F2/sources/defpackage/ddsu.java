package defpackage;
/* compiled from: PG */
/* renamed from: ddsu  reason: default package */
/* loaded from: classes6.dex */
public final class ddsu extends dsqw<ddsu, ddsk> implements dssk {
    public static final ddsu e;
    private static volatile dssr<ddsu> f;
    public int a;
    public int b;
    public dsrj<ddso> c = dssu.b;
    public dsrj<ddst> d = dssu.b;

    static {
        ddsu ddsuVar = new ddsu();
        e = ddsuVar;
        dsqw.cc(ddsu.class, ddsuVar);
    }

    private ddsu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", ddsp.a, "c", ddso.class, "d", ddst.class});
            }
            if (i2 == 3) {
                return new ddsu();
            }
            if (i2 == 4) {
                return new ddsk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddsu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddsu.class) {
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
