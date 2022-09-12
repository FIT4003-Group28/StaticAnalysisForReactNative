package defpackage;
/* compiled from: PG */
/* renamed from: dtqq  reason: default package */
/* loaded from: classes6.dex */
public final class dtqq extends dsqs<dtqq, dtqp> implements dsqt {
    public static final dtqq d;
    private static volatile dssr<dtqq> g;
    public doqf a;
    public dthb b;
    private int e;
    private byte f = 2;
    public String c = "";

    static {
        dtqq dtqqVar = new dtqq();
        d = dtqqVar;
        dsqw.cc(dtqq.class, dtqqVar);
    }

    private dtqq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtqq();
            }
            if (i2 == 4) {
                return new dtqp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dtqq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtqq.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
