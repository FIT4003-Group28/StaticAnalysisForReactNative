package defpackage;
/* compiled from: PG */
/* renamed from: dewb  reason: default package */
/* loaded from: classes6.dex */
public final class dewb extends dsqw<dewb, dewa> implements dssk {
    public static final dewb a;
    public static final dsqv<dtro, dewb> b;
    private static volatile dssr<dewb> c;

    static {
        dewb dewbVar = new dewb();
        a = dewbVar;
        dsqw.cc(dewb.class, dewbVar);
        b = dsqw.newSingularGeneratedExtension(dtro.a, dewbVar, dewbVar, null, 203522521, dsur.MESSAGE, dewb.class);
    }

    private dewb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dewb();
            }
            if (i2 == 4) {
                return new dewa();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dewb> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dewb.class) {
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
