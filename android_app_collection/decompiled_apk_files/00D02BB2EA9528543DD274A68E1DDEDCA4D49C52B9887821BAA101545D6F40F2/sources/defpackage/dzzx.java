package defpackage;
/* compiled from: PG */
/* renamed from: dzzx  reason: default package */
/* loaded from: classes6.dex */
public final class dzzx extends dsqw<dzzx, dzzu> implements dssk {
    public static final dzzx x;
    private static volatile dssr<dzzx> z;
    public int a;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public eaat k;
    public int l;
    public dzzt m;
    public long n;
    public int o;
    public int p;
    public int q;
    public int r;
    public String s;
    public dsri t;
    public String u;
    public eaaf v;
    public dzzp w;
    private byte y = 2;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        dzzx dzzxVar = new dzzx();
        x = dzzxVar;
        dsqw.cc(dzzx.class, dzzxVar);
    }

    private dzzx() {
        dssu<Object> dssuVar = dssu.b;
        this.s = "";
        this.t = dsrx.b;
        this.u = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(x, "\u0001\u0016\u0000\u0001\u0001\u001a\u0016\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\bဌ\b\nဉ\t\u000bဉ\u000b\rဂ\r\u000eဌ\u000e\u000fဌ\u000f\u0010င\u0011\u0011ဈ\u0012\u0013င\u0010\u0014ဈ\u0014\u0015(\u0016ဉ\u0015\u0018ဌ\n\u0019ဈ\u0002\u001aဉ\u0016", new Object[]{"a", "b", "c", "e", "f", "g", "h", "i", "j", eaac.a, "k", "m", "n", "o", eaad.a, "p", eaaa.a, "r", "s", "q", "u", "t", "v", "l", dzzw.c(), "d", "w"});
            }
            if (i2 == 3) {
                return new dzzx();
            }
            if (i2 == 4) {
                return new dzzu();
            }
            if (i2 == 5) {
                return x;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.y = b;
                return null;
            }
            dssr<dzzx> dssrVar = z;
            if (dssrVar == null) {
                synchronized (dzzx.class) {
                    dssrVar = z;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(x);
                        z = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.y);
    }
}
