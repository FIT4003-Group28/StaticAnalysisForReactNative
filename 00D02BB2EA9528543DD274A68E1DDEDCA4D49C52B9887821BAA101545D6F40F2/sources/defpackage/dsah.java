package defpackage;
/* compiled from: PG */
/* renamed from: dsah  reason: default package */
/* loaded from: classes6.dex */
public final class dsah extends dsqw<dsah, dsag> implements dssk {
    public static final dsah d;
    private static volatile dssr<dsah> e;
    public int a;
    public long b;
    public String c = "";

    static {
        dsah dsahVar = new dsah();
        d = dsahVar;
        dsqw.cc(dsah.class, dsahVar);
    }

    private dsah() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dsah();
            }
            if (i2 == 4) {
                return new dsag();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsah> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsah.class) {
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
