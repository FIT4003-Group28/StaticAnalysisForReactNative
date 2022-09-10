package defpackage;
/* compiled from: PG */
/* renamed from: dggs  reason: default package */
/* loaded from: classes6.dex */
public final class dggs extends dsqw<dggs, dggr> implements dssk {
    public static final dggs b;
    private static volatile dssr<dggs> c;
    public dsrj<dggo> a = dssu.b;

    static {
        dggs dggsVar = new dggs();
        b = dggsVar;
        dsqw.cc(dggs.class, dggsVar);
    }

    private dggs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dggo.class});
            }
            if (i2 == 3) {
                return new dggs();
            }
            if (i2 == 4) {
                return new dggr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dggs> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dggs.class) {
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
