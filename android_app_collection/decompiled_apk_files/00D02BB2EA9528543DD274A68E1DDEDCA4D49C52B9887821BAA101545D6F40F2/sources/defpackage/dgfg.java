package defpackage;
/* compiled from: PG */
/* renamed from: dgfg  reason: default package */
/* loaded from: classes6.dex */
public final class dgfg extends dsqw<dgfg, dgff> implements dssk {
    public static final dgfg d;
    private static volatile dssr<dgfg> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dgfg dgfgVar = new dgfg();
        d = dgfgVar;
        dsqw.cc(dgfg.class, dgfgVar);
    }

    private dgfg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dgfc.a, "c"});
            }
            if (i2 == 3) {
                return new dgfg();
            }
            if (i2 == 4) {
                return new dgff();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgfg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgfg.class) {
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
