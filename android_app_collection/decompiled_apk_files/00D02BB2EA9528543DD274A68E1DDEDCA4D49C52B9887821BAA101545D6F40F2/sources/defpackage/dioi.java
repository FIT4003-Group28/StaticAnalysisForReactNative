package defpackage;
/* compiled from: PG */
/* renamed from: dioi  reason: default package */
/* loaded from: classes6.dex */
public final class dioi extends dsqw<dioi, dioh> implements dssk {
    public static final dioi c;
    private static volatile dssr<dioi> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dioi dioiVar = new dioi();
        c = dioiVar;
        dsqw.cc(dioi.class, dioiVar);
    }

    private dioi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dioi();
            }
            if (i2 == 4) {
                return new dioh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dioi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dioi.class) {
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
