package defpackage;
/* compiled from: PG */
/* renamed from: djml  reason: default package */
/* loaded from: classes6.dex */
public final class djml extends dsqw<djml, djmg> implements dssk {
    public static final djml j;
    private static volatile dssr<djml> k;
    public int a;
    public int c;
    public dspd b = dspd.b;
    public int d = 1;
    public String e = "";
    public String f = "";
    public int g = 1;
    public String h = "";
    public String i = "";

    static {
        djml djmlVar = new djml();
        j = djmlVar;
        dsqw.cc(djml.class, djmlVar);
    }

    private djml() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဋ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဌ\u0005\u0007ဈ\u0007\bဈ\b\tဈ\u0004", new Object[]{"a", "b", "c", "d", djmh.a, "e", "g", djmk.c(), "h", "i", "f"});
            }
            if (i2 == 3) {
                return new djml();
            }
            if (i2 == 4) {
                return new djmg();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djml> dssrVar = k;
            if (dssrVar == null) {
                synchronized (djml.class) {
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
