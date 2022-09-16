package defpackage;
/* compiled from: PG */
/* renamed from: dghm  reason: default package */
/* loaded from: classes6.dex */
public final class dghm extends dsqw<dghm, dghl> implements dssk {
    public static final dghm f;
    private static volatile dssr<dghm> g;
    public int a;
    public dgbo d;
    public String b = "";
    public String c = "";
    public String e = "";

    static {
        dghm dghmVar = new dghm();
        f = dghmVar;
        dsqw.cc(dghm.class, dghmVar);
    }

    private dghm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dghm();
            }
            if (i2 == 4) {
                return new dghl();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dghm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dghm.class) {
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
