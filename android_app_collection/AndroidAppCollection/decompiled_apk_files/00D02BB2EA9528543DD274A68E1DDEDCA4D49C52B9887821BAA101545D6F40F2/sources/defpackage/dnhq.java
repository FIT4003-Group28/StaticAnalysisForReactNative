package defpackage;
/* compiled from: PG */
/* renamed from: dnhq  reason: default package */
/* loaded from: classes6.dex */
public final class dnhq extends dsqw<dnhq, dnhn> implements dssk {
    public static final dnhq a;
    private static volatile dssr<dnhq> e;
    private int b;
    private dnhp c;
    private byte d = 2;

    static {
        dnhq dnhqVar = new dnhq();
        a = dnhqVar;
        dsqw.cc(dnhq.class, dnhqVar);
    }

    private dnhq() {
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
                return new dnhq();
            }
            if (i2 == 4) {
                return new dnhn();
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
            dssr<dnhq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnhq.class) {
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
