package defpackage;
/* compiled from: PG */
/* renamed from: dwki  reason: default package */
/* loaded from: classes.dex */
public final class dwki extends dsqw<dwki, dwkh> implements dssk {
    public static final dwki f;
    private static volatile dssr<dwki> g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public boolean e;

    static {
        dwki dwkiVar = new dwki();
        f = dwkiVar;
        dsqw.cc(dwki.class, dwkiVar);
    }

    private dwki() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dwki();
            }
            if (i2 == 4) {
                return new dwkh();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwki> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwki.class) {
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
