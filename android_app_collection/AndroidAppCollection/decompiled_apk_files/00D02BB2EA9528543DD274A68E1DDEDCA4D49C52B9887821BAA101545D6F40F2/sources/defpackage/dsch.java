package defpackage;
/* compiled from: PG */
/* renamed from: dsch  reason: default package */
/* loaded from: classes6.dex */
public final class dsch extends dsqw<dsch, dsbu> implements dssk {
    public static final dsch v;
    private static volatile dssr<dsch> w;
    public int a;
    public dscx e;
    public long f;
    public dsca h;
    public dsce j;
    public int k;
    public dscg l;
    public dsbw n;
    public int p;
    public int r;
    public boolean s;
    public dsbp u;
    public String b = "";
    public String c = "";
    public dsrj<dscx> d = dssu.b;
    public String g = "";
    public String i = "";
    public String m = "";
    public String o = "";
    public String q = "";
    public String t = "";

    static {
        dsch dschVar = new dsch();
        v = dschVar;
        dsqw.cc(dsch.class, dschVar);
    }

    private dsch() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(v, "\u0001\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဉ\u0005\bဈ\u0006\tဉ\u0007\nဌ\b\u000bဉ\t\fဈ\n\rဉ\u000b\u000eဈ\f\u000fင\r\u0010ဈ\u000e\u0011ဌ\u000f\u0012ဇ\u0010\u0013ဈ\u0011\u0015ဉ\u0013", new Object[]{"a", "b", "c", "d", dscx.class, "e", "f", "g", "h", "i", "j", "k", dsbs.a, "l", "m", "n", "o", "p", "q", "r", dscb.a, "s", "t", "u"});
            }
            if (i2 == 3) {
                return new dsch();
            }
            if (i2 == 4) {
                return new dsbu();
            }
            if (i2 == 5) {
                return v;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsch> dssrVar = w;
            if (dssrVar == null) {
                synchronized (dsch.class) {
                    dssrVar = w;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(v);
                        w = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
