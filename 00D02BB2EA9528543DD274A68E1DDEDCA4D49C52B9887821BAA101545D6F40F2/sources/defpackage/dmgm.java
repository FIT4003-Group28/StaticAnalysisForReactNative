package defpackage;
/* compiled from: PG */
/* renamed from: dmgm  reason: default package */
/* loaded from: classes6.dex */
public final class dmgm extends dsqw<dmgm, dmgl> implements dssk {
    public static final dmgm c;
    public static final dsqv<dmfs, dmgm> d;
    private static volatile dssr<dmgm> f;
    public String a = "";
    public boolean b;
    private int e;

    static {
        dmgm dmgmVar = new dmgm();
        c = dmgmVar;
        dsqw.cc(dmgm.class, dmgmVar);
        d = dsqw.newSingularGeneratedExtension(dmfs.c, dmgmVar, dmgmVar, null, 1012, dsur.MESSAGE, dmgm.class);
    }

    private dmgm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"e", "a", "b"});
            }
            if (i2 == 3) {
                return new dmgm();
            }
            if (i2 == 4) {
                return new dmgl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmgm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmgm.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
