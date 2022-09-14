package defpackage;
/* compiled from: PG */
/* renamed from: dlfj  reason: default package */
/* loaded from: classes6.dex */
public final class dlfj extends dsqw<dlfj, dlfi> implements dssk {
    public static final dlfj g;
    private static volatile dssr<dlfj> h;
    public int a;
    public dlfr b;
    public long c;
    public int e;
    public String d = "";
    public String f = "";

    static {
        dlfj dlfjVar = new dlfj();
        g = dlfjVar;
        dsqw.cc(dlfj.class, dlfjVar);
    }

    private dlfj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u000f\u0005\u0000\u0000\u0000\u0001ဉ\u0000\nဈ\f\fင\r\u000eဃ\n\u000fဈ\u000e", new Object[]{"a", "b", "d", "e", "c", "f"});
            }
            if (i2 == 3) {
                return new dlfj();
            }
            if (i2 == 4) {
                return new dlfi();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlfj> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlfj.class) {
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
