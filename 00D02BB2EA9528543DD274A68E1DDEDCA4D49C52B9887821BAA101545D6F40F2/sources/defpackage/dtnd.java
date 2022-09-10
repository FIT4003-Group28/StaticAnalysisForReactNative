package defpackage;
/* compiled from: PG */
/* renamed from: dtnd  reason: default package */
/* loaded from: classes6.dex */
public final class dtnd extends dsqs<dtnd, dtnc> implements dsqt {
    public static final dtnd l;
    private static volatile dssr<dtnd> q;
    public int a;
    public dtre b;
    public dtqg c;
    public dtmp d;
    public dtjb e;
    public dtjt f;
    public dtox g;
    public doow h;
    private dtmz m;
    private dtro n;
    private dtop o;
    private byte p = 2;
    public String i = "";
    public String j = "";
    public String k = "";

    static {
        dtnd dtndVar = new dtnd();
        l = dtndVar;
        dsqw.cc(dtnd.class, dtndVar);
    }

    private dtnd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\r\u0000\u0001\u0001Ϫ\r\u0000\u0000\u0006\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\tᐉ\u0005\nဈ\u000b\rဈ\n\u0013ဈ\f/ᐉ\t1ᐉ\u00073ဉ\bϩᐉ\rϪᐉ\u000e", new Object[]{"a", "b", "c", "d", "e", "f", "j", "i", "k", "m", "g", "h", "n", "o"});
            }
            if (i2 == 3) {
                return new dtnd();
            }
            if (i2 == 4) {
                return new dtnc();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            }
            dssr<dtnd> dssrVar = q;
            if (dssrVar == null) {
                synchronized (dtnd.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.p);
    }
}
