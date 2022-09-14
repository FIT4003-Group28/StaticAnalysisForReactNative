package defpackage;
/* compiled from: PG */
/* renamed from: dlrs  reason: default package */
/* loaded from: classes6.dex */
public final class dlrs extends dsqw<dlrs, dlrr> implements dssk {
    public static final dlrs a;
    private static volatile dssr<dlrs> b;

    static {
        dlrs dlrsVar = new dlrs();
        a = dlrsVar;
        dsqw.cc(dlrs.class, dlrsVar);
    }

    private dlrs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlrs();
            }
            if (i2 == 4) {
                return new dlrr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlrs> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlrs.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
