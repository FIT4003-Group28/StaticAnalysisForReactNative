package defpackage;
/* compiled from: PG */
/* renamed from: dayp  reason: default package */
/* loaded from: classes5.dex */
public final class dayp extends dsqw<dayp, dayo> implements dssk {
    public static final dayp c;
    private static volatile dssr<dayp> d;
    public int a;
    public daxu b;

    static {
        dayp daypVar = new dayp();
        c = daypVar;
        dsqw.cc(dayp.class, daypVar);
    }

    private dayp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dayp();
            }
            if (i2 == 4) {
                return new dayo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dayp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dayp.class) {
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