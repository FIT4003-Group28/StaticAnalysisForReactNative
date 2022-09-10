package defpackage;
/* compiled from: PG */
/* renamed from: cgca  reason: default package */
/* loaded from: classes4.dex */
public final class cgca extends dsqw<cgca, cgbz> implements dssk {
    public static final cgca a;
    private static volatile dssr<cgca> b;

    static {
        cgca cgcaVar = new cgca();
        a = cgcaVar;
        dsqw.cc(cgca.class, cgcaVar);
    }

    private cgca() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new cgca();
            }
            if (i2 == 4) {
                return new cgbz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgca> dssrVar = b;
            if (dssrVar == null) {
                synchronized (cgca.class) {
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
