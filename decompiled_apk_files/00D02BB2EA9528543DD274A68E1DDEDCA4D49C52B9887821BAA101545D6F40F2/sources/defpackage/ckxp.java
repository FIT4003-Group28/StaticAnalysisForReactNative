package defpackage;
/* compiled from: PG */
/* renamed from: ckxp  reason: default package */
/* loaded from: classes5.dex */
public final class ckxp extends dsqw<ckxp, ckxo> implements dssk {
    public static final ckxp c;
    private static volatile dssr<ckxp> d;
    public dsrj<ckxn> a = dssu.b;
    public dsrj<dspd> b = dssu.b;

    static {
        ckxp ckxpVar = new ckxp();
        c = ckxpVar;
        dsqw.cc(ckxp.class, ckxpVar);
    }

    private ckxp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001c", new Object[]{"a", ckxn.class, "b"});
            }
            if (i2 == 3) {
                return new ckxp();
            }
            if (i2 == 4) {
                return new ckxo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckxp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ckxp.class) {
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
