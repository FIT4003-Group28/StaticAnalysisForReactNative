package defpackage;
/* compiled from: PG */
/* renamed from: duui  reason: default package */
/* loaded from: classes.dex */
public final class duui extends dsqw<duui, duuh> implements dssk {
    public static final duui e;
    private static volatile dssr<duui> f;
    public int a;
    public int b;
    public String c = "";
    public dsrj<dqws> d = dssu.b;

    static {
        duui duuiVar = new duui();
        e = duuiVar;
        dsqw.cc(duui.class, duuiVar);
    }

    private duui() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"a", "b", "d", dqws.class, "c"});
            }
            if (i2 == 3) {
                return new duui();
            }
            if (i2 == 4) {
                return new duuh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duui> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duui.class) {
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
