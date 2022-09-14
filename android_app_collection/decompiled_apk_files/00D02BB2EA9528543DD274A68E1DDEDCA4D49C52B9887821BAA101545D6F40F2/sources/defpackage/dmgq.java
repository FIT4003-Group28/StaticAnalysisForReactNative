package defpackage;
/* compiled from: PG */
/* renamed from: dmgq  reason: default package */
/* loaded from: classes6.dex */
public final class dmgq extends dsqw<dmgq, dmgp> implements dssk {
    public static final dmgq a;
    public static final dsqv<dmfs, dmgq> b;
    private static volatile dssr<dmgq> c;

    static {
        dmgq dmgqVar = new dmgq();
        a = dmgqVar;
        dsqw.cc(dmgq.class, dmgqVar);
        b = dsqw.newSingularGeneratedExtension(dmfs.c, dmgqVar, dmgqVar, null, 1007, dsur.MESSAGE, dmgq.class);
    }

    private dmgq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmgq();
            }
            if (i2 == 4) {
                return new dmgp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmgq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmgq.class) {
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
