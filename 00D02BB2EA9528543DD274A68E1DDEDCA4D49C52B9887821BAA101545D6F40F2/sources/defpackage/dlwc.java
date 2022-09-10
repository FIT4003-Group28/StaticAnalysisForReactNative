package defpackage;
/* compiled from: PG */
/* renamed from: dlwc  reason: default package */
/* loaded from: classes.dex */
public final class dlwc extends dsqw<dlwc, dlwb> implements dssk {
    public static final dlwc b;
    private static volatile dssr<dlwc> c;
    public dsrj<dlvw> a = dssu.b;

    static {
        dlwc dlwcVar = new dlwc();
        b = dlwcVar;
        dsqw.cc(dlwc.class, dlwcVar);
    }

    private dlwc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dlvw.class});
            }
            if (i2 == 3) {
                return new dlwc();
            }
            if (i2 == 4) {
                return new dlwb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlwc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlwc.class) {
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
