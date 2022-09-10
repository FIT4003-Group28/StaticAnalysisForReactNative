package defpackage;
/* compiled from: PG */
/* renamed from: dwzs  reason: default package */
/* loaded from: classes6.dex */
public final class dwzs extends dsqw<dwzs, dwzr> implements dssk {
    public static final dwzs a;
    private static volatile dssr<dwzs> g;
    private int b;
    private int c;
    private int d;
    private int e;
    private byte f = 2;

    static {
        dwzs dwzsVar = new dwzs();
        a = dwzsVar;
        dsqw.cc(dwzs.class, dwzsVar);
    }

    private dwzs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002", new Object[]{"b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dwzs();
            }
            if (i2 == 4) {
                return new dwzr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dwzs> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwzs.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
