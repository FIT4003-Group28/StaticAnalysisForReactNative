package defpackage;
/* compiled from: PG */
/* renamed from: dwxp  reason: default package */
/* loaded from: classes6.dex */
public final class dwxp extends dsqw<dwxp, dwxo> implements dssk {
    public static final dwxp d;
    private static volatile dssr<dwxp> f;
    public int a;
    public dwxl b;
    private byte e = 2;
    public dsrj<dvdd> c = dssu.b;

    static {
        dwxp dwxpVar = new dwxp();
        d = dwxpVar;
        dsqw.cc(dwxp.class, dwxpVar);
    }

    private dwxp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dvdd.class});
            }
            if (i2 == 3) {
                return new dwxp();
            }
            if (i2 == 4) {
                return new dwxo();
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
            dssr<dwxp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwxp.class) {
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
