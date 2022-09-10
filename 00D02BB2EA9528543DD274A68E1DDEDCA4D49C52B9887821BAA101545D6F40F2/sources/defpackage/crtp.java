package defpackage;
/* compiled from: PG */
/* renamed from: crtp  reason: default package */
/* loaded from: classes5.dex */
public final class crtp extends dsqw<crtp, crtm> implements dssk {
    public static final crtp d;
    private static volatile dssr<crtp> e;
    public int a;
    public int b;
    public int c;

    static {
        crtp crtpVar = new crtp();
        d = crtpVar;
        dsqw.cc(crtp.class, crtpVar);
    }

    private crtp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", crtn.a, "c"});
            }
            if (i2 == 3) {
                return new crtp();
            }
            if (i2 == 4) {
                return new crtm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<crtp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (crtp.class) {
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
