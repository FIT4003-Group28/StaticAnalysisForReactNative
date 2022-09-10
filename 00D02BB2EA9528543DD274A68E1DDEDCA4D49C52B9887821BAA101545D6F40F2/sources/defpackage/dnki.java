package defpackage;
/* compiled from: PG */
/* renamed from: dnki  reason: default package */
/* loaded from: classes6.dex */
public final class dnki extends dsqw<dnki, dnkf> implements dssk {
    public static final dnki f;
    private static volatile dssr<dnki> g;
    public int a;
    public int b;
    public dnoh c;
    public String d = "";
    public String e = "";

    static {
        dnki dnkiVar = new dnki();
        f = dnkiVar;
        dsqw.cc(dnki.class, dnkiVar);
    }

    private dnki() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", dnkh.c(), "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dnki();
            }
            if (i2 == 4) {
                return new dnkf();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnki> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnki.class) {
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
