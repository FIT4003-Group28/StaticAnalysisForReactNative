package defpackage;
/* compiled from: PG */
/* renamed from: dwxl  reason: default package */
/* loaded from: classes6.dex */
public final class dwxl extends dsqw<dwxl, dwxk> implements dssk {
    public static final dwxl d;
    private static volatile dssr<dwxl> f;
    public int a;
    private byte e = 2;
    public dsrj<dwxj> b = dssu.b;
    public String c = "";

    static {
        dwxl dwxlVar = new dwxl();
        d = dwxlVar;
        dsqw.cc(dwxl.class, dwxlVar);
    }

    private dwxl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000", new Object[]{"a", "b", dwxj.class, "c"});
            }
            if (i2 == 3) {
                return new dwxl();
            }
            if (i2 == 4) {
                return new dwxk();
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
            dssr<dwxl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwxl.class) {
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
