package defpackage;
/* compiled from: PG */
/* renamed from: dmfc  reason: default package */
/* loaded from: classes6.dex */
public final class dmfc extends dsqw<dmfc, dmfb> implements dssk {
    public static final dmfc a;
    public static final dsqv<dmfs, dmfc> b;
    private static volatile dssr<dmfc> c;

    static {
        dmfc dmfcVar = new dmfc();
        a = dmfcVar;
        dsqw.cc(dmfc.class, dmfcVar);
        b = dsqw.newSingularGeneratedExtension(dmfs.c, dmfcVar, dmfcVar, null, 1024, dsur.MESSAGE, dmfc.class);
    }

    private dmfc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmfc();
            }
            if (i2 == 4) {
                return new dmfb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmfc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmfc.class) {
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
