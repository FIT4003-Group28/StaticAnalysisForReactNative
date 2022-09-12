package defpackage;
/* compiled from: PG */
/* renamed from: csfg  reason: default package */
/* loaded from: classes5.dex */
public final class csfg extends dsqw<csfg, csff> implements dssk {
    public static final csfg a;
    private static volatile dssr<csfg> b;

    static {
        csfg csfgVar = new csfg();
        a = csfgVar;
        dsqw.cc(csfg.class, csfgVar);
    }

    private csfg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new csfg();
            }
            if (i2 == 4) {
                return new csff();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csfg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (csfg.class) {
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
