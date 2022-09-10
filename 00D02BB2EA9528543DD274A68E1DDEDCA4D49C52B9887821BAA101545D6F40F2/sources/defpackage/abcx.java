package defpackage;
/* compiled from: PG */
/* renamed from: abcx  reason: default package */
/* loaded from: classes2.dex */
public final class abcx extends dsqw<abcx, abcv> implements dssk {
    public static final abcx j;
    private static volatile dssr<abcx> k;
    public int a;
    public dssd<String, dqpy> i = dssd.b;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        abcx abcxVar = new abcx();
        j = abcxVar;
        dsqw.cc(abcx.class, abcxVar);
    }

    private abcx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\b\b\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b2", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", abcw.a});
            }
            if (i2 == 3) {
                return new abcx();
            }
            if (i2 == 4) {
                return new abcv();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<abcx> dssrVar = k;
            if (dssrVar == null) {
                synchronized (abcx.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
