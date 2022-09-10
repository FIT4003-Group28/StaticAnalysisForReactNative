package defpackage;
/* compiled from: PG */
/* renamed from: ddjl  reason: default package */
/* loaded from: classes.dex */
public final class ddjl extends dsqw<ddjl, ddjk> implements dssk {
    public static final ddjl c;
    private static volatile dssr<ddjl> d;
    public int a;
    public String b = "";

    static {
        ddjl ddjlVar = new ddjl();
        c = ddjlVar;
        dsqw.cc(ddjl.class, ddjlVar);
    }

    private ddjl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddjl();
            }
            if (i2 == 4) {
                return new ddjk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddjl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddjl.class) {
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
