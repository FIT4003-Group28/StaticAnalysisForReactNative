package defpackage;
/* compiled from: PG */
/* renamed from: ddlp  reason: default package */
/* loaded from: classes5.dex */
public final class ddlp extends dsqw<ddlp, ddlo> implements dssk {
    public static final ddlp d;
    private static volatile dssr<ddlp> f;
    public int a;
    public ddme b;
    public ddxz c;
    private byte e = 2;

    static {
        ddlp ddlpVar = new ddlp();
        d = ddlpVar;
        dsqw.cc(ddlp.class, ddlpVar);
    }

    private ddlp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddlp();
            }
            if (i2 == 4) {
                return new ddlo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<ddlp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddlp.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
