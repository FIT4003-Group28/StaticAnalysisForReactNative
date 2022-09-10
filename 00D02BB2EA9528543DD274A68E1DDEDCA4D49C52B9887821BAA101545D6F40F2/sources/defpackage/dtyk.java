package defpackage;
/* compiled from: PG */
/* renamed from: dtyk  reason: default package */
/* loaded from: classes6.dex */
public final class dtyk extends dsqw<dtyk, dtyj> implements dssk {
    public static final dtyk a;
    private static volatile dssr<dtyk> e;
    private int b;
    private int c;
    private byte d = 2;

    static {
        dtyk dtykVar = new dtyk();
        a = dtykVar;
        dsqw.cc(dtyk.class, dtykVar);
    }

    private dtyk() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᔄ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dtyk();
            }
            if (i2 == 4) {
                return new dtyj();
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
            dssr<dtyk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtyk.class) {
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
