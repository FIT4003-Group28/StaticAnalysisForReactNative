package defpackage;
/* compiled from: PG */
/* renamed from: cbud  reason: default package */
/* loaded from: classes4.dex */
public final class cbud extends dsqw<cbud, cbuc> implements dssk {
    public static final cbud b;
    private static volatile dssr<cbud> d;
    public cbts a;
    private int c;

    static {
        cbud cbudVar = new cbud();
        b = cbudVar;
        dsqw.cc(cbud.class, cbudVar);
    }

    private cbud() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new cbud();
            }
            if (i2 == 4) {
                return new cbuc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbud> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cbud.class) {
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
