package defpackage;
/* compiled from: PG */
/* renamed from: dhxq  reason: default package */
/* loaded from: classes6.dex */
public final class dhxq extends dsqw<dhxq, dhxp> implements dssk {
    public static final dhxq a;
    private static volatile dssr<dhxq> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dhxq dhxqVar = new dhxq();
        a = dhxqVar;
        dsqw.cc(dhxq.class, dhxqVar);
    }

    private dhxq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dhxq();
            }
            if (i2 == 4) {
                return new dhxp();
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
            dssr<dhxq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhxq.class) {
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
