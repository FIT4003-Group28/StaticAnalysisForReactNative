package defpackage;
/* compiled from: PG */
/* renamed from: dwui  reason: default package */
/* loaded from: classes6.dex */
public final class dwui extends dsqw<dwui, dwuh> implements dssk {
    public static final dwui c;
    private static volatile dssr<dwui> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dwui dwuiVar = new dwui();
        c = dwuiVar;
        dsqw.cc(dwui.class, dwuiVar);
    }

    private dwui() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dwui();
            }
            if (i2 == 4) {
                return new dwuh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwui> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwui.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
