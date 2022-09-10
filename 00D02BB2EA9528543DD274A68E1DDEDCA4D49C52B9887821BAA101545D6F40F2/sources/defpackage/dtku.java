package defpackage;
/* compiled from: PG */
/* renamed from: dtku  reason: default package */
/* loaded from: classes6.dex */
public final class dtku extends dsqs<dtku, dtkt> implements dtkv {
    public static final dtku p;
    private static volatile dssr<dtku> t;
    public int a;
    public dtkf b;
    public dtqe c;
    public dtof d;
    public dtjz e;
    public dtnb f;
    public dtqq g;
    public dton h;
    public dtol i;
    public dtlj j;
    public dtqo k;
    public dtnv l;
    public dtra m;
    public dtlh n;
    public dtnj o;
    private dtkl q;
    private dtqm r;
    private byte s = 2;

    static {
        dtku dtkuVar = new dtku();
        p = dtkuVar;
        dsqw.cc(dtku.class, dtkuVar);
    }

    private dtku() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(p, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0010\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\b\nᐉ\t\u000bᐉ\n\fᐉ\u000b\rᐉ\f\u000eᐉ\r\u000fᐉ\u000e\u0010ᐉ\u000f", new Object[]{"a", "b", "c", "d", "h", "i", "e", "f", "g", "q", "j", "r", "k", "l", "m", "n", "o"});
            }
            if (i2 == 3) {
                return new dtku();
            }
            if (i2 == 4) {
                return new dtkt();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            }
            dssr<dtku> dssrVar = t;
            if (dssrVar == null) {
                synchronized (dtku.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.s);
    }
}
