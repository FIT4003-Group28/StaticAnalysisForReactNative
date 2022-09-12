package defpackage;
/* compiled from: PG */
/* renamed from: dxui  reason: default package */
/* loaded from: classes6.dex */
public final class dxui extends dsqw<dxui, dxuh> implements dssk {
    public static final dxui a;
    private static volatile dssr<dxui> b;

    static {
        dxui dxuiVar = new dxui();
        a = dxuiVar;
        dsqw.cc(dxui.class, dxuiVar);
    }

    private dxui() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxui();
            }
            if (i2 == 4) {
                return new dxuh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxui> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxui.class) {
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
