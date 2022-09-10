package defpackage;
/* compiled from: PG */
/* renamed from: dogv  reason: default package */
/* loaded from: classes6.dex */
public final class dogv extends dsqw<dogv, dogu> implements dssk {
    public static final dogv a;
    private static volatile dssr<dogv> b;

    static {
        dogv dogvVar = new dogv();
        a = dogvVar;
        dsqw.cc(dogv.class, dogvVar);
    }

    private dogv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dogv();
            }
            if (i2 == 4) {
                return new dogu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dogv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dogv.class) {
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
