package defpackage;
/* compiled from: PG */
/* renamed from: dmpv  reason: default package */
/* loaded from: classes.dex */
public final class dmpv extends dsqw<dmpv, dmpq> implements dssk {
    public static final dmpv s;
    private static volatile dssr<dmpv> u;
    public int a;
    public int b;
    public int c;
    public dmob e;
    public dmsu f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public dmmm o;
    public int p;
    public dmlu q;
    public dsrj<dmpj> r;
    private byte t = 2;
    public dsrj<dmoh> d = dssu.b;

    static {
        dmpv dmpvVar = new dmpv();
        s = dmpvVar;
        dsqw.cc(dmpv.class, dmpvVar);
    }

    private dmpv() {
        dsqz dsqzVar = dsqz.b;
        this.h = 1;
        this.i = 1;
        this.r = dssu.b;
    }

    public static dmpq c() {
        return s.bZ();
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(s, "\u0001\u0011\u0000\u0001\u0001\u0014\u0011\u0000\u0002\u0002\u0001ဆ\u0000\u0002ဆ\u0001\u0003Л\u0004ဉ\u0002\u0005ᐉ\u0003\u0006င\u0004\u0007ဇ\u0007\tဌ\u0005\nဌ\u0006\u000bဏ\b\fဏ\t\rဏ\n\u000eဌ\u000b\u000fဉ\f\u0011င\r\u0012ဉ\u000f\u0014\u001b", new Object[]{"a", "b", "c", "d", dmoh.class, "e", "f", "g", "j", "h", dmlo.c(), "i", dmps.c(), "k", "l", "m", "n", dmpt.a, "o", "p", "q", "r", dmpj.class});
            }
            if (i2 == 3) {
                return new dmpv();
            }
            if (i2 == 4) {
                return new dmpq();
            }
            if (i2 == 5) {
                return s;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            }
            dssr<dmpv> dssrVar = u;
            if (dssrVar == null) {
                synchronized (dmpv.class) {
                    dssrVar = u;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(s);
                        u = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.t);
    }

    public final void b() {
        dsrj<dmoh> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
