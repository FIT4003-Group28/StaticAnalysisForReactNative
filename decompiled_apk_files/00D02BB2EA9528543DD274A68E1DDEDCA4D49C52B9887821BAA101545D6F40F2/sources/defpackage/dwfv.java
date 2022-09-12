package defpackage;
/* compiled from: PG */
/* renamed from: dwfv */
/* loaded from: classes.dex */
public final class dwfv extends dsqw<dwfv, dwfs> implements dssk {
    public static final dwfv m;
    private static volatile dssr<dwfv> o;
    public int a;
    public dwew b;
    public dwfr c;
    public dwff d;
    public dwdv e;
    public dwej f;
    public dwey g;
    public dwfx h;
    public dwdz i;
    public dwfu j;
    public dhkd k;
    public int l;
    private boolean n;

    static {
        dwfv dwfvVar = new dwfv();
        m = dwfvVar;
        dsqw.cc(dwfv.class, dwfvVar);
    }

    private dwfv() {
    }

    public static /* synthetic */ void c(dwfv dwfvVar) {
        dwfvVar.a |= 8;
        dwfvVar.n = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဌ\u000b", new Object[]{"a", "b", "c", "d", "n", "e", "f", "g", "h", "i", "j", "k", "l", dwfd.a});
            }
            if (i2 == 3) {
                return new dwfv();
            }
            if (i2 == 4) {
                return new dwfs();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwfv> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dwfv.class) {
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
