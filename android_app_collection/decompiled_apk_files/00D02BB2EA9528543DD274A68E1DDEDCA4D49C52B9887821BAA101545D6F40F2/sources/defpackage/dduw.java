package defpackage;
/* compiled from: PG */
/* renamed from: dduw  reason: default package */
/* loaded from: classes6.dex */
public final class dduw extends dsqw<dduw, dduv> implements dssk {
    public static final dduw a;
    private static volatile dssr<dduw> b;

    static {
        dduw dduwVar = new dduw();
        a = dduwVar;
        dsqw.cc(dduw.class, dduwVar);
    }

    private dduw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dduw();
            }
            if (i2 == 4) {
                return new dduv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dduw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dduw.class) {
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
