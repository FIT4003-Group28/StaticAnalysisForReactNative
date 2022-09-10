package defpackage;
/* compiled from: PG */
/* renamed from: diqh  reason: default package */
/* loaded from: classes6.dex */
public final class diqh extends dsqw<diqh, diqg> implements dssk {
    public static final diqh a;
    private static volatile dssr<diqh> b;

    static {
        diqh diqhVar = new diqh();
        a = diqhVar;
        dsqw.cc(diqh.class, diqhVar);
    }

    private diqh() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diqh();
            }
            if (i2 == 4) {
                return new diqg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diqh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (diqh.class) {
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
