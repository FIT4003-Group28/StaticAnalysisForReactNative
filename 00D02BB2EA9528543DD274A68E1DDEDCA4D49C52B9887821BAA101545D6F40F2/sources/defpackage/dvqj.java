package defpackage;
/* compiled from: PG */
/* renamed from: dvqj  reason: default package */
/* loaded from: classes6.dex */
public final class dvqj extends dsqw<dvqj, dvqh> implements dssk {
    public static final dvqj o;
    private static volatile dssr<dvqj> q;
    public int a;
    public int d;
    public dnqh e;
    public djgw f;
    public int g;
    public dvqg h;
    public int k;
    public dqwy l;
    public drfu n;
    private byte p = 2;
    public String b = "";
    public String c = "";
    public dsrj<drfa> i = dssu.b;
    public int j = 1;
    public dsrj<dreq> m = dssu.b;

    static {
        dvqj dvqjVar = new dvqj();
        o = dvqjVar;
        dsqw.cc(dvqj.class, dvqjVar);
    }

    private dvqj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(o, "\u0001\r\u0000\u0001\u0001\u0013\r\u0000\u0002\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0007ᐉ\u0005\bဉ\u0006\tဉ\b\u000bဌ\n\fဌ\u000b\u000eဌ\u0007\u0010ဉ\r\u0011ဉ\f\u0012\u001b\u0013\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "h", "j", dqgr.c(), "k", dqgs.a, "g", dhpj.c(), "n", "l", "i", drfa.class, "m", dreq.class});
            }
            if (i2 == 3) {
                return new dvqj();
            }
            if (i2 == 4) {
                return new dvqh();
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
            dssr<dvqj> dssrVar = q;
            if (dssrVar == null) {
                synchronized (dvqj.class) {
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
