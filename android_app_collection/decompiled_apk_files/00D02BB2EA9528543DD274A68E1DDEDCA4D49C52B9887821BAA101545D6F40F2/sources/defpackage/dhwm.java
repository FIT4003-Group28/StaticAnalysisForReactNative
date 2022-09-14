package defpackage;
/* compiled from: PG */
/* renamed from: dhwm  reason: default package */
/* loaded from: classes6.dex */
public final class dhwm extends dsqw<dhwm, dhwl> implements dssk {
    public static final dhwm d;
    private static volatile dssr<dhwm> g;
    public int a;
    public drdw c;
    private dnqh e;
    private byte f = 2;
    public String b = "";

    static {
        dhwm dhwmVar = new dhwm();
        d = dhwmVar;
        dsqw.cc(dhwm.class, dhwmVar);
    }

    private dhwm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ဈ\u0001\u0004ᐉ\u0000\u0005ဉ\u0004", new Object[]{"a", "b", "e", "c"});
            }
            if (i2 == 3) {
                return new dhwm();
            }
            if (i2 == 4) {
                return new dhwl();
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
            dssr<dhwm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhwm.class) {
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
