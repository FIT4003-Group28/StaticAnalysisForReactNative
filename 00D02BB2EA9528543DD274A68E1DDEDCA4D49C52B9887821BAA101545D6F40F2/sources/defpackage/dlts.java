package defpackage;
/* compiled from: PG */
/* renamed from: dlts  reason: default package */
/* loaded from: classes6.dex */
public final class dlts extends dsqw<dlts, dltr> implements dssk {
    public static final dlts c;
    private static volatile dssr<dlts> e;
    public int a;
    public long b;
    private int d;

    static {
        dlts dltsVar = new dlts();
        c = dltsVar;
        dsqw.cc(dlts.class, dltsVar);
    }

    private dlts() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dlts();
            }
            if (i2 == 4) {
                return new dltr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlts> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlts.class) {
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
