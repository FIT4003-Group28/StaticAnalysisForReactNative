package defpackage;
/* compiled from: PG */
/* renamed from: ddyw  reason: default package */
/* loaded from: classes6.dex */
public final class ddyw extends dsqw<ddyw, ddyv> implements dssk {
    public static final ddyw j;
    private static volatile dssr<ddyw> l;
    public int a;
    public ddyb b;
    public int d;
    public int g;
    public ddzc i;
    private byte k = 2;
    public String c = "";
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        ddyw ddywVar = new ddyw();
        j = ddywVar;
        dsqw.cc(ddyw.class, ddywVar);
    }

    private ddyw() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0007\bᐉ\t\rင\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "h", "i", "g"});
            }
            if (i2 == 3) {
                return new ddyw();
            }
            if (i2 == 4) {
                return new ddyv();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<ddyw> dssrVar = l;
            if (dssrVar == null) {
                synchronized (ddyw.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
