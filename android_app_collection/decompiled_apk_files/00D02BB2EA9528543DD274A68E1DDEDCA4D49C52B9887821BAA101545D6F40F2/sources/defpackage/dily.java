package defpackage;
/* compiled from: PG */
/* renamed from: dily  reason: default package */
/* loaded from: classes6.dex */
public final class dily extends dsqw<dily, dilx> implements dssk {
    public static final dily a;
    private static volatile dssr<dily> b;

    static {
        dily dilyVar = new dily();
        a = dilyVar;
        dsqw.cc(dily.class, dilyVar);
    }

    private dily() {
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
                return new dily();
            }
            if (i2 == 4) {
                return new dilx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dily> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dily.class) {
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
