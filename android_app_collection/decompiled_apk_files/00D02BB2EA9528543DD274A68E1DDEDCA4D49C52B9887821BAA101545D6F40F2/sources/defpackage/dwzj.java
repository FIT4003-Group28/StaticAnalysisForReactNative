package defpackage;
/* compiled from: PG */
/* renamed from: dwzj  reason: default package */
/* loaded from: classes6.dex */
public final class dwzj extends dsqw<dwzj, dwzi> implements dssk {
    public static final dwzj d;
    private static volatile dssr<dwzj> f;
    public int a;
    public int b;
    public int c;
    private byte e = 2;

    static {
        dwzj dwzjVar = new dwzj();
        d = dwzjVar;
        dsqw.cc(dwzj.class, dwzjVar);
    }

    private dwzj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔏ\u0000\u0002ᔏ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwzj();
            }
            if (i2 == 4) {
                return new dwzi();
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
            dssr<dwzj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwzj.class) {
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
