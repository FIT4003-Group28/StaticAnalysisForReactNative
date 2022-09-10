package defpackage;
/* compiled from: PG */
/* renamed from: dwcw  reason: default package */
/* loaded from: classes6.dex */
public final class dwcw extends dsqw<dwcw, dwcv> implements dssk {
    public static final dwcw p;
    private static volatile dssr<dwcw> r;
    public int a;
    public dhjz b;
    public dhjx c;
    public dnzj d;
    public dvzd f;
    public boolean h;
    public dvxt i;
    public dvxv j;
    public dnqh k;
    public double l;
    public boolean m;
    public dwzu n;
    public boolean o;
    private byte q = 2;
    public dsrf e = dsqz.b;
    public boolean g = true;

    static {
        dwcw dwcwVar = new dwcw();
        p = dwcwVar;
        dsqw.cc(dwcw.class, dwcwVar);
    }

    private dwcw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(p, "\u0001\u000e\u0000\u0001\u0001\u0013\u000e\u0000\u0001\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001e\u0004ဉ\u0003\u0006ဉ\b\bᐉ\u000b\tက\f\nဉ\u000e\fဇ\u0010\rဇ\u0004\u000eဇ\u0005\u000fဉ\t\u0012ဇ\r\u0013ᐉ\u0002", new Object[]{"a", "b", "c", "e", dvxj.c(), "f", "i", "k", "l", "n", "o", "g", "h", "j", "m", "d"});
            }
            if (i2 == 3) {
                return new dwcw();
            }
            if (i2 == 4) {
                return new dwcv();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            }
            dssr<dwcw> dssrVar = r;
            if (dssrVar == null) {
                synchronized (dwcw.class) {
                    dssrVar = r;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        r = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.q);
    }
}
