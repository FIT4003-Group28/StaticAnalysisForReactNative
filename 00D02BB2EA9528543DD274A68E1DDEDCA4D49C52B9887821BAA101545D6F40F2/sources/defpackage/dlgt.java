package defpackage;
/* compiled from: PG */
/* renamed from: dlgt  reason: default package */
/* loaded from: classes6.dex */
public final class dlgt extends dsqw<dlgt, dlgs> implements dssk {
    public static final dlgt b;
    private static volatile dssr<dlgt> d;
    public dqyj a;
    private int c;

    static {
        dlgt dlgtVar = new dlgt();
        b = dlgtVar;
        dsqw.cc(dlgt.class, dlgtVar);
    }

    private dlgt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlgt();
            }
            if (i2 == 4) {
                return new dlgs();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlgt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlgt.class) {
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
