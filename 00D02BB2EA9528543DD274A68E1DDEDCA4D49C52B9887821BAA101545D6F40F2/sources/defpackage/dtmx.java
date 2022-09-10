package defpackage;
/* compiled from: PG */
/* renamed from: dtmx  reason: default package */
/* loaded from: classes6.dex */
public final class dtmx extends dsqw<dtmx, dtmw> implements dssk {
    public static final dtmx a;
    private static volatile dssr<dtmx> e;
    private int b;
    private dthb c;
    private byte d = 2;

    static {
        dtmx dtmxVar = new dtmx();
        a = dtmxVar;
        dsqw.cc(dtmx.class, dtmxVar);
    }

    private dtmx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dtmx();
            }
            if (i2 == 4) {
                return new dtmw();
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
            dssr<dtmx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtmx.class) {
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
