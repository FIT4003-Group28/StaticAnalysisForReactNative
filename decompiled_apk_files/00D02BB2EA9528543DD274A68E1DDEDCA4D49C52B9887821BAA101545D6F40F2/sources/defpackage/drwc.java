package defpackage;
/* compiled from: PG */
/* renamed from: drwc  reason: default package */
/* loaded from: classes6.dex */
public final class drwc extends dsqw<drwc, drvm> implements dssk {
    public static final drwc f;
    private static volatile dssr<drwc> g;
    public int a;
    public Object c;
    public drwb e;
    public int b = 0;
    public String d = "";

    static {
        drwc drwcVar = new drwc();
        f = drwcVar;
        dsqw.cc(drwc.class, drwcVar);
    }

    private drwc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002့\u0000\u0003ဉ\u0003\u0004ျ\u0000", new Object[]{"c", "b", "a", "d", "e"});
            }
            if (i2 == 3) {
                return new drwc();
            }
            if (i2 == 4) {
                return new drvm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drwc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (drwc.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
