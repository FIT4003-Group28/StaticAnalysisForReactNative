package defpackage;
/* compiled from: PG */
/* renamed from: dhmx  reason: default package */
/* loaded from: classes6.dex */
public final class dhmx extends dsqw<dhmx, dhmw> implements dssk {
    public static final dhmx b;
    private static volatile dssr<dhmx> c;
    public dsrj<dixi> a = dssu.b;

    static {
        dhmx dhmxVar = new dhmx();
        b = dhmxVar;
        dsqw.cc(dhmx.class, dhmxVar);
    }

    private dhmx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dixi.class});
            }
            if (i2 == 3) {
                return new dhmx();
            }
            if (i2 == 4) {
                return new dhmw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhmx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhmx.class) {
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
