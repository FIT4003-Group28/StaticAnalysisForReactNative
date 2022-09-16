package defpackage;
/* compiled from: PG */
/* renamed from: dlhy  reason: default package */
/* loaded from: classes6.dex */
public final class dlhy extends dsqw<dlhy, dlhv> implements dssk {
    public static final dlhy b;
    private static volatile dssr<dlhy> d;
    public dlhx a;
    private int c;

    static {
        dlhy dlhyVar = new dlhy();
        b = dlhyVar;
        dsqw.cc(dlhy.class, dlhyVar);
    }

    private dlhy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlhy();
            }
            if (i2 == 4) {
                return new dlhv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlhy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlhy.class) {
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
