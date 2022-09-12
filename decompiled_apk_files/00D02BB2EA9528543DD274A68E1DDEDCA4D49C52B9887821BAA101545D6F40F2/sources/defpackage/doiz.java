package defpackage;
/* compiled from: PG */
/* renamed from: doiz  reason: default package */
/* loaded from: classes6.dex */
public final class doiz extends dsqw<doiz, dohu> implements dssk {
    public static final doiz i;
    private static volatile dssr<doiz> k;
    public int a;
    public Object c;
    public boolean g;
    public int b = 0;
    private byte j = 2;
    public String d = "";
    public String e = "";
    public dsrj<dojx> f = dssu.b;
    public int h = 2;

    static {
        doiz doizVar = new doiz();
        i = doizVar;
        dsqw.cc(doiz.class, doizVar);
    }

    private doiz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0015\u0001\u0001\u0001\u0015\u0015\u0000\u0001\u0002\u0001ဈ\u0000\u0002ြ\u0000\u0003ဇ\u0012\u0004ဌ\u0013\u0005\u001b\u0006ᐼ\u0000\u0007ြ\u0000\bᐼ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fဈ\u0001\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0012ြ\u0000\u0013ြ\u0000\u0014ြ\u0000\u0015ြ\u0000", new Object[]{"c", "b", "a", "d", dogi.class, "g", "h", doir.a, "f", dojx.class, dole.class, dola.class, dokw.class, donk.class, dogr.class, domb.class, "e", domq.class, dokn.class, dohy.class, doht.class, dohw.class, doiq.class, doik.class, doiy.class, doie.class});
            }
            if (i3 == 3) {
                return new doiz();
            }
            if (i3 == 4) {
                return new dohu();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<doiz> dssrVar = k;
            if (dssrVar == null) {
                synchronized (doiz.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
