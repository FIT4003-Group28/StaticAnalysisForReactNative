package defpackage;
/* compiled from: PG */
/* renamed from: dmei  reason: default package */
/* loaded from: classes6.dex */
public final class dmei extends dsqw<dmei, dmeh> implements dssk {
    public static final dmei d;
    private static volatile dssr<dmei> e;
    public int a;
    public int b = -1;
    public String c = "";

    static {
        dmei dmeiVar = new dmei();
        d = dmeiVar;
        dsqw.cc(dmei.class, dmeiVar);
    }

    private dmei() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", dndr.c(), "c"});
            }
            if (i2 == 3) {
                return new dmei();
            }
            if (i2 == 4) {
                return new dmeh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmei> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmei.class) {
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
