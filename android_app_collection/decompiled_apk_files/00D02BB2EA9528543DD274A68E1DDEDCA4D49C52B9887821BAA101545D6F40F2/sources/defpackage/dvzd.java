package defpackage;
/* compiled from: PG */
/* renamed from: dvzd  reason: default package */
/* loaded from: classes6.dex */
public final class dvzd extends dsqw<dvzd, dvyz> implements dssk {
    public static final dvzd o;
    private static volatile dssr<dvzd> p;
    public int a;
    public boolean c;
    public int d;
    public dvzb e;
    public int i;
    public dops j;
    public djyq k;
    public doqa l;
    public int m;
    public boolean n;
    public int b = 2;
    public dsrj<String> f = dssu.b;
    public boolean g = true;
    public dsrj<String> h = dssu.b;

    static {
        dvzd dvzdVar = new dvzd();
        o = dvzdVar;
        dsqw.cc(dvzd.class, dvzdVar);
    }

    private dvzd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0004\u001a\u0006ဇ\u0005\u0007\u001a\bဌ\u0006\tင\u0002\nဉ\u0007\u000bဉ\u0003\rဉ\t\u000eဉ\n\u000fဌ\u000b\u0010ဇ\f", new Object[]{"a", "b", dvzc.a, "c", "f", "g", "h", "i", dopn.a, "d", "j", "e", "k", "l", "m", dopv.a, "n"});
            }
            if (i2 == 3) {
                return new dvzd();
            }
            if (i2 == 4) {
                return new dvyz();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvzd> dssrVar = p;
            if (dssrVar == null) {
                synchronized (dvzd.class) {
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

    public final void c() {
        dsrj<String> dsrjVar = this.h;
        if (!dsrjVar.a()) {
            this.h = dsqw.cl(dsrjVar);
        }
    }
}
