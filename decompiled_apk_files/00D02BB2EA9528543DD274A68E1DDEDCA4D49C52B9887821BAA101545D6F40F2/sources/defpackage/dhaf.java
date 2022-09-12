package defpackage;
/* compiled from: PG */
/* renamed from: dhaf  reason: default package */
/* loaded from: classes6.dex */
public final class dhaf extends dsqw<dhaf, dhae> implements dssk {
    public static final dhaf d;
    private static volatile dssr<dhaf> e;
    public dhab a;
    public dhad b;
    public String c = "";

    static {
        dhaf dhafVar = new dhaf();
        d = dhafVar;
        dsqw.cc(dhaf.class, dhafVar);
    }

    private dhaf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dhaf();
            }
            if (i2 == 4) {
                return new dhae();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhaf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhaf.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
