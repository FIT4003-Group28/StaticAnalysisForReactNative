package defpackage;
/* compiled from: PG */
/* renamed from: dhzg  reason: default package */
/* loaded from: classes6.dex */
public final class dhzg extends dsqw<dhzg, dhzf> implements dssk {
    public static final dhzg a;
    private static volatile dssr<dhzg> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dhzg dhzgVar = new dhzg();
        a = dhzgVar;
        dsqw.cc(dhzg.class, dhzgVar);
    }

    private dhzg() {
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
                return new dhzg();
            }
            if (i2 == 4) {
                return new dhzf();
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
            dssr<dhzg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhzg.class) {
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
