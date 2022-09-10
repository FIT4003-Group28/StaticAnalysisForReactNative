package defpackage;
/* compiled from: PG */
/* renamed from: doui  reason: default package */
/* loaded from: classes6.dex */
public final class doui extends dsqw<doui, douh> implements dssk {
    public static final doui e;
    private static volatile dssr<doui> f;
    public int a;
    public String b = "";
    public int c;
    public int d;

    static {
        doui douiVar = new doui();
        e = douiVar;
        dsqw.cc(doui.class, douiVar);
    }

    private doui() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0005ဌ\u0004", new Object[]{"a", "b", "c", dquc.c(), "d", dque.c()});
            }
            if (i2 == 3) {
                return new doui();
            }
            if (i2 == 4) {
                return new douh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doui> dssrVar = f;
            if (dssrVar == null) {
                synchronized (doui.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
