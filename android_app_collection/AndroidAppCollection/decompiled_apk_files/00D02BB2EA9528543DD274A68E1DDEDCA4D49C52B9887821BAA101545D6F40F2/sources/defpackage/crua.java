package defpackage;
/* compiled from: PG */
/* renamed from: crua  reason: default package */
/* loaded from: classes5.dex */
public final class crua extends dsqw<crua, crtt> implements dssk {
    public static final crua o;
    private static volatile dssr<crua> q;
    public int a;
    public crts d;
    public int e;
    public int f;
    public double h;
    public long i;
    public dfqq j;
    public long k;
    public long l;
    public int n;
    private byte p = 2;
    public String b = "";
    public String c = "";
    public dsrj<crtv> g = dssu.b;
    public String m = "";

    static {
        crua cruaVar = new crua();
        o = cruaVar;
        dsqw.cc(crua.class, cruaVar);
    }

    private crua() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(o, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0001\u0002\u0001ဈ\u0001\u0002ᐉ\u0002\u0003ဌ\u0003\u0004က\u0005\u0005ᐉ\u0007\u0006ဂ\u0006\tဈ\u0000\nဌ\u0004\u000b\u001b\fဌ\u000b\rဂ\b\u000eဈ\n\u000fဂ\t", new Object[]{"a", "c", "d", "e", crtx.c(), "h", "j", "i", "b", "f", crtz.c(), "g", crtv.class, "n", cruc.c(), "k", "m", "l"});
            }
            if (i2 == 3) {
                return new crua();
            }
            if (i2 == 4) {
                return new crtt();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            }
            dssr<crua> dssrVar = q;
            if (dssrVar == null) {
                synchronized (crua.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.p);
    }

    public final void b() {
        dsrj<crtv> dsrjVar = this.g;
        if (!dsrjVar.a()) {
            this.g = dsqw.cl(dsrjVar);
        }
    }
}
