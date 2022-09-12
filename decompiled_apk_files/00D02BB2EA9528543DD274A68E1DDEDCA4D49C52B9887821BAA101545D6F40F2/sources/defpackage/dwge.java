package defpackage;
/* compiled from: PG */
/* renamed from: dwge  reason: default package */
/* loaded from: classes6.dex */
public final class dwge extends dsqw<dwge, dwfy> implements dssk {
    public static final dwge m;
    private static volatile dssr<dwge> o;
    public int a;
    public dniu c;
    public dhjz e;
    public double g;
    public dwfv h;
    public dwgd i;
    public dizd j;
    public dnqh k;
    public String l;
    private byte n = 2;
    public int b = 2;
    public dsrj<dggg> d = dssu.b;
    public dsrj<dhjz> f = dssu.b;

    static {
        dwge dwgeVar = new dwge();
        m = dwgeVar;
        dsqw.cc(dwge.class, dwgeVar);
    }

    private dwge() {
        dsqz dsqzVar = dsqz.b;
        this.l = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\u0014\u000b\u0000\u0002\u0001\u0001ဉ\u0003\u0007ဉ\u0007\bဌ\u0000\nဉ\u0005\u000bက\u0006\u000e\u001b\u000fဉ\f\u0010\u001b\u0012ᐉ\r\u0013ဉ\b\u0014ဈ\u000f", new Object[]{"a", "c", "h", "b", dwgf.a, "e", "g", "d", dggg.class, "j", "f", dhjz.class, "k", "i", "l"});
            }
            if (i2 == 3) {
                return new dwge();
            }
            if (i2 == 4) {
                return new dwfy();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            }
            dssr<dwge> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dwge.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.n);
    }

    public final void c() {
        dsrj<dggg> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
