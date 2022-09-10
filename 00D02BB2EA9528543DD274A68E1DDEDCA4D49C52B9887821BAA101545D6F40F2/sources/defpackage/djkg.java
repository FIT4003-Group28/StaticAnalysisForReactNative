package defpackage;
/* compiled from: PG */
/* renamed from: djkg  reason: default package */
/* loaded from: classes6.dex */
public final class djkg extends dsqw<djkg, djkf> implements dssk {
    public static final djkg a;
    private static volatile dssr<djkg> b;

    static {
        djkg djkgVar = new djkg();
        a = djkgVar;
        dsqw.cc(djkg.class, djkgVar);
    }

    private djkg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djkg();
            }
            if (i2 == 4) {
                return new djkf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djkg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djkg.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
