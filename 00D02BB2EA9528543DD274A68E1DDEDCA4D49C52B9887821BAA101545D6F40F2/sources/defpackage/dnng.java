package defpackage;
/* compiled from: PG */
/* renamed from: dnng  reason: default package */
/* loaded from: classes.dex */
public final class dnng extends dsqw<dnng, dnnf> implements dssk {
    public static final dnng r;
    private static volatile dssr<dnng> u;
    public int a;
    public dnnn b;
    public boolean c;
    public dnob j;
    public dnhi k;
    public dnnx l;
    public dnod m;
    public dosu n;
    public dndv o;
    public boolean p;
    public dmni q;
    private int s;
    private byte t = 2;
    public String d = "";
    public String e = "";
    public dsrj<dnnr> f = dssu.b;
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        dnng dnngVar = new dnng();
        r = dnngVar;
        dsqw.cc(dnng.class, dnngVar);
    }

    private dnng() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(r, "\u0001\u0010\u0000\u0002\u0005#\u0010\u0000\u0001\u0001\u0005ဇ\n\u0006\u001b\bဉ\u0005\nဈ\r\u000fဈ\u000f\u0010ဈ\u0014\u0011ဈ\u0015\u0014ဈ\u0016\u0015ဉ\u0017\u0017ဉ\u0018\u001aဉ\u001b\u001eဉ\u001e\u001fဉ\u001c ဇ \"ᐉ\"#ဉ\u001d", new Object[]{"a", "s", "c", "f", dnnr.class, "b", "d", "e", "g", "h", "i", "j", "k", "l", "o", "m", "p", "q", "n"});
            }
            if (i2 == 3) {
                return new dnng();
            }
            if (i2 == 4) {
                return new dnnf();
            }
            if (i2 == 5) {
                return r;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            }
            dssr<dnng> dssrVar = u;
            if (dssrVar == null) {
                synchronized (dnng.class) {
                    dssrVar = u;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(r);
                        u = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.t);
    }
}
