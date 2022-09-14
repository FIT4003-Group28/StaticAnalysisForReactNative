package defpackage;
/* compiled from: PG */
/* renamed from: dijg  reason: default package */
/* loaded from: classes6.dex */
public final class dijg extends dsqw<dijg, dijb> implements dssk {
    public static final dijg b;
    private static volatile dssr<dijg> c;
    public dsrj<dijf> a = dssu.b;

    static {
        dijg dijgVar = new dijg();
        b = dijgVar;
        dsqw.cc(dijg.class, dijgVar);
    }

    private dijg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dijf.class});
            }
            if (i2 == 3) {
                return new dijg();
            }
            if (i2 == 4) {
                return new dijb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dijg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dijg.class) {
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
