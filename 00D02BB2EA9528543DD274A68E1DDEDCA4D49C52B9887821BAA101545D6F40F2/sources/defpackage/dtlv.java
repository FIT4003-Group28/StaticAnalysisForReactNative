package defpackage;
/* compiled from: PG */
/* renamed from: dtlv  reason: default package */
/* loaded from: classes6.dex */
public final class dtlv extends dsqs<dtlv, dtls> implements dsqt {
    public static final dtlv f;
    private static volatile dssr<dtlv> k;
    public int d;
    public int e;
    private int g;
    private dgrh h;
    private dtox i;
    private byte j = 2;
    public String a = "";
    public String b = "";
    public String c = "";

    static {
        dtlv dtlvVar = new dtlv();
        f = dtlvVar;
        dsqw.cc(dtlv.class, dtlvVar);
    }

    private dtlv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0005\u0005င\u0004\bဈ\u0002\nᐉ\u0007\rᐉ\t", new Object[]{"g", "a", "b", "e", dtlt.a, "d", "c", "h", "i"});
            }
            if (i2 == 3) {
                return new dtlv();
            }
            if (i2 == 4) {
                return new dtls();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dtlv> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dtlv.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
