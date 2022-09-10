package defpackage;
/* compiled from: PG */
/* renamed from: agyj  reason: default package */
/* loaded from: classes2.dex */
public final class agyj extends dsqw<agyj, agyi> implements dssk {
    public static final agyj d;
    private static volatile dssr<agyj> e;
    public int a;
    public dspd b = dspd.b;
    public dspd c = dspd.b;

    static {
        agyj agyjVar = new agyj();
        d = agyjVar;
        dsqw.cc(agyj.class, agyjVar);
    }

    private agyj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new agyj();
            }
            if (i2 == 4) {
                return new agyi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<agyj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (agyj.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
