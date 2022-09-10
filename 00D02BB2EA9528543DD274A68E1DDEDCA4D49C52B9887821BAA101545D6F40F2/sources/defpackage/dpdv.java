package defpackage;
/* compiled from: PG */
/* renamed from: dpdv  reason: default package */
/* loaded from: classes6.dex */
public final class dpdv extends dsqw<dpdv, dpdu> implements dssk {
    public static final dpdv e;
    private static volatile dssr<dpdv> h;
    private int f;
    private byte g = 2;
    public String a = "";
    public dsrj<dpce> b = dssu.b;
    public String c = "";
    public String d = "";

    static {
        dpdv dpdvVar = new dpdv();
        e = dpdvVar;
        dsqw.cc(dpdv.class, dpdvVar);
    }

    private dpdv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004Л", new Object[]{"f", "a", "c", "d", "b", dpce.class});
            }
            if (i2 == 3) {
                return new dpdv();
            }
            if (i2 == 4) {
                return new dpdu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dpdv> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dpdv.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
