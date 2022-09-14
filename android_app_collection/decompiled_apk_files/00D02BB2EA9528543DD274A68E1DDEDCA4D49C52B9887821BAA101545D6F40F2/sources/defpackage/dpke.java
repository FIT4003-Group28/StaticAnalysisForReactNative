package defpackage;
/* compiled from: PG */
/* renamed from: dpke  reason: default package */
/* loaded from: classes6.dex */
public final class dpke extends dsqw<dpke, dpkb> implements dssk {
    public static final dpke f;
    private static volatile dssr<dpke> g;
    public int a;
    public String b = "";
    public String c = "";
    public float d;
    public int e;

    static {
        dpke dpkeVar = new dpke();
        f = dpkeVar;
        dsqw.cc(dpke.class, dpkeVar);
    }

    private dpke() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", dpkc.a});
            }
            if (i2 == 3) {
                return new dpke();
            }
            if (i2 == 4) {
                return new dpkb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpke> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpke.class) {
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
