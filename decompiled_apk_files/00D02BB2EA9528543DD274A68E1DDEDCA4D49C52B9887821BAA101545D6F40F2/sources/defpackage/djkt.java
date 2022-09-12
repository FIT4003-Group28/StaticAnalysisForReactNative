package defpackage;
/* compiled from: PG */
/* renamed from: djkt  reason: default package */
/* loaded from: classes6.dex */
public final class djkt extends dsqw<djkt, djks> implements dssk {
    public static final djkt e;
    private static volatile dssr<djkt> f;
    public int a;
    public String b = "";
    public dspd c = dspd.b;
    public String d = "";

    static {
        djkt djktVar = new djkt();
        e = djktVar;
        dsqw.cc(djkt.class, djktVar);
    }

    private djkt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003ည\u0001\u0004ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djkt();
            }
            if (i2 == 4) {
                return new djks();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djkt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djkt.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
