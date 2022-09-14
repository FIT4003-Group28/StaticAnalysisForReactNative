package defpackage;
/* compiled from: PG */
/* renamed from: aknx  reason: default package */
/* loaded from: classes.dex */
public final class aknx extends dsqw<aknx, aknu> implements dssk {
    public static final aknx b;
    private static volatile dssr<aknx> c;
    public dsrj<aknw> a = dssu.b;

    static {
        aknx aknxVar = new aknx();
        b = aknxVar;
        dsqw.cc(aknx.class, aknxVar);
    }

    private aknx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", aknw.class});
            }
            if (i2 == 3) {
                return new aknx();
            }
            if (i2 == 4) {
                return new aknu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aknx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (aknx.class) {
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
