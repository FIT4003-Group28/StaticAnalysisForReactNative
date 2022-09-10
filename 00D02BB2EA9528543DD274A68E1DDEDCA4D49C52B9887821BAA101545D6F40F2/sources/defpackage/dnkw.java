package defpackage;
/* compiled from: PG */
/* renamed from: dnkw  reason: default package */
/* loaded from: classes6.dex */
public final class dnkw extends dsqw<dnkw, dnkv> implements dssk {
    public static final dnkw a;
    private static volatile dssr<dnkw> b;

    static {
        dnkw dnkwVar = new dnkw();
        a = dnkwVar;
        dsqw.cc(dnkw.class, dnkwVar);
    }

    private dnkw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnkw();
            }
            if (i2 == 4) {
                return new dnkv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnkw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnkw.class) {
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
