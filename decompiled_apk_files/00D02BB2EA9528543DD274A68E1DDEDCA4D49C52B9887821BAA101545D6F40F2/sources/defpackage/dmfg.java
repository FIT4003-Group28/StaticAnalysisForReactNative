package defpackage;
/* compiled from: PG */
/* renamed from: dmfg  reason: default package */
/* loaded from: classes6.dex */
public final class dmfg extends dsqw<dmfg, dmff> implements dssk {
    public static final dmfg a;
    public static final dsqv<dmfs, dmfg> b;
    private static volatile dssr<dmfg> c;

    static {
        dmfg dmfgVar = new dmfg();
        a = dmfgVar;
        dsqw.cc(dmfg.class, dmfgVar);
        b = dsqw.newSingularGeneratedExtension(dmfs.c, dmfgVar, dmfgVar, null, 1005, dsur.MESSAGE, dmfg.class);
    }

    private dmfg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmfg();
            }
            if (i2 == 4) {
                return new dmff();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmfg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmfg.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
