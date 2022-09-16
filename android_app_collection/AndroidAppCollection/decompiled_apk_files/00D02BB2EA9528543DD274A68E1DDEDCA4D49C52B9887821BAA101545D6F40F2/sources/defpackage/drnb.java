package defpackage;
/* compiled from: PG */
/* renamed from: drnb  reason: default package */
/* loaded from: classes6.dex */
public final class drnb extends dsqw<drnb, drna> implements dssk {
    public static final drnb b;
    private static volatile dssr<drnb> d;
    public String a = "";
    private int c;

    static {
        drnb drnbVar = new drnb();
        b = drnbVar;
        dsqw.cc(drnb.class, drnbVar);
    }

    private drnb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drnb();
            }
            if (i2 == 4) {
                return new drna();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drnb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drnb.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
