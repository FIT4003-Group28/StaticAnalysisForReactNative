package defpackage;
/* compiled from: PG */
/* renamed from: djwy  reason: default package */
/* loaded from: classes6.dex */
public final class djwy extends dsqw<djwy, djwv> implements dssk {
    public static final djwy k;
    private static volatile dssr<djwy> n;
    public int a;
    public Object c;
    public long f;
    public int i;
    private dnqh l;
    public int b = 0;
    private byte m = 2;
    public String d = "";
    public String e = "";
    public String g = "";
    public String h = "";
    public String j = "";

    static {
        djwy djwyVar = new djwy();
        k = djwyVar;
        dsqw.cc(djwy.class, djwyVar);
    }

    private djwy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\n\u0001\u0001\u0001\u000e\n\u0000\u0000\u0001\u0001ဿ\u0000\u0002ဈ\r\u0003ဈ\u0003\u0004ဂ\u0004\bဈ\u0006\tဿ\u0000\nဈ\u0002\fဌ\u0007\rဈ\u0005\u000eᐉ\t", new Object[]{"c", "b", "a", dpyy.c(), "j", "e", "f", "h", djwx.a, "d", "i", djww.a, "g", "l"});
            }
            if (i2 == 3) {
                return new djwy();
            }
            if (i2 == 4) {
                return new djwv();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            dssr<djwy> dssrVar = n;
            if (dssrVar == null) {
                synchronized (djwy.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.m);
    }
}
