package defpackage;
/* compiled from: PG */
/* renamed from: dqqg  reason: default package */
/* loaded from: classes6.dex */
public final class dqqg extends dsqw<dqqg, dqqd> implements dssk {
    public static final dqqg b;
    private static volatile dssr<dqqg> c;
    public dsrj<dqqf> a = dssu.b;

    static {
        dqqg dqqgVar = new dqqg();
        b = dqqgVar;
        dsqw.cc(dqqg.class, dqqgVar);
    }

    private dqqg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqqf.class});
            }
            if (i2 == 3) {
                return new dqqg();
            }
            if (i2 == 4) {
                return new dqqd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqqg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dqqg.class) {
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
