package defpackage;
/* compiled from: PG */
/* renamed from: dnld  reason: default package */
/* loaded from: classes6.dex */
public final class dnld extends dsqw<dnld, dnkx> implements dssk {
    public static final dnld e;
    private static volatile dssr<dnld> f;
    public int a;
    public dnlc b;
    public dspd c = dspd.b;
    public dsrj<dnkz> d = dssu.b;

    static {
        dnld dnldVar = new dnld();
        e = dnldVar;
        dsqw.cc(dnld.class, dnldVar);
    }

    private dnld() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ည\u0001\u0002\u001b\u0003ဉ\u0000", new Object[]{"a", "c", "d", dnkz.class, "b"});
            }
            if (i2 == 3) {
                return new dnld();
            }
            if (i2 == 4) {
                return new dnkx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnld> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnld.class) {
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

    public final void b() {
        dsrj<dnkz> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
