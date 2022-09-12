package defpackage;
/* compiled from: PG */
/* renamed from: djul  reason: default package */
/* loaded from: classes6.dex */
public final class djul extends dsqw<djul, djuk> implements dssk {
    public static final djul o;
    private static volatile dssr<djul> p;
    public int a;
    public Object c;
    public int e;
    public int g;
    public int h;
    public int i;
    public dgep m;
    public int b = 0;
    public String d = "";
    public String f = "";
    public dsrj<dwfl> j = dssu.b;
    public String k = "";
    public String l = "";
    public dsrj<dgez> n = dssu.b;

    static {
        djul djulVar = new djul();
        o = djulVar;
        dsqw.cc(djul.class, djulVar);
    }

    private djul() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\f\u0001\u0001\u0003\u0015\f\u0000\u0002\u0000\u0003ဈ\u0003\u0005\u001b\u0006ဈ\n\u0007ဈ\u000b\u000bဌ\u0001\fင\u0005\u000eဈ\u0000\u0011င\t\u0012ဌ\b\u0013ဉ\f\u0014ြ\u0000\u0015\u001b", new Object[]{"c", "b", "a", "f", "j", dwfl.class, "k", "l", "e", dgfb.c(), "g", "d", "i", "h", dray.a, "m", dgev.class, "n", dgez.class});
            }
            if (i2 == 3) {
                return new djul();
            }
            if (i2 == 4) {
                return new djuk();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djul> dssrVar = p;
            if (dssrVar == null) {
                synchronized (djul.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
