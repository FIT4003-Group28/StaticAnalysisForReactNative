package defpackage;
/* compiled from: PG */
/* renamed from: drkx  reason: default package */
/* loaded from: classes6.dex */
public final class drkx extends dsqw<drkx, drku> implements dssk {
    public static final drkx b;
    private static volatile dssr<drkx> c;
    public dsrj<drkw> a = dssu.b;

    static {
        drkx drkxVar = new drkx();
        b = drkxVar;
        dsqw.cc(drkx.class, drkxVar);
    }

    private drkx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drkw.class});
            }
            if (i2 == 3) {
                return new drkx();
            }
            if (i2 == 4) {
                return new drku();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drkx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drkx.class) {
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
