package defpackage;
/* compiled from: PG */
/* renamed from: dtse  reason: default package */
/* loaded from: classes6.dex */
public final class dtse extends dsqw<dtse, dtsd> implements dssk {
    public static final dtse a;
    private static volatile dssr<dtse> e;
    private int b;
    private dtsg c;
    private byte d = 2;

    static {
        dtse dtseVar = new dtse();
        a = dtseVar;
        dsqw.cc(dtse.class, dtseVar);
    }

    private dtse() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᔉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dtse();
            }
            if (i2 == 4) {
                return new dtsd();
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
            dssr<dtse> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtse.class) {
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
