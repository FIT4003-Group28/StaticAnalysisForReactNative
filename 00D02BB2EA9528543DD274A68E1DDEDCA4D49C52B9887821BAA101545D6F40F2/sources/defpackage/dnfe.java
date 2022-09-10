package defpackage;
/* compiled from: PG */
/* renamed from: dnfe  reason: default package */
/* loaded from: classes6.dex */
public final class dnfe extends dsqw<dnfe, dneu> implements dssk {
    public static final dnfe p;
    private static volatile dssr<dnfe> q;
    public int a;
    public boolean b;
    public String c = "";
    public boolean d;
    public dnoh e;
    public doud f;
    public int g;
    public dney h;
    public boolean i;
    public int j;
    public dniu k;
    public dgsl l;
    public dnfd m;
    public String n;
    public dnta o;

    static {
        dnfe dnfeVar = new dnfe();
        p = dnfeVar;
        dsqw.cc(dnfe.class, dnfeVar);
    }

    private dnfe() {
        dssu<Object> dssuVar = dssu.b;
        this.n = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(p, "\u0001\u000e\u0000\u0001\u0001\u0015\u000e\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဇ\u0002\u0003ဉ\u0003\u0005ဉ\n\u0006ဉ\u000b\u0007ဉ\r\bဈ\u000e\tဇ\u0000\fဌ\u0006\u000eဇ\b\u000fဉ\u0007\u0011ဉ\u0004\u0012ဌ\t\u0015ဉ\u0011", new Object[]{"a", "c", "d", "e", "k", "l", "m", "n", "b", "g", dnfb.a, "i", "h", "f", "j", dnez.a, "o"});
            }
            if (i2 == 3) {
                return new dnfe();
            }
            if (i2 == 4) {
                return new dneu();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnfe> dssrVar = q;
            if (dssrVar == null) {
                synchronized (dnfe.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
