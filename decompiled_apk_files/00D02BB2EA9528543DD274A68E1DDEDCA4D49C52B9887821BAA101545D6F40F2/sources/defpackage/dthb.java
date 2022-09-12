package defpackage;
/* compiled from: PG */
/* renamed from: dthb  reason: default package */
/* loaded from: classes6.dex */
public final class dthb extends dsqw<dthb, dtha> implements dssk {
    public static final dthb F;
    private static volatile dssr<dthb> Q;
    public dtlz A;
    public dtor B;
    public dtnt C;
    public dtmb D;
    public dtpf E;
    private dtrg G;
    private dtpp H;
    private dtnn I;
    private dtnl J;
    private dtmh K;
    private dtqs L;
    private dtmf M;
    private dtlx N;
    private dtll O;
    private byte P = 2;
    public int a;
    public int b;
    public dtov c;
    public dtjx d;
    public dtlv e;
    public dtnr f;
    public dtrm g;
    public dtkd h;
    public dtjj i;
    public dtnp j;
    public dtpd k;
    public dtlp l;
    public dtkb m;
    public dtph n;
    public dtpb o;
    public dtpj p;
    public dtpn q;
    public dtqw r;
    public dtks s;
    public dtlr t;
    public dtpt u;
    public dtoz v;
    public dtjl w;
    public dtri x;
    public dtmn y;
    public dtmd z;

    static {
        dthb dthbVar = new dthb();
        F = dthbVar;
        dsqw.cc(dthb.class, dthbVar);
    }

    private dthb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(F, "\u0001&\u0000\u0002\u0001/&\u0000\u0000\u0010\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0006ᐉ\u0005\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000fᐉ\u000e\u0010ᐉ\u000f\u0011ဉ\u0010\u0012ᐉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ᐉ\u0014\u0016ဉ\u0015\u0018ᐉ\u0017\u0019ဉ\u0018\u001bဉ\u0019\u001cဉ\u001a\u001dဉ\u001b\u001eᐉ\u001c ဉ\u001e!ဉ\u001f\"ဉ #ဉ!&ᐉ$'ᐉ%(ဉ&)ဉ'+ᐉ),ᐉ*-ᐉ+.ဉ,/ᐉ-", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "G", "i", "j", "k", "H", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "I", "J", "w", "x", "K", "L", "y", "z", "A", "B", "C", "M", "N", "D", "E", "O"});
            }
            if (i2 == 3) {
                return new dthb();
            }
            if (i2 == 4) {
                return new dtha();
            }
            if (i2 == 5) {
                return F;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.P = b;
                return null;
            }
            dssr<dthb> dssrVar = Q;
            if (dssrVar == null) {
                synchronized (dthb.class) {
                    dssrVar = Q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(F);
                        Q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.P);
    }
}
