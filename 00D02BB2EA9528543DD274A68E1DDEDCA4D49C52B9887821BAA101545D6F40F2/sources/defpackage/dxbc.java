package defpackage;
/* compiled from: PG */
/* renamed from: dxbc  reason: default package */
/* loaded from: classes6.dex */
public final class dxbc extends dsqw<dxbc, dxbb> implements dssk {
    public static final dxbc b;
    private static volatile dssr<dxbc> d;
    private byte c = 2;
    public dsrj<dxbr> a = dssu.b;

    static {
        dxbc dxbcVar = new dxbc();
        b = dxbcVar;
        dsqw.cc(dxbc.class, dxbcVar);
    }

    private dxbc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dxbr.class});
            }
            if (i2 == 3) {
                return new dxbc();
            }
            if (i2 == 4) {
                return new dxbb();
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
            dssr<dxbc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxbc.class) {
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
