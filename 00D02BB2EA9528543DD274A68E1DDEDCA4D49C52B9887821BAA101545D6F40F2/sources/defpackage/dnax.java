package defpackage;
/* compiled from: PG */
/* renamed from: dnax  reason: default package */
/* loaded from: classes.dex */
public final class dnax extends dsqw<dnax, dnaw> implements dssk {
    public static final dnax a;
    private static volatile dssr<dnax> b;

    static {
        dnax dnaxVar = new dnax();
        a = dnaxVar;
        dsqw.cc(dnax.class, dnaxVar);
    }

    private dnax() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnax();
            }
            if (i2 == 4) {
                return new dnaw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnax> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnax.class) {
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
