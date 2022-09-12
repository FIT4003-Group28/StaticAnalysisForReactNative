package defpackage;
/* compiled from: PG */
/* renamed from: dleh  reason: default package */
/* loaded from: classes6.dex */
public final class dleh extends dsqw<dleh, dleg> implements dssk {
    public static final dleh c;
    private static volatile dssr<dleh> d;
    public int a;
    public int b;

    static {
        dleh dlehVar = new dleh();
        c = dlehVar;
        dsqw.cc(dleh.class, dlehVar);
    }

    private dleh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dleh();
            }
            if (i2 == 4) {
                return new dleg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dleh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dleh.class) {
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
