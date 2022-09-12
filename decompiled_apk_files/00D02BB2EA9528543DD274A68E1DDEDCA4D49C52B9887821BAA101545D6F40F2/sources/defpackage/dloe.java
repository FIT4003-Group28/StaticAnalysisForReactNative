package defpackage;
/* compiled from: PG */
/* renamed from: dloe  reason: default package */
/* loaded from: classes6.dex */
public final class dloe extends dsqw<dloe, dlod> implements dssk {
    public static final dloe a;
    private static volatile dssr<dloe> b;

    static {
        dloe dloeVar = new dloe();
        a = dloeVar;
        dsqw.cc(dloe.class, dloeVar);
    }

    private dloe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dloe();
            }
            if (i2 == 4) {
                return new dlod();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dloe> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dloe.class) {
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
