package defpackage;
/* compiled from: PG */
/* renamed from: dhfg  reason: default package */
/* loaded from: classes6.dex */
public final class dhfg extends dsqw<dhfg, dhff> implements dssk {
    public static final dhfg c;
    private static volatile dssr<dhfg> d;
    public dhdc a;
    public dhez b;

    static {
        dhfg dhfgVar = new dhfg();
        c = dhfgVar;
        dsqw.cc(dhfg.class, dhfgVar);
    }

    private dhfg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0004\u0005\u0002\u0000\u0000\u0000\u0004\t\u0005\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhfg();
            }
            if (i2 == 4) {
                return new dhff();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhfg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhfg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
