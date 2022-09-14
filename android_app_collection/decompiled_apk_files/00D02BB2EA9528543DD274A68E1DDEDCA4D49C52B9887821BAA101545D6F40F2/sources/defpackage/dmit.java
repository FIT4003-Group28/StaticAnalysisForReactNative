package defpackage;
/* compiled from: PG */
/* renamed from: dmit  reason: default package */
/* loaded from: classes6.dex */
public final class dmit extends dsqw<dmit, dmis> implements dssk {
    public static final dmit a;
    public static final dsqv<dmfs, dmit> b;
    private static volatile dssr<dmit> c;

    static {
        dmit dmitVar = new dmit();
        a = dmitVar;
        dsqw.cc(dmit.class, dmitVar);
        b = dsqw.newSingularGeneratedExtension(dmfs.c, dmitVar, dmitVar, null, 1028, dsur.MESSAGE, dmit.class);
    }

    private dmit() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmit();
            }
            if (i2 == 4) {
                return new dmis();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmit> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmit.class) {
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
