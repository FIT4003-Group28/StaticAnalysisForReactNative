package defpackage;
/* compiled from: PG */
/* renamed from: dhzk  reason: default package */
/* loaded from: classes6.dex */
public final class dhzk extends dsqw<dhzk, dhzj> implements dssk {
    public static final dhzk a;
    private static volatile dssr<dhzk> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dhzk dhzkVar = new dhzk();
        a = dhzkVar;
        dsqw.cc(dhzk.class, dhzkVar);
    }

    private dhzk() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dhzk();
            }
            if (i2 == 4) {
                return new dhzj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dhzk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhzk.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
