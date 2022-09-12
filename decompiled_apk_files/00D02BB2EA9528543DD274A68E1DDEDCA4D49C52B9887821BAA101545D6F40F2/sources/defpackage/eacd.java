package defpackage;
/* compiled from: PG */
/* renamed from: eacd  reason: default package */
/* loaded from: classes.dex */
public final class eacd extends dsqw<eacd, eacc> implements dssk {
    public static final eacd u;
    private static volatile dssr<eacd> x;
    public int a;
    public dzzn b;
    public long c;
    public eacf e;
    public eaba f;
    public dzzz g;
    public eabf h;
    public eabu i;
    public eabp j;
    public dzye k;
    public eabl l;
    public dzze m;
    public eaaj n;
    public dzyw p;
    public eaax q;
    public eabh r;
    public eacb s;
    public eaby t;
    private eabc v;
    private byte w = 2;
    public String d = "";
    public String o = "";

    static {
        eacd eacdVar = new eacd();
        u = eacdVar;
        dsqw.cc(eacd.class, eacdVar);
    }

    private eacd() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(u, "\u0001\u0014\u0000\u0001\u0001\u001e\u0014\u0000\u0000\b\u0001ᐉ\u0000\u0002စ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဉ\b\nᐉ\t\fဉ\u000b\u000eᐉ\r\u0010ᐉ\u000f\u0011ဈ\u0010\u0015ဉ\u0014\u0017ဉ\u0016\u001bဉ\u0012\u001cဉ\u0018\u001dᐉ\u0019\u001eဉ\u001a", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "q", "r", "p", "s", "v", "t"});
            }
            if (i2 == 3) {
                return new eacd();
            }
            if (i2 == 4) {
                return new eacc();
            }
            if (i2 == 5) {
                return u;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.w = b;
                return null;
            }
            dssr<eacd> dssrVar = x;
            if (dssrVar == null) {
                synchronized (eacd.class) {
                    dssrVar = x;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(u);
                        x = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.w);
    }
}
