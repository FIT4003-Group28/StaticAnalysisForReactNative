package defpackage;
/* compiled from: PG */
/* renamed from: ddna  reason: default package */
/* loaded from: classes.dex */
public final class ddna extends dsqw<ddna, ddmz> implements dssk {
    public static final ddna v;
    private static volatile dssr<ddna> y;
    public int a;
    public int b;
    public ddsj c;
    public ddta d;
    public ddls e;
    public long f;
    public ddlp h;
    public ddlj i;
    public ddma k;
    public ddom l;
    public ddkr m;
    public ddqb n;
    public int o;
    public ddpi p;
    public ddqu q;
    public ddsh r;
    public ddsu s;
    public ddms u;
    private ddnm w;
    private byte x = 2;
    public dsrj<ddmy> g = dssu.b;
    public dsrf j = dsqz.b;
    public dsrj<ddpz> t = dssu.b;

    static {
        ddna ddnaVar = new ddna();
        v = ddnaVar;
        dsqw.cc(ddna.class, ddnaVar);
    }

    private ddna() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(v, "\u0001\u0015\u0000\u0001\u0003'\u0015\u0000\u0003\u0006\u0003င\u0002\u0010ᐉ\u0005\u0011ᐉ\u0006\u0012ဉ\u0007\u0013ဉ\r\u0014ဉ\u000e\u0015ဉ\u000f\u0016ᐉ\u0010\u0018ဂ\b\u0019င\u0012\u001aဉ\u0013\u001bЛ\u001cဉ\u0014\u001dᐉ\u0015\u001eဉ\u0016\u001fဉ\n ဉ\u0017\"\u001b#'$ᐉ\t'ဉ\u0018", new Object[]{"a", "b", "c", "d", "e", "k", "l", "m", "n", "f", "o", "p", "g", ddmy.class, "q", "w", "r", "i", "s", "t", ddpz.class, "j", "h", "u"});
            }
            if (i2 == 3) {
                return new ddna();
            }
            if (i2 == 4) {
                return new ddmz();
            }
            if (i2 == 5) {
                return v;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.x = b;
                return null;
            }
            dssr<ddna> dssrVar = y;
            if (dssrVar == null) {
                synchronized (ddna.class) {
                    dssrVar = y;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(v);
                        y = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.x);
    }
}
