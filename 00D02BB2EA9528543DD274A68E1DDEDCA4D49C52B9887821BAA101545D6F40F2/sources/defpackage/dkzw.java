package defpackage;
/* compiled from: PG */
/* renamed from: dkzw  reason: default package */
/* loaded from: classes6.dex */
public final class dkzw extends dsqw<dkzw, dkzv> implements dssk {
    public static final dkzw a;
    private static volatile dssr<dkzw> b;

    static {
        dkzw dkzwVar = new dkzw();
        a = dkzwVar;
        dsqw.cc(dkzw.class, dkzwVar);
    }

    private dkzw() {
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
                return new dkzw();
            }
            if (i2 == 4) {
                return new dkzv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkzw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkzw.class) {
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
