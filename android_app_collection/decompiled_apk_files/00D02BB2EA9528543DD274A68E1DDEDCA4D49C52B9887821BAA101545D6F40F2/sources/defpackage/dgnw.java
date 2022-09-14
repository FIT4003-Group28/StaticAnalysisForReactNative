package defpackage;
/* compiled from: PG */
/* renamed from: dgnw  reason: default package */
/* loaded from: classes6.dex */
public final class dgnw extends dsqw<dgnw, dgnv> implements dssk {
    public static final dgnw a;
    private static volatile dssr<dgnw> b;

    static {
        dgnw dgnwVar = new dgnw();
        a = dgnwVar;
        dsqw.cc(dgnw.class, dgnwVar);
    }

    private dgnw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgnw();
            }
            if (i2 == 4) {
                return new dgnv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgnw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgnw.class) {
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
