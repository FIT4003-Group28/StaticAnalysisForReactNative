package defpackage;
/* compiled from: PG */
/* renamed from: dtui  reason: default package */
/* loaded from: classes6.dex */
public final class dtui extends dsqw<dtui, dtuh> implements dssk {
    public static final dtui a;
    private static volatile dssr<dtui> b;

    static {
        dtui dtuiVar = new dtui();
        a = dtuiVar;
        dsqw.cc(dtui.class, dtuiVar);
    }

    private dtui() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dtui();
            }
            if (i2 == 4) {
                return new dtuh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtui> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtui.class) {
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
