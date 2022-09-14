package defpackage;
/* compiled from: PG */
/* renamed from: dlku  reason: default package */
/* loaded from: classes6.dex */
public final class dlku extends dsqw<dlku, dlkt> implements dssk {
    public static final dlku e;
    private static volatile dssr<dlku> f;
    public int a;
    public String b = "";
    public int c;
    public int d;

    static {
        dlku dlkuVar = new dlku();
        e = dlkuVar;
        dsqw.cc(dlku.class, dlkuVar);
    }

    private dlku() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဆ\u0001\u0003ဆ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dlku();
            }
            if (i2 == 4) {
                return new dlkt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlku> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlku.class) {
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
