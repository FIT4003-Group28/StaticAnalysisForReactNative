package defpackage;
/* compiled from: PG */
/* renamed from: ckf  reason: default package */
/* loaded from: classes4.dex */
public final class ckf extends dsqw<ckf, cke> implements dssk {
    public static final ckf e;
    private static volatile dssr<ckf> f;
    public dsrj<ckn> a = dssu.b;
    public dsrj<ckd> b = dssu.b;
    public dsrj<ckh> c = dssu.b;
    public dsrj<ckl> d = dssu.b;

    static {
        ckf ckfVar = new ckf();
        e = ckfVar;
        dsqw.cc(ckf.class, ckfVar);
    }

    private ckf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"a", ckn.class, "b", ckd.class, "c", ckh.class, "d", ckl.class});
            }
            if (i2 == 3) {
                return new ckf();
            }
            if (i2 == 4) {
                return new cke();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ckf.class) {
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
