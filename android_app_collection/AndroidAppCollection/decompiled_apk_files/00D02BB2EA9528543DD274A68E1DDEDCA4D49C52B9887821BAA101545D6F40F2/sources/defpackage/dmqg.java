package defpackage;
/* compiled from: PG */
/* renamed from: dmqg  reason: default package */
/* loaded from: classes.dex */
public final class dmqg extends dsqs<dmqg, dmqd> implements dsqt {
    public static final dmqg p;
    private static volatile dssr<dmqg> r;
    public int a;
    public int c;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public int n;
    public int o;
    private byte q = 2;
    public dspd b = dspd.b;
    public dsrf d = dsqz.b;
    public dsri e = dsrx.b;
    public int f = 1;
    public int g = 1;

    static {
        dmqg dmqgVar = new dmqg();
        p = dmqgVar;
        dsqw.cc(dmqg.class, dmqgVar);
    }

    private dmqg() {
        dssu<Object> dssuVar = dssu.b;
        this.l = -1;
        this.m = -1L;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(p, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\u0000\u0001ည\u0000\u0002'\u0003င\b\u0004င\n\u0005ဆ\u000b\u0006ဌ\u0002\u0007င\u0001\bဌ\u0003\nင\u0005\u000bဂ\t\f%\rင\u0006\u000eင\u0007\u000fဌ\u0004", new Object[]{"a", "b", "d", "l", "n", "o", "f", dmqe.a, "c", "g", dmqe.a, "i", "m", "e", "j", "k", "h", dmom.a});
            }
            if (i2 == 3) {
                return new dmqg();
            }
            if (i2 == 4) {
                return new dmqd();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            }
            dssr<dmqg> dssrVar = r;
            if (dssrVar == null) {
                synchronized (dmqg.class) {
                    dssrVar = r;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        r = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.q);
    }
}
