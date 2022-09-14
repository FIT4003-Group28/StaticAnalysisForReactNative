package defpackage;
/* compiled from: PG */
/* renamed from: dtwr  reason: default package */
/* loaded from: classes6.dex */
public final class dtwr extends dsqw<dtwr, dtwq> implements dssk {
    public static final dtwr b;
    private static volatile dssr<dtwr> c;
    public String a = "";

    static {
        dtwr dtwrVar = new dtwr();
        b = dtwrVar;
        dsqw.cc(dtwr.class, dtwrVar);
    }

    private dtwr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dtwr();
            }
            if (i2 == 4) {
                return new dtwq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtwr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtwr.class) {
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
