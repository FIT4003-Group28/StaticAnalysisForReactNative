package defpackage;
/* compiled from: PG */
/* renamed from: dltm  reason: default package */
/* loaded from: classes6.dex */
public final class dltm extends dsqw<dltm, dltf> implements dssk {
    public static final dltm t;
    private static volatile dssr<dltm> w;
    public dlug c;
    public int d;
    public int e;
    public int f;
    public dvfg g;
    public long h;
    public long i;
    public long j;
    public int k;
    public dlte m;
    public boolean n;
    public boolean o;
    public boolean p;
    public long q;
    public boolean r;
    public dlsw s;
    private int u;
    private byte v = 2;
    public String a = "";
    public dspd b = dspd.b;
    public dsrj<dluu> l = dssu.b;

    static {
        dltm dltmVar = new dltm();
        t = dltmVar;
        dsqw.cc(dltm.class, dltmVar);
    }

    private dltm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(t, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0001\u0002\u0001ဈ\u0000\u0002ည\u0001\u0003ᐉ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006င\u0005\u0007ᐉ\u0006\bဂ\u0007\tဂ\t\nဌ\n\u000bဉ\u000b\fဇ\f\rဇ\r\u000eဂ\u000f\u000fဉ\u0011\u0010ဂ\b\u0011ဇ\u000e\u0012\u001b\u0013ဇ\u0010", new Object[]{"u", "a", "b", "c", "d", dlti.a, "e", dltg.a, "f", "g", "h", "j", "k", dltl.c(), "m", "n", "o", "q", "s", "i", "p", "l", dluu.class, "r"});
            }
            if (i2 == 3) {
                return new dltm();
            }
            if (i2 == 4) {
                return new dltf();
            }
            if (i2 == 5) {
                return t;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.v = b;
                return null;
            }
            dssr<dltm> dssrVar = w;
            if (dssrVar == null) {
                synchronized (dltm.class) {
                    dssrVar = w;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(t);
                        w = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.v);
    }
}
