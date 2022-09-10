package defpackage;
/* compiled from: PG */
/* renamed from: dxtp  reason: default package */
/* loaded from: classes6.dex */
public final class dxtp extends dsqw<dxtp, dxto> implements dssk {
    public static final dxtp c;
    private static volatile dssr<dxtp> d;
    public dxwi a;
    public dsrj<dxwg> b;

    static {
        dxtp dxtpVar = new dxtp();
        c = dxtpVar;
        dsqw.cc(dxtp.class, dxtpVar);
    }

    private dxtp() {
        dssu<Object> dssuVar = dssu.b;
        this.b = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0001\u0000\u0001\t\u0004\u001b", new Object[]{"a", "b", dxwg.class});
            }
            if (i2 == 3) {
                return new dxtp();
            }
            if (i2 == 4) {
                return new dxto();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxtp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxtp.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
