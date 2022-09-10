package defpackage;
/* compiled from: PG */
/* renamed from: dsaw  reason: default package */
/* loaded from: classes6.dex */
public final class dsaw extends dsqw<dsaw, dsav> implements dssk {
    public static final dsaw a;
    private static volatile dssr<dsaw> b;

    static {
        dsaw dsawVar = new dsaw();
        a = dsawVar;
        dsqw.cc(dsaw.class, dsawVar);
    }

    private dsaw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dsaw();
            }
            if (i2 == 4) {
                return new dsav();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsaw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dsaw.class) {
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
