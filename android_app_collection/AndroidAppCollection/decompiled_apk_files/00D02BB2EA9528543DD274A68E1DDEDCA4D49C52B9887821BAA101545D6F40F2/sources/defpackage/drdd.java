package defpackage;
/* compiled from: PG */
/* renamed from: drdd  reason: default package */
/* loaded from: classes6.dex */
public final class drdd extends dsqw<drdd, drdc> implements dssk {
    public static final drdd d;
    private static volatile dssr<drdd> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        drdd drddVar = new drdd();
        d = drddVar;
        dsqw.cc(drdd.class, drddVar);
    }

    private drdd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drdd();
            }
            if (i2 == 4) {
                return new drdc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drdd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drdd.class) {
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
