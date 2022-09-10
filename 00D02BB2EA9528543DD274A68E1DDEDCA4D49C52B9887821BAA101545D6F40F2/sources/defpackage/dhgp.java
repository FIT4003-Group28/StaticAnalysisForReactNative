package defpackage;
/* compiled from: PG */
/* renamed from: dhgp  reason: default package */
/* loaded from: classes6.dex */
public final class dhgp extends dsqw<dhgp, dhgo> implements dssk {
    public static final dhgp d;
    private static volatile dssr<dhgp> g;
    public int a;
    public dhgr c;
    private dhhb e;
    private byte f = 2;
    public String b = "";

    static {
        dhgp dhgpVar = new dhgp();
        d = dhgpVar;
        dsqw.cc(dhgp.class, dhgpVar);
    }

    private dhgp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003", new Object[]{"a", "b", "c", "e"});
            }
            if (i2 == 3) {
                return new dhgp();
            }
            if (i2 == 4) {
                return new dhgo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dhgp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhgp.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
