package defpackage;
/* compiled from: PG */
/* renamed from: dxaq  reason: default package */
/* loaded from: classes6.dex */
public final class dxaq extends dsqw<dxaq, dxap> implements dssk {
    public static final dxaq a;
    private static volatile dssr<dxaq> e;
    private int b;
    private long c;
    private byte d = 2;

    static {
        dxaq dxaqVar = new dxaq();
        a = dxaqVar;
        dsqw.cc(dxaq.class, dxaqVar);
    }

    private dxaq() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔂ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dxaq();
            }
            if (i2 == 4) {
                return new dxap();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dxaq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxaq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
