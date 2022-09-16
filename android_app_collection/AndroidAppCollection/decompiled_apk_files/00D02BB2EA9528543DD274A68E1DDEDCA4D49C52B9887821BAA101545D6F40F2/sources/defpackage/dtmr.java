package defpackage;
/* compiled from: PG */
/* renamed from: dtmr  reason: default package */
/* loaded from: classes6.dex */
public final class dtmr extends dsqs<dtmr, dtmq> implements dsqt {
    public static final dtmr o;
    private static volatile dssr<dtmr> s;
    public int a;
    public int b;
    public long c;
    public dtmv e;
    public dtkj g;
    public long h;
    public dtod i;
    public dthb j;
    public dthj n;
    private dtro p;
    private dtmx q;
    private byte r = 2;
    public dsrj<dtqu> d = dssu.b;
    public dsrj<dtid> f = dssu.b;
    public dsrj<dtoh> k = dssu.b;
    public dsrj<dthx> l = dssu.b;
    public String m = "";

    static {
        dtmr dtmrVar = new dtmr();
        o = dtmrVar;
        dsqw.cc(dtmr.class, dtmrVar);
    }

    private dtmr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(o, "\u0001\u000f\u0000\u0001\u0002ϩ\u000f\u0000\u0004\b\u0002Л\u0003ဉ\u0004\u0004ᐉ\b\u0005\u001b\bင\u0001\fဂ\u0007\rЛ\u000eဃ\u0002\u000fᐉ\u0012\u0010ᐉ\t\u0011ဈ\u000b\u0012Л\u0016ᐉ\u0005\u0018ဉ\rϩᐉ\u000e", new Object[]{"a", "f", dtid.class, "e", "i", "d", dtqu.class, "b", "h", "l", dthx.class, "c", "q", "j", "m", "k", dtoh.class, "g", "n", "p"});
            }
            if (i2 == 3) {
                return new dtmr();
            }
            if (i2 == 4) {
                return new dtmq();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            }
            dssr<dtmr> dssrVar = s;
            if (dssrVar == null) {
                synchronized (dtmr.class) {
                    dssrVar = s;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        s = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.r);
    }
}
