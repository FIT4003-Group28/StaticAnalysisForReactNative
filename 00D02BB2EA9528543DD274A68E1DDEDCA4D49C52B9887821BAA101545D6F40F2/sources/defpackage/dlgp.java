package defpackage;
/* compiled from: PG */
/* renamed from: dlgp  reason: default package */
/* loaded from: classes6.dex */
public final class dlgp extends dsqw<dlgp, dlgo> implements dssk {
    public static final dlgp b;
    private static volatile dssr<dlgp> c;
    public dsrj<dlft> a = dssu.b;

    static {
        dlgp dlgpVar = new dlgp();
        b = dlgpVar;
        dsqw.cc(dlgp.class, dlgpVar);
    }

    private dlgp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dlft.class});
            }
            if (i2 == 3) {
                return new dlgp();
            }
            if (i2 == 4) {
                return new dlgo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlgp> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlgp.class) {
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
