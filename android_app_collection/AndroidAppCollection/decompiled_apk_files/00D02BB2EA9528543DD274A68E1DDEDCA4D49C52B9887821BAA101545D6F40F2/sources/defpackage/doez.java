package defpackage;
/* compiled from: PG */
/* renamed from: doez  reason: default package */
/* loaded from: classes6.dex */
public final class doez extends dsqw<doez, doey> implements dssk {
    public static final doez a;
    private static volatile dssr<doez> b;

    static {
        doez doezVar = new doez();
        a = doezVar;
        dsqw.cc(doez.class, doezVar);
    }

    private doez() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new doez();
            }
            if (i2 == 4) {
                return new doey();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doez> dssrVar = b;
            if (dssrVar == null) {
                synchronized (doez.class) {
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
