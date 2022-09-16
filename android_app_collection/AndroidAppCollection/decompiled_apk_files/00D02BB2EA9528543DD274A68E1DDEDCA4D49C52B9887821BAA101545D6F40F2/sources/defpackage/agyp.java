package defpackage;
/* compiled from: PG */
/* renamed from: agyp  reason: default package */
/* loaded from: classes2.dex */
public final class agyp extends dsqw<agyp, agyk> implements dssk {
    public static final agyp r;
    private static volatile dssr<agyp> t;
    public int a;
    public dirb b;
    public int c;
    public long d;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public long m;
    public agxn n;
    public boolean o;
    public boolean p;
    private byte s = 2;
    public dsrj<agym> e = dssu.b;
    public long f = Long.MAX_VALUE;
    public dspd j = dspd.b;
    public dspd k = dspd.b;
    public dsrj<String> q = dssu.b;

    static {
        agyp agypVar = new agyp();
        r = agypVar;
        dsqw.cc(agyp.class, agypVar);
    }

    private agyp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(r, "\u0001\u0010\u0000\u0001\u0001\u0016\u0010\u0000\u0002\u0002\u0001ᐉ\u0000\u0002ဌ\u0001\u0003Л\u0004ည\u0007\bင\u0004\tင\u0005\u000bဇ\t\fဂ\n\u000eင\u0006\u000fဂ\u0003\u0010ဂ\u0002\u0012ဇ\f\u0013ဉ\u000b\u0014ည\b\u0015ဇ\r\u0016\u001a", new Object[]{"a", "b", "c", agyn.a, "e", agym.class, "j", "g", "h", "l", "m", "i", "f", "d", "o", "n", "k", "p", "q"});
            }
            if (i2 == 3) {
                return new agyp();
            }
            if (i2 == 4) {
                return new agyk();
            }
            if (i2 == 5) {
                return r;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            }
            dssr<agyp> dssrVar = t;
            if (dssrVar == null) {
                synchronized (agyp.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(r);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.s);
    }
}
