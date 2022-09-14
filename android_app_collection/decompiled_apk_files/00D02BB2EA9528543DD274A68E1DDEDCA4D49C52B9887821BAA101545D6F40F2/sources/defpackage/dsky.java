package defpackage;
/* compiled from: PG */
/* renamed from: dsky  reason: default package */
/* loaded from: classes6.dex */
public final class dsky extends dsqw<dsky, dskx> implements dssk {
    public static final dsky a;
    private static volatile dssr<dsky> b;

    static {
        dsky dskyVar = new dsky();
        a = dskyVar;
        dsqw.cc(dsky.class, dskyVar);
    }

    private dsky() {
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
                return new dsky();
            }
            if (i2 == 4) {
                return new dskx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsky> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dsky.class) {
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
