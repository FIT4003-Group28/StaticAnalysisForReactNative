package defpackage;
/* compiled from: PG */
/* renamed from: dmd  reason: default package */
/* loaded from: classes6.dex */
public final class dmd extends dsqw<dmd, dma> implements dssk {
    public static final dmd b;
    private static volatile dssr<dmd> d;
    private byte c = 2;
    public dsrj<dmc> a = dssu.b;

    static {
        dmd dmdVar = new dmd();
        b = dmdVar;
        dsqw.cc(dmd.class, dmdVar);
    }

    private dmd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dmc.class});
            }
            if (i2 == 3) {
                return new dmd();
            }
            if (i2 == 4) {
                return new dma();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dmd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmd.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
