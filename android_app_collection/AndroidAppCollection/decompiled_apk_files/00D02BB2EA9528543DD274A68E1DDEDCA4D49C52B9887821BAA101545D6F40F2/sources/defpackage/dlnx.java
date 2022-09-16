package defpackage;
/* compiled from: PG */
/* renamed from: dlnx  reason: default package */
/* loaded from: classes6.dex */
public final class dlnx extends dsqw<dlnx, dlnw> implements dssk {
    public static final dlnx c;
    private static volatile dssr<dlnx> e;
    public dsrj<dlkz> a = dssu.b;
    public boolean b;
    private int d;

    static {
        dlnx dlnxVar = new dlnx();
        c = dlnxVar;
        dsqw.cc(dlnx.class, dlnxVar);
    }

    private dlnx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"d", "a", dlkz.class, "b"});
            }
            if (i2 == 3) {
                return new dlnx();
            }
            if (i2 == 4) {
                return new dlnw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlnx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlnx.class) {
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
