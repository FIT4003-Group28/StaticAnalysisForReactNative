package defpackage;
/* compiled from: PG */
/* renamed from: dlre  reason: default package */
/* loaded from: classes6.dex */
public final class dlre extends dsqw<dlre, dlrd> implements dssk {
    public static final dlre c;
    private static volatile dssr<dlre> e;
    public int a;
    public int b;
    private int d;

    static {
        dlre dlreVar = new dlre();
        c = dlreVar;
        dsqw.cc(dlre.class, dlreVar);
    }

    private dlre() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"d", "a", dluy.c(), "b"});
            }
            if (i2 == 3) {
                return new dlre();
            }
            if (i2 == 4) {
                return new dlrd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlre> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlre.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
