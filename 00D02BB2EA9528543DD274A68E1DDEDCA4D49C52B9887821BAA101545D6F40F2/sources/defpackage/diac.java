package defpackage;
/* compiled from: PG */
/* renamed from: diac  reason: default package */
/* loaded from: classes6.dex */
public final class diac extends dsqw<diac, diab> implements dssk {
    public static final diac a;
    private static volatile dssr<diac> b;

    static {
        diac diacVar = new diac();
        a = diacVar;
        dsqw.cc(diac.class, diacVar);
    }

    private diac() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diac();
            }
            if (i2 == 4) {
                return new diab();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diac> dssrVar = b;
            if (dssrVar == null) {
                synchronized (diac.class) {
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
