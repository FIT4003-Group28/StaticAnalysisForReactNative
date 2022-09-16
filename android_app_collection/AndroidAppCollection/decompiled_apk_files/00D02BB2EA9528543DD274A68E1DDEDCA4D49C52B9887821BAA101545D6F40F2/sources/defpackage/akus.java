package defpackage;
/* compiled from: PG */
/* renamed from: akus */
/* loaded from: classes.dex */
public final class akus extends dsqw<akus, akuq> implements dssk {
    public static final akus o;
    private static volatile dssr<akus> q;
    public int a;
    public Object c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public akup h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int b = 0;
    private byte p = 2;

    static {
        akus akusVar = new akus();
        o = akusVar;
        dsqw.cc(akus.class, akusVar);
    }

    private akus() {
    }

    public static /* synthetic */ void b(akus akusVar) {
        akusVar.a |= 131072;
        akusVar.i = true;
    }

    public static /* synthetic */ void c(akus akusVar) {
        akusVar.a |= 8388608;
        akusVar.n = true;
    }

    public static /* synthetic */ void d(akus akusVar) {
        akusVar.b = 19;
        akusVar.c = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(o, "\u0001\u0017\u0001\u0001\u0001\u0018\u0017\u0000\u0000\u0001\u0001်\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဇ\f\u0007ဇ\r\bဇ\u000e\tဇ\u000f\n်\u0000\u000bဉ\u0010\fဇ\u0011\u000eဇ\u0013\u000fဇ\u0014\u0010်\u0000\u0011်\u0000\u0012်\u0000\u0013်\u0000\u0014ဇ\u0015\u0015်\u0000\u0016်\u0000\u0017ဇ\u0016\u0018ဇ\u0017", new Object[]{"c", "b", "a", akvc.class, dwnl.class, akun.class, akva.class, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            }
            if (i2 == 3) {
                return new akus();
            }
            if (i2 == 4) {
                return new akuq();
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
            dssr<akus> dssrVar = q;
            if (dssrVar == null) {
                synchronized (akus.class) {
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
}
