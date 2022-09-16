package defpackage;
/* compiled from: PG */
/* renamed from: dlji  reason: default package */
/* loaded from: classes6.dex */
public final class dlji extends dsqw<dlji, dljh> implements dssk {
    public static final dlji d;
    private static volatile dssr<dlji> e;
    public int a;
    public dpjx b;
    public int c;

    static {
        dlji dljiVar = new dlji();
        d = dljiVar;
        dsqw.cc(dlji.class, dljiVar);
    }

    private dlji() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", "c", dqek.c()});
            }
            if (i2 == 3) {
                return new dlji();
            }
            if (i2 == 4) {
                return new dljh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlji> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlji.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
