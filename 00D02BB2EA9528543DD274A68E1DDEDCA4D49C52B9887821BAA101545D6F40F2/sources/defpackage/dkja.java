package defpackage;
/* compiled from: PG */
/* renamed from: dkja  reason: default package */
/* loaded from: classes.dex */
public final class dkja extends dsqw<dkja, dkiz> implements dssk {
    public static final dkja a;
    private static volatile dssr<dkja> b;

    static {
        dkja dkjaVar = new dkja();
        a = dkjaVar;
        dsqw.cc(dkja.class, dkjaVar);
    }

    private dkja() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkja();
            }
            if (i2 == 4) {
                return new dkiz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkja> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkja.class) {
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
