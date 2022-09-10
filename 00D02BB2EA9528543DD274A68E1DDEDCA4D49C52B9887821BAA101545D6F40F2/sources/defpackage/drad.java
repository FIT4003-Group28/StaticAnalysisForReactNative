package defpackage;
/* compiled from: PG */
/* renamed from: drad  reason: default package */
/* loaded from: classes6.dex */
public final class drad extends dsqw<drad, drac> implements dssk {
    public static final drad l;
    private static volatile dssr<drad> m;
    public int a;
    public int c;
    public int d;
    public int e;
    public int j;
    public dgfg k;
    public String b = "";
    public String f = "";
    public dsrj<dggg> g = dssu.b;
    public dsrj<drax> h = dssu.b;
    public String i = "";

    static {
        drad dradVar = new drad();
        l = dradVar;
        dsqw.cc(drad.class, dradVar);
    }

    private drad() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0004ဌ\u0004\u0005ဈ\u0005\u0006\u001b\u0007ဌ\u0002\bဈ\u0006\tဌ\u0007\nဉ\b\u000b\u001b", new Object[]{"a", "b", "c", dgfb.c(), "e", dray.a, "f", "g", dggg.class, "d", dgfd.a, "i", "j", draa.a, "k", "h", drax.class});
            }
            if (i2 == 3) {
                return new drad();
            }
            if (i2 == 4) {
                return new drac();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drad> dssrVar = m;
            if (dssrVar == null) {
                synchronized (drad.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
