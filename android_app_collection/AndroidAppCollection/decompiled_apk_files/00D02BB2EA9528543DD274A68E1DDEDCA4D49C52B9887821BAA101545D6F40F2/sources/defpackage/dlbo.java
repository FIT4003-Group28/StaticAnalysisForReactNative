package defpackage;
/* compiled from: PG */
/* renamed from: dlbo  reason: default package */
/* loaded from: classes6.dex */
public final class dlbo extends dsqw<dlbo, dlbn> implements dssk {
    public static final dlbo a;
    private static volatile dssr<dlbo> b;

    static {
        dlbo dlboVar = new dlbo();
        a = dlboVar;
        dsqw.cc(dlbo.class, dlboVar);
    }

    private dlbo() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlbo();
            }
            if (i2 == 4) {
                return new dlbn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlbo> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlbo.class) {
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
