package defpackage;
/* compiled from: PG */
/* renamed from: dwla  reason: default package */
/* loaded from: classes6.dex */
public final class dwla extends dsqw<dwla, dwkr> implements dssk {
    public static final dwla m;
    private static volatile dssr<dwla> o;
    public int a;
    public dvlu d;
    public dwrz e;
    public dvof f;
    public dwkz l;
    private byte n = 2;
    public dsrj<dwmk> b = dssu.b;
    public String c = "";
    public String g = "";
    public String h = "";
    public dsrj<dwkv> i = dssu.b;
    public String j = "";
    public String k = "";

    static {
        dwla dwlaVar = new dwla();
        m = dwlaVar;
        dsqw.cc(dwla.class, dwlaVar);
    }

    private dwla() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0002\u0003\u0001Л\u0002ဈ\u0000\u0003ဉ\u0001\u0004ᐉ\u0002\u0005ဉ\u0003\u0006ဈ\u0004\u0007\u001b\bဈ\b\nဈ\u0006\rဈ\u0005\u000eᐉ\t", new Object[]{"a", "b", dwmk.class, "c", "d", "e", "f", "g", "i", dwkv.class, "k", "j", "h", "l"});
            }
            if (i2 == 3) {
                return new dwla();
            }
            if (i2 == 4) {
                return new dwkr();
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
            dssr<dwla> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dwla.class) {
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
}
