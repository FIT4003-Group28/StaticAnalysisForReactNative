package defpackage;
/* compiled from: PG */
/* renamed from: dvte  reason: default package */
/* loaded from: classes6.dex */
public final class dvte extends dsqw<dvte, dvtb> implements dssk {
    public static final dvte c;
    private static volatile dssr<dvte> f;
    public int a;
    private int d;
    private byte e = 2;
    public String b = "";

    static {
        dvte dvteVar = new dvte();
        c = dvteVar;
        dsqw.cc(dvte.class, dvteVar);
    }

    private dvte() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", dvtc.a, "b"});
            }
            if (i2 == 3) {
                return new dvte();
            }
            if (i2 == 4) {
                return new dvtb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dvte> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvte.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
