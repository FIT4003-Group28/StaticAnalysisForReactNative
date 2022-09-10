package defpackage;
/* compiled from: PG */
/* renamed from: dtmh  reason: default package */
/* loaded from: classes6.dex */
public final class dtmh extends dsqw<dtmh, dtmg> implements dssk {
    public static final dtmh a;
    private static volatile dssr<dtmh> b;

    static {
        dtmh dtmhVar = new dtmh();
        a = dtmhVar;
        dsqw.cc(dtmh.class, dtmhVar);
    }

    private dtmh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtmh();
            }
            if (i2 == 4) {
                return new dtmg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtmh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtmh.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
