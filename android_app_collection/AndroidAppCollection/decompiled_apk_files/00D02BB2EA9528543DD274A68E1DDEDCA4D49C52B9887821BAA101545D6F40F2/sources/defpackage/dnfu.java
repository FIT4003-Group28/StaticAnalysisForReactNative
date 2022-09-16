package defpackage;
/* compiled from: PG */
/* renamed from: dnfu  reason: default package */
/* loaded from: classes6.dex */
public final class dnfu extends dsqw<dnfu, dnfp> implements dssk {
    public static final dnfu j;
    private static volatile dssr<dnfu> k;
    public int a;
    public dnfr b;
    public dnfr c;
    public int d;
    public String e = "";
    public String f = "";
    public String g = "";
    public dnpq h;
    public dnwd i;

    static {
        dnfu dnfuVar = new dnfu();
        j = dnfuVar;
        dsqw.cc(dnfu.class, dnfuVar);
    }

    private dnfu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0005ဈ\u0004\u0007ဈ\u0007\bဈ\b\nဉ\n\u000bဉ\u000b", new Object[]{"a", "b", "c", "d", dnfs.a, "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dnfu();
            }
            if (i2 == 4) {
                return new dnfp();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnfu> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dnfu.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
