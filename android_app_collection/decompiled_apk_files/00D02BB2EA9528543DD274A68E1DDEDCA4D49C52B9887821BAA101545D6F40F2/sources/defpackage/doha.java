package defpackage;
/* compiled from: PG */
/* renamed from: doha  reason: default package */
/* loaded from: classes6.dex */
public final class doha extends dsqw<doha, dogz> implements dssk {
    public static final doha a;
    private static volatile dssr<doha> b;

    static {
        doha dohaVar = new doha();
        a = dohaVar;
        dsqw.cc(doha.class, dohaVar);
    }

    private doha() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new doha();
            }
            if (i2 == 4) {
                return new dogz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doha> dssrVar = b;
            if (dssrVar == null) {
                synchronized (doha.class) {
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
