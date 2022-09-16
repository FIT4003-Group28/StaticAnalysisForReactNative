package defpackage;
/* compiled from: PG */
/* renamed from: duxt  reason: default package */
/* loaded from: classes.dex */
public final class duxt extends dsqw<duxt, duxs> implements dssk {
    public static final duxt c;
    private static volatile dssr<duxt> e;
    public boolean a;
    public int b = 5;
    private int d;

    static {
        duxt duxtVar = new duxt();
        c = duxtVar;
        dsqw.cc(duxt.class, duxtVar);
    }

    private duxt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new duxt();
            }
            if (i2 == 4) {
                return new duxs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duxt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duxt.class) {
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
