package defpackage;
/* compiled from: PG */
/* renamed from: dmgk  reason: default package */
/* loaded from: classes6.dex */
public final class dmgk extends dsqw<dmgk, dmgj> implements dssk {
    public static final dmgk b;
    public static final dsqv<dmfs, dmgk> c;
    private static volatile dssr<dmgk> e;
    public dqjj a;
    private int d;

    static {
        dmgk dmgkVar = new dmgk();
        b = dmgkVar;
        dsqw.cc(dmgk.class, dmgkVar);
        c = dsqw.newSingularGeneratedExtension(dmfs.c, dmgkVar, dmgkVar, null, 1030, dsur.MESSAGE, dmgk.class);
    }

    private dmgk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            }
            if (i2 == 3) {
                return new dmgk();
            }
            if (i2 == 4) {
                return new dmgj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmgk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmgk.class) {
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
