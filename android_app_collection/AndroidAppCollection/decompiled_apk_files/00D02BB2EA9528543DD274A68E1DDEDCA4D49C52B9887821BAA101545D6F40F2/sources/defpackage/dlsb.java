package defpackage;
/* compiled from: PG */
/* renamed from: dlsb  reason: default package */
/* loaded from: classes6.dex */
public final class dlsb extends dsqw<dlsb, dlry> implements dssk {
    public static final dlsb b;
    private static volatile dssr<dlsb> c;
    public dsrj<dlsa> a = dssu.b;

    static {
        dlsb dlsbVar = new dlsb();
        b = dlsbVar;
        dsqw.cc(dlsb.class, dlsbVar);
    }

    private dlsb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", dlsa.class});
            }
            if (i2 == 3) {
                return new dlsb();
            }
            if (i2 == 4) {
                return new dlry();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlsb> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlsb.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
