package defpackage;
/* compiled from: PG */
/* renamed from: dugk  reason: default package */
/* loaded from: classes6.dex */
public final class dugk extends dsqw<dugk, dugj> implements dssk {
    public static final dugk b;
    private static volatile dssr<dugk> d;
    public String a = "";
    private int c;

    static {
        dugk dugkVar = new dugk();
        b = dugkVar;
        dsqw.cc(dugk.class, dugkVar);
    }

    private dugk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dugk();
            }
            if (i2 == 4) {
                return new dugj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dugk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dugk.class) {
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
