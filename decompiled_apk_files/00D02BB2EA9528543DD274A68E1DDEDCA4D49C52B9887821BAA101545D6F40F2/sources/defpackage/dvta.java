package defpackage;
/* compiled from: PG */
/* renamed from: dvta  reason: default package */
/* loaded from: classes6.dex */
public final class dvta extends dsqw<dvta, dvsz> implements dssk {
    public static final dvta c;
    private static volatile dssr<dvta> e;
    public int a;
    private byte d = 2;
    public String b = "";

    static {
        dvta dvtaVar = new dvta();
        c = dvtaVar;
        dsqw.cc(dvta.class, dvtaVar);
    }

    private dvta() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvta();
            }
            if (i2 == 4) {
                return new dvsz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dvta> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvta.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
