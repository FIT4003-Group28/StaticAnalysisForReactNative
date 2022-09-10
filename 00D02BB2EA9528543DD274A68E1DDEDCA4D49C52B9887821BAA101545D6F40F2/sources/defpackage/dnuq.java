package defpackage;
/* compiled from: PG */
/* renamed from: dnuq  reason: default package */
/* loaded from: classes6.dex */
public final class dnuq extends dsqw<dnuq, dnun> implements dssk {
    public static final dnuq d;
    private static volatile dssr<dnuq> g;
    public Object b;
    private int e;
    public int a = 0;
    private byte f = 2;
    public String c = "";

    static {
        dnuq dnuqVar = new dnuq();
        d = dnuqVar;
        dsqw.cc(dnuq.class, dnuqVar);
    }

    private dnuq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ြ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ဈ\u0003", new Object[]{"b", "a", "e", dnup.class, dnui.class, dnvk.class, "c"});
            }
            if (i2 == 3) {
                return new dnuq();
            }
            if (i2 == 4) {
                return new dnun();
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
            dssr<dnuq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnuq.class) {
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
