package defpackage;
/* compiled from: PG */
/* renamed from: dlad  reason: default package */
/* loaded from: classes6.dex */
public final class dlad extends dsqw<dlad, dlac> implements dssk {
    public static final dlad b;
    private static volatile dssr<dlad> d;
    public drco a;
    private int c;

    static {
        dlad dladVar = new dlad();
        b = dladVar;
        dsqw.cc(dlad.class, dladVar);
    }

    private dlad() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlad();
            }
            if (i2 == 4) {
                return new dlac();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlad> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlad.class) {
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
