package defpackage;
/* compiled from: PG */
/* renamed from: dhxa  reason: default package */
/* loaded from: classes6.dex */
public final class dhxa extends dsqw<dhxa, dhwz> implements dssk {
    public static final dhxa a;
    private static volatile dssr<dhxa> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dhxa dhxaVar = new dhxa();
        a = dhxaVar;
        dsqw.cc(dhxa.class, dhxaVar);
    }

    private dhxa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dhxa();
            }
            if (i2 == 4) {
                return new dhwz();
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
            dssr<dhxa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhxa.class) {
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
