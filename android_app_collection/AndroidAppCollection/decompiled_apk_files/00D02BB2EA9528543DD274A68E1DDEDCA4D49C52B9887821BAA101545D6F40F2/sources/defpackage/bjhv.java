package defpackage;
/* compiled from: PG */
/* renamed from: bjhv  reason: default package */
/* loaded from: classes3.dex */
public final class bjhv extends dsqw<bjhv, bjhu> implements dssk {
    public static final bjhv c;
    private static volatile dssr<bjhv> d;
    public int a;
    public String b = "";

    static {
        bjhv bjhvVar = new bjhv();
        c = bjhvVar;
        dsqw.cc(bjhv.class, bjhvVar);
    }

    private bjhv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new bjhv();
            }
            if (i2 == 4) {
                return new bjhu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bjhv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (bjhv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
