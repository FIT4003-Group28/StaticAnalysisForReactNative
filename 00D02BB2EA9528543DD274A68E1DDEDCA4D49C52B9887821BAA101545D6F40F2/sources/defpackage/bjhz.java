package defpackage;
/* compiled from: PG */
/* renamed from: bjhz  reason: default package */
/* loaded from: classes3.dex */
public final class bjhz extends dsqw<bjhz, bjhw> implements dssk {
    public static final bjhz e;
    private static volatile dssr<bjhz> f;
    public int a;
    public String b = "";
    public String c = "";
    public int d = 1;

    static {
        bjhz bjhzVar = new bjhz();
        e = bjhzVar;
        dsqw.cc(bjhz.class, bjhzVar);
    }

    private bjhz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", bjhx.a});
            }
            if (i2 == 3) {
                return new bjhz();
            }
            if (i2 == 4) {
                return new bjhw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bjhz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bjhz.class) {
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
