package defpackage;
/* compiled from: PG */
/* renamed from: dmcx  reason: default package */
/* loaded from: classes6.dex */
public final class dmcx extends dsqw<dmcx, dmcw> implements dssk {
    public static final dmcx a;
    public static final dsqv<dmch, dmcx> b;
    private static volatile dssr<dmcx> c;

    static {
        dmcx dmcxVar = new dmcx();
        a = dmcxVar;
        dsqw.cc(dmcx.class, dmcxVar);
        b = dsqw.newSingularGeneratedExtension(dmch.d, dmcxVar, dmcxVar, null, 1002, dsur.MESSAGE, dmcx.class);
    }

    private dmcx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmcx();
            }
            if (i2 == 4) {
                return new dmcw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmcx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmcx.class) {
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
