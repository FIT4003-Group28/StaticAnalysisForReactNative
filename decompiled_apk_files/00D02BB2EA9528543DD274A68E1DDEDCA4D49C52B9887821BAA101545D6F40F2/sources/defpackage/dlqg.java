package defpackage;
/* compiled from: PG */
/* renamed from: dlqg  reason: default package */
/* loaded from: classes6.dex */
public final class dlqg extends dsqw<dlqg, dlpy> implements dssk {
    public static final dlqg c;
    private static volatile dssr<dlqg> d;
    public int a = 0;
    public Object b;

    static {
        dlqg dlqgVar = new dlqg();
        c = dlqgVar;
        dsqw.cc(dlqg.class, dlqgVar);
    }

    private dlqg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", dlqf.class, dlqd.class, dlqa.class});
            }
            if (i2 == 3) {
                return new dlqg();
            }
            if (i2 == 4) {
                return new dlpy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlqg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlqg.class) {
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
