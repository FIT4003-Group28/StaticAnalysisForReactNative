package defpackage;
/* compiled from: PG */
/* renamed from: drui  reason: default package */
/* loaded from: classes6.dex */
public final class drui extends dsqw<drui, druh> implements dssk {
    public static final drui a;
    private static volatile dssr<drui> b;

    static {
        drui druiVar = new drui();
        a = druiVar;
        dsqw.cc(drui.class, druiVar);
    }

    private drui() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drui();
            }
            if (i2 == 4) {
                return new druh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drui> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drui.class) {
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
