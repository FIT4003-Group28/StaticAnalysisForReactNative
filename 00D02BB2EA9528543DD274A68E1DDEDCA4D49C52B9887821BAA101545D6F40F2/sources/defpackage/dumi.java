package defpackage;
/* compiled from: PG */
/* renamed from: dumi  reason: default package */
/* loaded from: classes.dex */
public final class dumi extends dsqw<dumi, dumh> implements dssk {
    public static final dumi a;
    private static volatile dssr<dumi> b;

    static {
        dumi dumiVar = new dumi();
        a = dumiVar;
        dsqw.cc(dumi.class, dumiVar);
    }

    private dumi() {
        dsrx dsrxVar = dsrx.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dumi();
            }
            if (i2 == 4) {
                return new dumh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dumi> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dumi.class) {
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
