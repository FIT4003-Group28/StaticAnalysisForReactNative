package defpackage;
/* compiled from: PG */
/* renamed from: dmir  reason: default package */
/* loaded from: classes6.dex */
public final class dmir extends dsqw<dmir, dmiq> implements dssk {
    public static final dmir a;
    public static final dsqv<dmfs, dmir> b;
    private static volatile dssr<dmir> c;

    static {
        dmir dmirVar = new dmir();
        a = dmirVar;
        dsqw.cc(dmir.class, dmirVar);
        b = dsqw.newSingularGeneratedExtension(dmfs.c, dmirVar, dmirVar, null, 1018, dsur.MESSAGE, dmir.class);
    }

    private dmir() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmir();
            }
            if (i2 == 4) {
                return new dmiq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmir> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmir.class) {
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
