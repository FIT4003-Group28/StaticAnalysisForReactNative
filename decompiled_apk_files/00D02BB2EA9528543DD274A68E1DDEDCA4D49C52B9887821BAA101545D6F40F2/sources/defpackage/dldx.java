package defpackage;
/* compiled from: PG */
/* renamed from: dldx  reason: default package */
/* loaded from: classes6.dex */
public final class dldx extends dsqw<dldx, dldu> implements dssk {
    public static final dldx g;
    private static volatile dssr<dldx> j;
    private int h;
    private byte i = 2;
    public String a = "";
    public String b = "";
    public dsrj<dlcx> c = dssu.b;
    public dsrj<dldw> d = dssu.b;
    public String e = "";
    public String f = "";

    static {
        dldx dldxVar = new dldx();
        g = dldxVar;
        dsqw.cc(dldx.class, dldxVar);
    }

    private dldx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л\u0004\u001b\u0007ဈ\u0004\bဈ\u0005", new Object[]{"h", "a", "b", "c", dlcx.class, "d", dldw.class, "e", "f"});
            }
            if (i2 == 3) {
                return new dldx();
            }
            if (i2 == 4) {
                return new dldu();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dldx> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dldx.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
