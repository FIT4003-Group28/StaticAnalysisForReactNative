package defpackage;
/* compiled from: PG */
/* renamed from: duvx  reason: default package */
/* loaded from: classes6.dex */
public final class duvx extends dsqw<duvx, duvv> implements dssk {
    public static final duvx h;
    private static volatile dssr<duvx> k;
    public int a;
    public int b;
    public djgl d;
    public dqdk e;
    private int i;
    private byte j = 2;
    public String c = "";
    public String f = "";
    public String g = "";

    static {
        duvx duvxVar = new duvx();
        h = duvxVar;
        dsqw.cc(duvx.class, duvxVar);
    }

    private duvx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0001\u0001ဌ\u0007\u0002ဈ\u0005\u0003ဌ\u0000\u0004ဈ\u0001\u0006ဉ\u0003\u0007ဈ\u0004\bᐉ\u0002", new Object[]{"a", "i", duvw.a, "g", "b", dpvy.a, "c", "e", "f", "d"});
            }
            if (i2 == 3) {
                return new duvx();
            }
            if (i2 == 4) {
                return new duvv();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<duvx> dssrVar = k;
            if (dssrVar == null) {
                synchronized (duvx.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
