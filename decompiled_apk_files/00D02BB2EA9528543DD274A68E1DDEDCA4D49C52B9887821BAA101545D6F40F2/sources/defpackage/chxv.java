package defpackage;
/* compiled from: PG */
/* renamed from: chxv  reason: default package */
/* loaded from: classes4.dex */
public final class chxv extends dsqw<chxv, chxu> implements dssk {
    public static final chxv d;
    private static volatile dssr<chxv> e;
    public int a;
    public String b = "";
    public int c;

    static {
        chxv chxvVar = new chxv();
        d = chxvVar;
        dsqw.cc(chxv.class, chxvVar);
    }

    private chxv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new chxv();
            }
            if (i2 == 4) {
                return new chxu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chxv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (chxv.class) {
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
