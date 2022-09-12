package defpackage;
/* compiled from: PG */
/* renamed from: dmam  reason: default package */
/* loaded from: classes6.dex */
public final class dmam extends dsqw<dmam, dmah> implements dssk {
    public static final dmam f;
    private static volatile dssr<dmam> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        dmam dmamVar = new dmam();
        f = dmamVar;
        dsqw.cc(dmam.class, dmamVar);
    }

    private dmam() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", dmak.a, "c", dmai.a, "d", dmal.a, "e"});
            }
            if (i2 == 3) {
                return new dmam();
            }
            if (i2 == 4) {
                return new dmah();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmam> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmam.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
