package defpackage;
/* compiled from: PG */
/* renamed from: dlez  reason: default package */
/* loaded from: classes6.dex */
public final class dlez extends dsqw<dlez, dley> implements dssk {
    public static final dlez d;
    private static volatile dssr<dlez> f;
    public long b;
    private int e;
    public dspd a = dspd.b;
    public String c = "";

    static {
        dlez dlezVar = new dlez();
        d = dlezVar;
        dsqw.cc(dlez.class, dlezVar);
    }

    private dlez() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlez();
            }
            if (i2 == 4) {
                return new dley();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlez> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlez.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
