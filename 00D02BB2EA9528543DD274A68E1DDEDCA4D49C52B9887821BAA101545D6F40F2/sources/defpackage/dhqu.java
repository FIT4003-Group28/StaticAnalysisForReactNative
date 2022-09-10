package defpackage;
/* compiled from: PG */
/* renamed from: dhqu  reason: default package */
/* loaded from: classes6.dex */
public final class dhqu extends dsqw<dhqu, dhqt> implements dssk {
    public static final dhqu a;
    private static volatile dssr<dhqu> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dhqu dhquVar = new dhqu();
        a = dhquVar;
        dsqw.cc(dhqu.class, dhquVar);
    }

    private dhqu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dhqu();
            }
            if (i2 == 4) {
                return new dhqt();
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
            dssr<dhqu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhqu.class) {
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
