package defpackage;
/* compiled from: PG */
/* renamed from: dlge  reason: default package */
/* loaded from: classes6.dex */
public final class dlge extends dsqw<dlge, dlgb> implements dssk {
    public static final dlge c;
    private static volatile dssr<dlge> d;
    public int a;
    public int b;

    static {
        dlge dlgeVar = new dlge();
        c = dlgeVar;
        dsqw.cc(dlge.class, dlgeVar);
    }

    private dlge() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0000", new Object[]{"a", "b", dlgc.a});
            }
            if (i2 == 3) {
                return new dlge();
            }
            if (i2 == 4) {
                return new dlgb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlge> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlge.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
