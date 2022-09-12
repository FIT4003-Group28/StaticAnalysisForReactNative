package defpackage;
/* compiled from: PG */
/* renamed from: dtol  reason: default package */
/* loaded from: classes6.dex */
public final class dtol extends dsqs<dtol, dtoi> implements dsqt {
    public static final dtol q;
    private static volatile dssr<dtol> s;
    public int a;
    public dtkq b;
    public boolean d;
    public float e;
    public dpoj h;
    public long k;
    public dtok l;
    public dthb m;
    public long o;
    public dqwy p;
    private byte r = 2;
    public String c = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String j = "";
    public String n = "";

    static {
        dtol dtolVar = new dtol();
        q = dtolVar;
        dsqw.cc(dtol.class, dtolVar);
    }

    private dtol() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(q, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ခ\u0003\u0004ဈ\u0004\u0005ᐉ\u000b\u0006ဈ\f\bဈ\u0005\nဂ\u000f\u000bဉ\n\fဇ\u0002\rဈ\u0007\u000eဈ\b\u000fဂ\t\u0010ဉ\u0006\u0011ဉ\u0010", new Object[]{"a", "b", "c", "e", "f", "m", "n", "g", "o", "l", "d", "i", "j", "k", "h", "p"});
            }
            if (i2 == 3) {
                return new dtol();
            }
            if (i2 == 4) {
                return new dtoi();
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            }
            dssr<dtol> dssrVar = s;
            if (dssrVar == null) {
                synchronized (dtol.class) {
                    dssrVar = s;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(q);
                        s = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.r);
    }
}
