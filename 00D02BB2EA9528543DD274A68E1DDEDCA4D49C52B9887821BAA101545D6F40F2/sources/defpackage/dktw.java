package defpackage;
/* compiled from: PG */
/* renamed from: dktw  reason: default package */
/* loaded from: classes.dex */
public final class dktw extends dsqw<dktw, dktv> implements dssk {
    public static final dktw d;
    private static volatile dssr<dktw> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dktw dktwVar = new dktw();
        d = dktwVar;
        dsqw.cc(dktw.class, dktwVar);
    }

    private dktw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dktw();
            }
            if (i2 == 4) {
                return new dktv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dktw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dktw.class) {
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
