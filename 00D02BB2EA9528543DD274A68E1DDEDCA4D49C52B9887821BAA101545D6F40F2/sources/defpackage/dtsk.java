package defpackage;
/* compiled from: PG */
/* renamed from: dtsk  reason: default package */
/* loaded from: classes6.dex */
public final class dtsk extends dsqw<dtsk, dtsj> implements dssk {
    public static final dtsk b;
    private static volatile dssr<dtsk> c;
    public dsrj<dtsi> a = dssu.b;

    static {
        dtsk dtskVar = new dtsk();
        b = dtskVar;
        dsqw.cc(dtsk.class, dtskVar);
    }

    private dtsk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dtsi.class});
            }
            if (i2 == 3) {
                return new dtsk();
            }
            if (i2 == 4) {
                return new dtsj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtsk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtsk.class) {
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
