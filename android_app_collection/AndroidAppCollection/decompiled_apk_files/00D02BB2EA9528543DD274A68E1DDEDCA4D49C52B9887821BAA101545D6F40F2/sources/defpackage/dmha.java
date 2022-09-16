package defpackage;
/* compiled from: PG */
/* renamed from: dmha  reason: default package */
/* loaded from: classes6.dex */
public final class dmha extends dsqw<dmha, dmgz> implements dssk {
    public static final dmha c;
    public static final dsqv<dmfs, dmha> d;
    private static volatile dssr<dmha> f;
    public dhjx a;
    public dmgo b;
    private int e;

    static {
        dmha dmhaVar = new dmha();
        c = dmhaVar;
        dsqw.cc(dmha.class, dmhaVar);
        d = dsqw.newSingularGeneratedExtension(dmfs.c, dmhaVar, dmhaVar, null, 1008, dsur.MESSAGE, dmha.class);
    }

    private dmha() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001", new Object[]{"e", "a", "b"});
            }
            if (i2 == 3) {
                return new dmha();
            }
            if (i2 == 4) {
                return new dmgz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmha> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmha.class) {
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
