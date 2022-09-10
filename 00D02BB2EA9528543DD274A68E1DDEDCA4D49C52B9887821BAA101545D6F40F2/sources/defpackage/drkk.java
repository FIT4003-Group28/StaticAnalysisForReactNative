package defpackage;
/* compiled from: PG */
/* renamed from: drkk  reason: default package */
/* loaded from: classes6.dex */
public final class drkk extends dsqw<drkk, drkj> implements dssk {
    public static final drkk b;
    private static volatile dssr<drkk> d;
    public String a = "";
    private int c;

    static {
        drkk drkkVar = new drkk();
        b = drkkVar;
        dsqw.cc(drkk.class, drkkVar);
    }

    private drkk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drkk();
            }
            if (i2 == 4) {
                return new drkj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drkk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drkk.class) {
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
