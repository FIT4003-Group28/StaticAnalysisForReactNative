package defpackage;
/* compiled from: PG */
/* renamed from: dlqi  reason: default package */
/* loaded from: classes6.dex */
public final class dlqi extends dsqw<dlqi, dlqh> implements dssk {
    public static final dlqi c;
    private static volatile dssr<dlqi> e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        dlqi dlqiVar = new dlqi();
        c = dlqiVar;
        dsqw.cc(dlqi.class, dlqiVar);
    }

    private dlqi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dlqi();
            }
            if (i2 == 4) {
                return new dlqh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlqi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlqi.class) {
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
