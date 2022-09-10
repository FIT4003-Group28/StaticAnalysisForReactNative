package defpackage;
/* compiled from: PG */
/* renamed from: dhui  reason: default package */
/* loaded from: classes6.dex */
public final class dhui extends dsqw<dhui, dhuh> implements dssk {
    public static final dhui a;
    private static volatile dssr<dhui> b;

    static {
        dhui dhuiVar = new dhui();
        a = dhuiVar;
        dsqw.cc(dhui.class, dhuiVar);
    }

    private dhui() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhui();
            }
            if (i2 == 4) {
                return new dhuh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhui> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhui.class) {
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
