package defpackage;
/* compiled from: PG */
/* renamed from: drwp  reason: default package */
/* loaded from: classes6.dex */
public final class drwp extends dsqw<drwp, drwo> implements dssk {
    public static final drwp f;
    private static volatile dssr<drwp> g;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";
    public dsrj<String> e = dssu.b;

    static {
        drwp drwpVar = new drwp();
        f = drwpVar;
        dsqw.cc(drwp.class, drwpVar);
    }

    private drwp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ြ\u0000\u0002ဿ\u0000\u0003\u001a\u0004ဈ\u0002", new Object[]{"c", "b", "a", drwn.class, drtl.a, "e", "d"});
            }
            if (i2 == 3) {
                return new drwp();
            }
            if (i2 == 4) {
                return new drwo();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drwp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (drwp.class) {
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
