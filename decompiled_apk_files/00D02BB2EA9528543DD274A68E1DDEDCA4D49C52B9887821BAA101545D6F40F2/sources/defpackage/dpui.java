package defpackage;
/* compiled from: PG */
/* renamed from: dpui  reason: default package */
/* loaded from: classes6.dex */
public final class dpui extends dsqw<dpui, dpuh> implements dssk {
    public static final dpui d;
    private static volatile dssr<dpui> f;
    public String a = "";
    public String b = "";
    public boolean c;
    private int e;

    static {
        dpui dpuiVar = new dpui();
        d = dpuiVar;
        dsqw.cc(dpui.class, dpuiVar);
    }

    private dpui() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpui();
            }
            if (i2 == 4) {
                return new dpuh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpui> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpui.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}