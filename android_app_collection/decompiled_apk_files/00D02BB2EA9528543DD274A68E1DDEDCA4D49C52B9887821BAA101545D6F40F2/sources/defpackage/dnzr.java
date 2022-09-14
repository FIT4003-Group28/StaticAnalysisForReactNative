package defpackage;
/* compiled from: PG */
/* renamed from: dnzr  reason: default package */
/* loaded from: classes6.dex */
public final class dnzr extends dsqw<dnzr, dnzq> implements dssk {
    public static final dnzr a;
    private static volatile dssr<dnzr> e;
    private int b;
    private dfxu c;
    private byte d = 2;

    static {
        dnzr dnzrVar = new dnzr();
        a = dnzrVar;
        dsqw.cc(dnzr.class, dnzrVar);
    }

    private dnzr() {
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
                return new dnzr();
            }
            if (i2 == 4) {
                return new dnzq();
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
            dssr<dnzr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnzr.class) {
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
