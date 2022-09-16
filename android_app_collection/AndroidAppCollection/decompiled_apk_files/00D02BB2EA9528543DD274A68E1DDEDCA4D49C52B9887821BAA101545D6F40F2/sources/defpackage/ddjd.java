package defpackage;
/* compiled from: PG */
/* renamed from: ddjd  reason: default package */
/* loaded from: classes5.dex */
public final class ddjd extends dsqw<ddjd, ddjc> implements dssk {
    public static final ddjd f;
    private static volatile dssr<ddjd> g;
    public int a;
    public int b;
    public String c = "";
    public boolean d;
    public boolean e;

    static {
        ddjd ddjdVar = new ddjd();
        f = ddjdVar;
        dsqw.cc(ddjd.class, ddjdVar);
    }

    private ddjd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0002\u0003ဇ\u0003\u0004ဈ\u0001", new Object[]{"a", "b", "d", "e", "c"});
            }
            if (i2 == 3) {
                return new ddjd();
            }
            if (i2 == 4) {
                return new ddjc();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddjd> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddjd.class) {
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
