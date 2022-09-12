package defpackage;
/* compiled from: PG */
/* renamed from: dlml  reason: default package */
/* loaded from: classes6.dex */
public final class dlml extends dsqw<dlml, dlmi> implements dssk {
    public static final dlml b;
    private static volatile dssr<dlml> d;
    public int a;
    private int c;

    static {
        dlml dlmlVar = new dlml();
        b = dlmlVar;
        dsqw.cc(dlml.class, dlmlVar);
    }

    private dlml() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dlmj.a});
            }
            if (i2 == 3) {
                return new dlml();
            }
            if (i2 == 4) {
                return new dlmi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlml> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlml.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
