package defpackage;
/* compiled from: PG */
/* renamed from: cgui  reason: default package */
/* loaded from: classes4.dex */
public final class cgui extends dsqw<cgui, cguh> implements dssk {
    public static final cgui c;
    private static volatile dssr<cgui> d;
    public int a;
    public long b;

    static {
        cgui cguiVar = new cgui();
        c = cguiVar;
        dsqw.cc(cgui.class, cguiVar);
    }

    private cgui() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cgui();
            }
            if (i2 == 4) {
                return new cguh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgui> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cgui.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
