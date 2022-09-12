package defpackage;
/* compiled from: PG */
/* renamed from: dhwq  reason: default package */
/* loaded from: classes6.dex */
public final class dhwq extends dsqw<dhwq, dhwn> implements dssk {
    public static final dhwq d;
    private static volatile dssr<dhwq> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dhwq dhwqVar = new dhwq();
        d = dhwqVar;
        dsqw.cc(dhwq.class, dhwqVar);
    }

    private dhwq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဌ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", dhwo.a, "c"});
            }
            if (i2 == 3) {
                return new dhwq();
            }
            if (i2 == 4) {
                return new dhwn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhwq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhwq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
