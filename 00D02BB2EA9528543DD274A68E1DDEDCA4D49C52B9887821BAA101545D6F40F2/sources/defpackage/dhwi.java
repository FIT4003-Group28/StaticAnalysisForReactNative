package defpackage;
/* compiled from: PG */
/* renamed from: dhwi  reason: default package */
/* loaded from: classes6.dex */
public final class dhwi extends dsqw<dhwi, dhwh> implements dssk {
    public static final dhwi a;
    private static volatile dssr<dhwi> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dhwi dhwiVar = new dhwi();
        a = dhwiVar;
        dsqw.cc(dhwi.class, dhwiVar);
    }

    private dhwi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dhwi();
            }
            if (i2 == 4) {
                return new dhwh();
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
            dssr<dhwi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhwi.class) {
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
