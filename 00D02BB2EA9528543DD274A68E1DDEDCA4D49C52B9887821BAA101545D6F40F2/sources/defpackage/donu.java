package defpackage;
/* compiled from: PG */
/* renamed from: donu  reason: default package */
/* loaded from: classes6.dex */
public final class donu extends dsqw<donu, dont> implements dssk {
    public static final donu b;
    private static volatile dssr<donu> d;
    public String a = "";
    private int c;

    static {
        donu donuVar = new donu();
        b = donuVar;
        dsqw.cc(donu.class, donuVar);
    }

    private donu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new donu();
            }
            if (i2 == 4) {
                return new dont();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<donu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (donu.class) {
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
