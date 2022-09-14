package defpackage;
/* compiled from: PG */
/* renamed from: dgok  reason: default package */
/* loaded from: classes6.dex */
public final class dgok extends dsqw<dgok, dgoj> implements dssk {
    public static final dgok a;
    private static volatile dssr<dgok> b;

    static {
        dgok dgokVar = new dgok();
        a = dgokVar;
        dsqw.cc(dgok.class, dgokVar);
    }

    private dgok() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgok();
            }
            if (i2 == 4) {
                return new dgoj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgok> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgok.class) {
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
