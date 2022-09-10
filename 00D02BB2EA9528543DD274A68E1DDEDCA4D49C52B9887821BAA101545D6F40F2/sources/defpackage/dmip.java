package defpackage;
/* compiled from: PG */
/* renamed from: dmip  reason: default package */
/* loaded from: classes6.dex */
public final class dmip extends dsqw<dmip, dmio> implements dssk {
    public static final dmip a;
    public static final dsqv<dmfs, dmip> b;
    private static volatile dssr<dmip> c;

    static {
        dmip dmipVar = new dmip();
        a = dmipVar;
        dsqw.cc(dmip.class, dmipVar);
        b = dsqw.newSingularGeneratedExtension(dmfs.c, dmipVar, dmipVar, null, 1025, dsur.MESSAGE, dmip.class);
    }

    private dmip() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmip();
            }
            if (i2 == 4) {
                return new dmio();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmip> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmip.class) {
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
