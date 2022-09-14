package defpackage;
/* compiled from: PG */
/* renamed from: dsww  reason: default package */
/* loaded from: classes6.dex */
public final class dsww extends dsqw<dsww, dswv> implements dssk {
    public static final dsww a;
    private static volatile dssr<dsww> b;

    static {
        dsww dswwVar = new dsww();
        a = dswwVar;
        dsqw.cc(dsww.class, dswwVar);
    }

    private dsww() {
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
                return new dsww();
            }
            if (i2 == 4) {
                return new dswv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsww> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dsww.class) {
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
