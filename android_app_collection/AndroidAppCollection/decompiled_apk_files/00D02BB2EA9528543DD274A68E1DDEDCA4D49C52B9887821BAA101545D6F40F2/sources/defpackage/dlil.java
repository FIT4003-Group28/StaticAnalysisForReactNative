package defpackage;
/* compiled from: PG */
/* renamed from: dlil  reason: default package */
/* loaded from: classes6.dex */
public final class dlil extends dsqw<dlil, dlig> implements dssk {
    public static final dlil g;
    private static volatile dssr<dlil> h;
    public int a;
    public dlii c;
    public int e;
    public dsrj<dgkg> b = dssu.b;
    public String d = "";
    public String f = "";

    static {
        dlil dlilVar = new dlil();
        g = dlilVar;
        dsqw.cc(dlil.class, dlilVar);
    }

    private dlil() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0001\u0004ဌ\u0002\u0005ဈ\u0003", new Object[]{"a", "b", dgkg.class, "c", "d", "e", dlij.a, "f"});
            }
            if (i2 == 3) {
                return new dlil();
            }
            if (i2 == 4) {
                return new dlig();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlil> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlil.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
