package defpackage;
/* compiled from: PG */
/* renamed from: dnqh  reason: default package */
/* loaded from: classes.dex */
public final class dnqh extends dsqw<dnqh, dnqg> implements dssk {
    public static final dnqh p;
    private static volatile dssr<dnqh> s;
    public int a;
    public ddxx f;
    public int g;
    public int h;
    public dsrj<ddhk> i;
    public boolean j;
    public ddgg k;
    public int l;
    public doei m;
    public boolean n;
    public dnjh o;
    private boolean q;
    private byte r = 2;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dnqh dnqhVar = new dnqh();
        p = dnqhVar;
        dsqw.cc(dnqh.class, dnqhVar);
    }

    private dnqh() {
        dsqz dsqzVar = dsqz.b;
        this.i = dssu.b;
    }

    public static /* synthetic */ void b(dnqh dnqhVar) {
        dnqhVar.a |= 512;
        dnqhVar.q = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(p, "\u0001\u000f\u0000\u0001\u0001\u0018\u000f\u0000\u0001\u0002\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဇ\u000b\u0004ᐉ\u0004\u0007ဌ\u0010\bЛ\tဈ\u0001\u000bဉ\u000f\fဌ\u0007\u000eဉ\u0012\u000fင\u0006\u0011ဈ\u0000\u0014ဇ\t\u0017ဇ\u0013\u0018ဉ\u0014", new Object[]{"a", "d", "e", "j", "f", "l", dnmu.c(), "i", ddhk.class, "c", "k", "h", deaf.c(), "m", "g", "b", "q", "n", "o"});
            }
            if (i2 == 3) {
                return new dnqh();
            }
            if (i2 == 4) {
                return new dnqg();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            }
            dssr<dnqh> dssrVar = s;
            if (dssrVar == null) {
                synchronized (dnqh.class) {
                    dssrVar = s;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        s = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.r);
    }
}
