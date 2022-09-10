package defpackage;
/* compiled from: PG */
/* renamed from: dmct  reason: default package */
/* loaded from: classes6.dex */
public final class dmct extends dsqw<dmct, dmcs> implements dssk {
    public static final dmct a;
    public static final dsqv<dmch, dmct> b;
    private static volatile dssr<dmct> c;

    static {
        dmct dmctVar = new dmct();
        a = dmctVar;
        dsqw.cc(dmct.class, dmctVar);
        b = dsqw.newSingularGeneratedExtension(dmch.d, dmctVar, dmctVar, null, 1015, dsur.MESSAGE, dmct.class);
    }

    private dmct() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmct();
            }
            if (i2 == 4) {
                return new dmcs();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmct> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmct.class) {
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
