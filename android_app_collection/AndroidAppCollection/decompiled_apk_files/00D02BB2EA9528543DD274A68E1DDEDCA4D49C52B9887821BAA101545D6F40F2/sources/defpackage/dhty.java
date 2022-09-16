package defpackage;
/* compiled from: PG */
/* renamed from: dhty  reason: default package */
/* loaded from: classes6.dex */
public final class dhty extends dsqw<dhty, dhtx> implements dssk {
    public static final dhty e;
    private static volatile dssr<dhty> g;
    public int a;
    public dpov b;
    public dnqh d;
    private byte f = 2;
    public dsrj<dppl> c = dssu.b;

    static {
        dhty dhtyVar = new dhty();
        e = dhtyVar;
        dsqw.cc(dhty.class, dhtyVar);
    }

    private dhty() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002\u001b\u0003ᐉ\u0001", new Object[]{"a", "b", "c", dppl.class, "d"});
            }
            if (i2 == 3) {
                return new dhty();
            }
            if (i2 == 4) {
                return new dhtx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dhty> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhty.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
