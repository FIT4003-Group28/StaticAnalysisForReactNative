package defpackage;
/* compiled from: PG */
/* renamed from: czgu  reason: default package */
/* loaded from: classes5.dex */
public final class czgu extends dsqw<czgu, czgt> implements dssk {
    public static final czgu l;
    private static volatile dssr<czgu> m;
    public int a;
    public boolean e;
    public int g;
    public String b = "";
    public String c = "";
    public String d = "";
    public String f = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";

    static {
        czgu czguVar = new czgu();
        l = czguVar;
        dsqw.cc(czgu.class, czguVar);
    }

    private czgu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဌ\u0005\bဈ\u0006\tဈ\u0007\fဈ\n\rဈ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", czgz.c(), "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new czgu();
            }
            if (i2 == 4) {
                return new czgt();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<czgu> dssrVar = m;
            if (dssrVar == null) {
                synchronized (czgu.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
