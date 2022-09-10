package defpackage;
/* compiled from: PG */
/* renamed from: dlwk  reason: default package */
/* loaded from: classes.dex */
public final class dlwk extends dsqw<dlwk, dlwj> implements dssk {
    public static final dlwk g;
    private static volatile dssr<dlwk> h;
    public int a;
    public dsrj<String> b = dssu.b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        dlwk dlwkVar = new dlwk();
        g = dlwkVar;
        dsqw.cc(dlwk.class, dlwkVar);
    }

    private dlwk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0001\u0000\u0003\u001a\u0005ဈ\u0000\u0006ဈ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dlwk();
            }
            if (i2 == 4) {
                return new dlwj();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlwk> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlwk.class) {
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
