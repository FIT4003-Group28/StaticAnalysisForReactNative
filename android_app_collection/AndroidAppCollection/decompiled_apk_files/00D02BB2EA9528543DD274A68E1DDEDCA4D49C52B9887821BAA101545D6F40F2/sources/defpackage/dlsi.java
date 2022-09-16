package defpackage;
/* compiled from: PG */
/* renamed from: dlsi  reason: default package */
/* loaded from: classes.dex */
public final class dlsi extends dsqw<dlsi, dlsh> implements dssk {
    public static final dlsi g;
    private static volatile dssr<dlsi> h;
    public int a;
    public dlrl b;
    public dlov c;
    public String d = "";
    public dsrj<String> e = dssu.b;
    public String f = "";

    static {
        dlsi dlsiVar = new dlsi();
        g = dlsiVar;
        dsqw.cc(dlsi.class, dlsiVar);
    }

    private dlsi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004\u001a\u0007ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dlsi();
            }
            if (i2 == 4) {
                return new dlsh();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlsi> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlsi.class) {
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
