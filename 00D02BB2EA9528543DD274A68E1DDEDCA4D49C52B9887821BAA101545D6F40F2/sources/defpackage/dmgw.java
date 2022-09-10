package defpackage;
/* compiled from: PG */
/* renamed from: dmgw  reason: default package */
/* loaded from: classes6.dex */
public final class dmgw extends dsqw<dmgw, dmgv> implements dssk {
    public static final dmgw b;
    public static final dsqv<dmfs, dmgw> c;
    private static volatile dssr<dmgw> e;
    public drdg a;
    private int d;

    static {
        dmgw dmgwVar = new dmgw();
        b = dmgwVar;
        dsqw.cc(dmgw.class, dmgwVar);
        c = dsqw.newSingularGeneratedExtension(dmfs.c, dmgwVar, dmgwVar, null, 1004, dsur.MESSAGE, dmgw.class);
    }

    private dmgw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            }
            if (i2 == 3) {
                return new dmgw();
            }
            if (i2 == 4) {
                return new dmgv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmgw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmgw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
