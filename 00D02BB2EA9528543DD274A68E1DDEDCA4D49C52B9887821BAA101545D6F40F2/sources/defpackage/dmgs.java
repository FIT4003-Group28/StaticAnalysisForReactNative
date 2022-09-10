package defpackage;
/* compiled from: PG */
/* renamed from: dmgs  reason: default package */
/* loaded from: classes6.dex */
public final class dmgs extends dsqw<dmgs, dmgr> implements dssk {
    public static final dmgs c;
    public static final dsqv<dmfs, dmgs> d;
    private static volatile dssr<dmgs> f;
    public String a = "";
    public boolean b;
    private int e;

    static {
        dmgs dmgsVar = new dmgs();
        c = dmgsVar;
        dsqw.cc(dmgs.class, dmgsVar);
        d = dsqw.newSingularGeneratedExtension(dmfs.c, dmgsVar, dmgsVar, null, 1032, dsur.MESSAGE, dmgs.class);
    }

    private dmgs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"e", "a", "b"});
            }
            if (i2 == 3) {
                return new dmgs();
            }
            if (i2 == 4) {
                return new dmgr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmgs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmgs.class) {
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
