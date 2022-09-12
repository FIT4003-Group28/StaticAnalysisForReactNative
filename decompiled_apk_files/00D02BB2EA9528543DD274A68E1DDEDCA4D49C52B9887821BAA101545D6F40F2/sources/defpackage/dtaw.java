package defpackage;
/* compiled from: PG */
/* renamed from: dtaw  reason: default package */
/* loaded from: classes6.dex */
public final class dtaw extends dsqw<dtaw, dtav> implements dssk {
    public static final dtaw b;
    private static volatile dssr<dtaw> c;
    public dsrj<dtba> a = dssu.b;

    static {
        dtaw dtawVar = new dtaw();
        b = dtawVar;
        dsqw.cc(dtaw.class, dtawVar);
    }

    private dtaw() {
    }

    public static dtav c() {
        return b.bZ();
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dtba.class});
            }
            if (i2 == 3) {
                return new dtaw();
            }
            if (i2 == 4) {
                return new dtav();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtaw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtaw.class) {
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
