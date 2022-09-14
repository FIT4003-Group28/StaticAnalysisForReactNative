package defpackage;
/* compiled from: PG */
/* renamed from: dnbn  reason: default package */
/* loaded from: classes.dex */
public final class dnbn extends dsqw<dnbn, dnbm> implements dssk {
    public static final dnbn a;
    private static volatile dssr<dnbn> b;

    static {
        dnbn dnbnVar = new dnbn();
        a = dnbnVar;
        dsqw.cc(dnbn.class, dnbnVar);
    }

    private dnbn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnbn();
            }
            if (i2 == 4) {
                return new dnbm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnbn> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnbn.class) {
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
