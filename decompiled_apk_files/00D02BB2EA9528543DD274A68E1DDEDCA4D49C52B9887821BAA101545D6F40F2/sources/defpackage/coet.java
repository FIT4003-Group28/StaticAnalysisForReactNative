package defpackage;
/* compiled from: PG */
/* renamed from: coet  reason: default package */
/* loaded from: classes5.dex */
public final class coet extends dsqw<coet, coes> implements dssk {
    public static final coet n;
    private static volatile dssr<coet> o;
    public int a;
    public int b;
    public int g;
    public int i;
    public int k;
    public int l;
    public boolean m;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public long h = -1;
    public String j = "";

    static {
        coet coetVar = new coet();
        n = coetVar;
        dsqw.cc(coet.class, coetVar);
    }

    private coet() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\u000b\u0000\u0002\u0002$\u000b\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0006\u0013ဂ\u0018\u0017င\u001e\u0019ဌ\b ဈ!!ဈ\u0004\"င\"#င#$ဇ$", new Object[]{"a", "b", "c", "d", "f", "h", "i", "g", dugp.a, "j", "e", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new coet();
            }
            if (i2 == 4) {
                return new coes();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<coet> dssrVar = o;
            if (dssrVar == null) {
                synchronized (coet.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
