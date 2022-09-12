package defpackage;
/* compiled from: PG */
/* renamed from: dhxm  reason: default package */
/* loaded from: classes6.dex */
public final class dhxm extends dsqw<dhxm, dhxl> implements dssk {
    public static final dhxm a;
    private static volatile dssr<dhxm> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dhxm dhxmVar = new dhxm();
        a = dhxmVar;
        dsqw.cc(dhxm.class, dhxmVar);
    }

    private dhxm() {
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
                return new dhxm();
            }
            if (i2 == 4) {
                return new dhxl();
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
            dssr<dhxm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhxm.class) {
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
