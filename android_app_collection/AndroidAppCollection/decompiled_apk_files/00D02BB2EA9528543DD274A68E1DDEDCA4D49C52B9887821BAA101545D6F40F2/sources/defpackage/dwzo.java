package defpackage;
/* compiled from: PG */
/* renamed from: dwzo  reason: default package */
/* loaded from: classes6.dex */
public final class dwzo extends dsqw<dwzo, dwzn> implements dssk {
    public static final dwzo f;
    private static volatile dssr<dwzo> h;
    public int a;
    public dwzq b;
    public int c;
    public int d;
    public int e;
    private byte g = 2;

    static {
        dwzo dwzoVar = new dwzo();
        f = dwzoVar;
        dsqw.cc(dwzo.class, dwzoVar);
    }

    private dwzo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔉ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dwzo();
            }
            if (i2 == 4) {
                return new dwzn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dwzo> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwzo.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
