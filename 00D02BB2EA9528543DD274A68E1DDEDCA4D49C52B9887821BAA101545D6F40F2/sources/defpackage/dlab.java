package defpackage;
/* compiled from: PG */
/* renamed from: dlab  reason: default package */
/* loaded from: classes6.dex */
public final class dlab extends dsqw<dlab, dlaa> implements dssk {
    public static final dlab a;
    private static volatile dssr<dlab> b;

    static {
        dlab dlabVar = new dlab();
        a = dlabVar;
        dsqw.cc(dlab.class, dlabVar);
    }

    private dlab() {
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
                return new dlab();
            }
            if (i2 == 4) {
                return new dlaa();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlab> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlab.class) {
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
