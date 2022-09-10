package defpackage;
/* compiled from: PG */
/* renamed from: ckwt  reason: default package */
/* loaded from: classes5.dex */
public final class ckwt extends dsqw<ckwt, ckws> implements dssk {
    public static final ckwt o;
    private static volatile dssr<ckwt> p;
    public int a;
    public ckwz b;
    public boolean c;
    public boolean d;
    public int e;
    public int l;
    public int m;
    public int f = -1;
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public dspd k = dspd.b;
    public String n = "";

    static {
        ckwt ckwtVar = new ckwt();
        o = ckwtVar;
        dsqw.cc(ckwt.class, ckwtVar);
    }

    private ckwt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\fည\t\rဌ\n\u000eဌ\u000b\u000fဈ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", ckxc.a, "m", ckxa.a, "n"});
            }
            if (i2 == 3) {
                return new ckwt();
            }
            if (i2 == 4) {
                return new ckws();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckwt> dssrVar = p;
            if (dssrVar == null) {
                synchronized (ckwt.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
