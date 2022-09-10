package defpackage;
/* compiled from: PG */
/* renamed from: dvbb  reason: default package */
/* loaded from: classes6.dex */
public final class dvbb extends dsqw<dvbb, duzr> implements dssk {
    public static final dvbb e;
    private static volatile dssr<dvbb> g;
    public int a;
    public dqfw d;
    private byte f = 2;
    public dsrj<duzv> b = dssu.b;
    public String c = "";

    static {
        dvbb dvbbVar = new dvbb();
        e = dvbbVar;
        dsqw.cc(dvbb.class, dvbbVar);
    }

    private dvbb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", duzv.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dvbb();
            }
            if (i2 == 4) {
                return new duzr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dvbb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvbb.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
