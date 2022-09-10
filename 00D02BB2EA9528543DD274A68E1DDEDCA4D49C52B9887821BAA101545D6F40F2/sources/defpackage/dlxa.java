package defpackage;
/* compiled from: PG */
/* renamed from: dlxa  reason: default package */
/* loaded from: classes.dex */
public final class dlxa extends dsqw<dlxa, dlwz> implements dssk {
    public static final dlxa f;
    private static volatile dssr<dlxa> g;
    public int a;
    public dlwa b;
    public dlwy c;
    public dlxo d;
    public dlwy e;

    static {
        dlxa dlxaVar = new dlxa();
        f = dlxaVar;
        dsqw.cc(dlxa.class, dlxaVar);
    }

    private dlxa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dlxa();
            }
            if (i2 == 4) {
                return new dlwz();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlxa> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlxa.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
