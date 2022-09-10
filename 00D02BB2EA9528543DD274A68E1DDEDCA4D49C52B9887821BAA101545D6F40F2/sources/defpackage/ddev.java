package defpackage;
/* compiled from: PG */
/* renamed from: ddev  reason: default package */
/* loaded from: classes.dex */
public final class ddev extends dsqw<ddev, ddeu> implements dssk {
    public static final ddev u;
    private static volatile dssr<ddev> x;
    public int a;
    public ddqk b;
    public ddjj c;
    public ddpg d;
    public ddnd e;
    public ddjl f;
    public ddqo g;
    public ddmq h;
    public ddpa i;
    public ddno j;
    public ddjf k;
    public ddij l;
    public dden m;
    public ddow n;
    public deap o;
    public ddel p;
    public ddlw r;
    public ddgm s;
    public ddcy t;
    private ddex v;
    private byte w = 2;
    public dsrf q = dsqz.b;

    static {
        ddev ddevVar = new ddev();
        u = ddevVar;
        dsqw.cc(ddev.class, ddevVar);
    }

    private ddev() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(u, "\u0001\u0014\u0000\u0001\u0001 \u0014\u0000\u0001\u0003\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0007ဉ\u0005\bဉ\u0006\nဉ\u0007\fဉ\t\rဉ\n\u000eဉ\r\u000fᐉ\u000e\u0010ဉ\u000f\u0012ဉ\u0011\u0013ᐉ\u0012\u0014ဉ\u0013\u0018ဉ\u0017\u001a\u001e\u001cဉ\u001a\u001eဉ\u001c ဉ\u001e", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "v", "o", "p", "q", ddit.c(), "r", "s", "t"});
            }
            if (i2 == 3) {
                return new ddev();
            }
            if (i2 == 4) {
                return new ddeu();
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
            dssr<ddev> dssrVar = x;
            if (dssrVar == null) {
                synchronized (ddev.class) {
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
