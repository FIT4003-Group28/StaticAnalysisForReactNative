package defpackage;
/* compiled from: PG */
/* renamed from: dtef  reason: default package */
/* loaded from: classes6.dex */
public final class dtef extends dsqw<dtef, dtee> implements dssk {
    public static final dtef a;
    private static volatile dssr<dtef> b;

    static {
        dtef dtefVar = new dtef();
        a = dtefVar;
        dsqw.cc(dtef.class, dtefVar);
    }

    private dtef() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtef();
            }
            if (i2 == 4) {
                return new dtee();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtef> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtef.class) {
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
