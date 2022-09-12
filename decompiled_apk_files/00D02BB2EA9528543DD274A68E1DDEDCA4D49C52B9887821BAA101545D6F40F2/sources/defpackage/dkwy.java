package defpackage;
/* compiled from: PG */
/* renamed from: dkwy  reason: default package */
/* loaded from: classes6.dex */
public final class dkwy extends dsqw<dkwy, dkwx> implements dssk {
    public static final dkwy c;
    private static volatile dssr<dkwy> e;
    public int a = 1;
    public int b = 100;
    private int d;

    static {
        dkwy dkwyVar = new dkwy();
        c = dkwyVar;
        dsqw.cc(dkwy.class, dkwyVar);
    }

    private dkwy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"d", "a", doyd.c(), "b"});
            }
            if (i2 == 3) {
                return new dkwy();
            }
            if (i2 == 4) {
                return new dkwx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkwy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkwy.class) {
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
