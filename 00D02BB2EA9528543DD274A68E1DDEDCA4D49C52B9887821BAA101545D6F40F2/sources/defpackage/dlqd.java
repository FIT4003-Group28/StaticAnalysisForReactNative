package defpackage;
/* compiled from: PG */
/* renamed from: dlqd  reason: default package */
/* loaded from: classes6.dex */
public final class dlqd extends dsqw<dlqd, dlqb> implements dssk {
    public static final dlqd e;
    private static volatile dssr<dlqd> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        dlqd dlqdVar = new dlqd();
        e = dlqdVar;
        dsqw.cc(dlqd.class, dlqdVar);
    }

    private dlqd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", dlqc.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dlqd();
            }
            if (i2 == 4) {
                return new dlqb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlqd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlqd.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
