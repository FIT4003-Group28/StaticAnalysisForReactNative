package defpackage;
/* compiled from: PG */
/* renamed from: dwzq  reason: default package */
/* loaded from: classes6.dex */
public final class dwzq extends dsqw<dwzq, dwzp> implements dssk {
    public static final dwzq d;
    private static volatile dssr<dwzq> f;
    public int a;
    public int b;
    public int c;
    private byte e = 2;

    static {
        dwzq dwzqVar = new dwzq();
        d = dwzqVar;
        dsqw.cc(dwzq.class, dwzqVar);
    }

    private dwzq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwzq();
            }
            if (i2 == 4) {
                return new dwzp();
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
            dssr<dwzq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwzq.class) {
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
