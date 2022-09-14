package defpackage;
/* compiled from: PG */
/* renamed from: dnal  reason: default package */
/* loaded from: classes6.dex */
public final class dnal extends dsqw<dnal, dnak> implements dssk {
    public static final dnal a;
    private static volatile dssr<dnal> b;

    static {
        dnal dnalVar = new dnal();
        a = dnalVar;
        dsqw.cc(dnal.class, dnalVar);
    }

    private dnal() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnal();
            }
            if (i2 == 4) {
                return new dnak();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnal> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnal.class) {
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
