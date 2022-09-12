package defpackage;
/* compiled from: PG */
/* renamed from: dkyz  reason: default package */
/* loaded from: classes.dex */
public final class dkyz extends dsqw<dkyz, dkyy> implements dssk {
    public static final dkyz m;
    private static volatile dssr<dkyz> o;
    public boolean a;
    public boolean c;
    public boolean d;
    private int n;
    public String b = "";
    public int e = 1;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";

    static {
        dkyz dkyzVar = new dkyz();
        m = dkyzVar;
        dsqw.cc(dkyz.class, dkyzVar);
    }

    private dkyz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\f\u0000\u0001\u0001\u0014\f\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\bဈ\n\nဈ\f\fဈ\u000e\u000eဈ\u0010\u0010ဈ\u0012\u0012င\u0004\u0013ဈ\b\u0014ဈ\u0014", new Object[]{"n", "a", "b", "c", "d", "g", "h", "i", "j", "k", "e", "f", "l"});
            }
            if (i2 == 3) {
                return new dkyz();
            }
            if (i2 == 4) {
                return new dkyy();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkyz> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dkyz.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
