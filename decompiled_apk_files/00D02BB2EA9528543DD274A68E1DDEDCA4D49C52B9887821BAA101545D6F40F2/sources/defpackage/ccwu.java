package defpackage;
/* compiled from: PG */
/* renamed from: ccwu  reason: default package */
/* loaded from: classes4.dex */
public final class ccwu extends dsqw<ccwu, ccwt> implements dssk {
    public static final ccwu d;
    private static volatile dssr<ccwu> e;
    public int a;
    public String b = "";
    public djtz c;

    static {
        ccwu ccwuVar = new ccwu();
        d = ccwuVar;
        dsqw.cc(ccwu.class, ccwuVar);
    }

    private ccwu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ccwu();
            }
            if (i2 == 4) {
                return new ccwt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ccwu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ccwu.class) {
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
