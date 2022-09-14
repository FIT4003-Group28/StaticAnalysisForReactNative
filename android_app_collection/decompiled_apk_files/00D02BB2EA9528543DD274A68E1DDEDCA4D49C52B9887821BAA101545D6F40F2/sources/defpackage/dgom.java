package defpackage;
/* compiled from: PG */
/* renamed from: dgom  reason: default package */
/* loaded from: classes6.dex */
public final class dgom extends dsqw<dgom, dgol> implements dssk {
    public static final dgom a;
    private static volatile dssr<dgom> b;

    static {
        dgom dgomVar = new dgom();
        a = dgomVar;
        dsqw.cc(dgom.class, dgomVar);
    }

    private dgom() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgom();
            }
            if (i2 == 4) {
                return new dgol();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgom> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgom.class) {
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
