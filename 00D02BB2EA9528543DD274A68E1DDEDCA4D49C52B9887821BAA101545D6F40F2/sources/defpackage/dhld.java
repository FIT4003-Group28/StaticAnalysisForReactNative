package defpackage;
/* compiled from: PG */
/* renamed from: dhld  reason: default package */
/* loaded from: classes6.dex */
public final class dhld extends dsqw<dhld, dhlc> implements dssk {
    public static final dhld b;
    private static volatile dssr<dhld> d;
    public dsrj<dqfq> a;
    private byte c = 2;

    static {
        dhld dhldVar = new dhld();
        b = dhldVar;
        dsqw.cc(dhld.class, dhldVar);
    }

    private dhld() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u000b\u000b\u0001\u0000\u0001\u0000\u000b\u001b", new Object[]{"a", dqfq.class});
            }
            if (i2 == 3) {
                return new dhld();
            }
            if (i2 == 4) {
                return new dhlc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dhld> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhld.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
