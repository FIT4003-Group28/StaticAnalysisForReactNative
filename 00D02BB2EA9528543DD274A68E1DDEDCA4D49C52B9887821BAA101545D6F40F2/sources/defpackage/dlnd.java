package defpackage;
/* compiled from: PG */
/* renamed from: dlnd  reason: default package */
/* loaded from: classes6.dex */
public final class dlnd extends dsqw<dlnd, dlnc> implements dssk {
    public static final dlnd c;
    private static volatile dssr<dlnd> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dlnd dlndVar = new dlnd();
        c = dlndVar;
        dsqw.cc(dlnd.class, dlndVar);
    }

    private dlnd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dlnd();
            }
            if (i2 == 4) {
                return new dlnc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlnd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlnd.class) {
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
