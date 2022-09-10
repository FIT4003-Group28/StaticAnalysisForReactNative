package defpackage;
/* compiled from: PG */
/* renamed from: dhtg  reason: default package */
/* loaded from: classes6.dex */
public final class dhtg extends dsqw<dhtg, dhtf> implements dssk {
    public static final dhtg f;
    private static volatile dssr<dhtg> h;
    public dgep d;
    private int g;
    public String a = "";
    public String b = "";
    public String c = "";
    public dsrj<dwfl> e = dssu.b;

    static {
        dhtg dhtgVar = new dhtg();
        f = dhtgVar;
        dsqw.cc(dhtg.class, dhtgVar);
    }

    private dhtg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0004\u0006\u001b", new Object[]{"g", "a", "b", "c", "d", "e", dwfl.class});
            }
            if (i2 == 3) {
                return new dhtg();
            }
            if (i2 == 4) {
                return new dhtf();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhtg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dhtg.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
