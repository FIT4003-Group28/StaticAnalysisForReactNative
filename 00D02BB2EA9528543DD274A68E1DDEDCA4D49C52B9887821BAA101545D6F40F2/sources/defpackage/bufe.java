package defpackage;
/* compiled from: PG */
/* renamed from: bufe  reason: default package */
/* loaded from: classes4.dex */
public final class bufe extends dsqw<bufe, bufd> implements dssk {
    public static final bufe d;
    private static volatile dssr<bufe> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        bufe bufeVar = new bufe();
        d = bufeVar;
        dsqw.cc(bufe.class, bufeVar);
    }

    private bufe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bufe();
            }
            if (i2 == 4) {
                return new bufd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bufe> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bufe.class) {
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
