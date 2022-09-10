package defpackage;
/* compiled from: PG */
/* renamed from: domb  reason: default package */
/* loaded from: classes6.dex */
public final class domb extends dsqw<domb, dolw> implements dssk {
    public static final domb b;
    private static volatile dssr<domb> c;
    public dsrj<doma> a = dssu.b;

    static {
        domb dombVar = new domb();
        b = dombVar;
        dsqw.cc(domb.class, dombVar);
    }

    private domb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", doma.class});
            }
            if (i2 == 3) {
                return new domb();
            }
            if (i2 == 4) {
                return new dolw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<domb> dssrVar = c;
            if (dssrVar == null) {
                synchronized (domb.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
