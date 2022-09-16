package defpackage;
/* compiled from: PG */
/* renamed from: dhhg  reason: default package */
/* loaded from: classes6.dex */
public final class dhhg extends dsqw<dhhg, dhhe> implements dssk {
    public static final dhhg d;
    private static volatile dssr<dhhg> f;
    public int a;
    private dssd<String, String> e = dssd.b;
    public String b = "";
    public String c = "";

    static {
        dhhg dhhgVar = new dhhg();
        d = dhhgVar;
        dsqw.cc(dhhg.class, dhhgVar);
    }

    private dhhg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0004ဈ\u0003\n2", new Object[]{"a", "b", "c", "e", dhhf.a});
            }
            if (i2 == 3) {
                return new dhhg();
            }
            if (i2 == 4) {
                return new dhhe();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhhg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhhg.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
