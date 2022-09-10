package defpackage;
/* compiled from: PG */
/* renamed from: ckzc  reason: default package */
/* loaded from: classes5.dex */
public final class ckzc extends dsqw<ckzc, ckzb> implements dssk {
    public static final ckzc c;
    private static volatile dssr<ckzc> d;
    public int a;
    public dspd b = dspd.b;

    static {
        ckzc ckzcVar = new ckzc();
        c = ckzcVar;
        dsqw.cc(ckzc.class, ckzcVar);
    }

    private ckzc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ckzc();
            }
            if (i2 == 4) {
                return new ckzb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckzc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ckzc.class) {
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
