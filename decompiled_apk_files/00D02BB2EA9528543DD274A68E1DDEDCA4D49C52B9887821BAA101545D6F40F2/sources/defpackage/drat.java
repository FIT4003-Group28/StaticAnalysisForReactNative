package defpackage;
/* compiled from: PG */
/* renamed from: drat  reason: default package */
/* loaded from: classes6.dex */
public final class drat extends dsqw<drat, dras> implements dssk {
    public static final drat d;
    private static volatile dssr<drat> e;
    public int a;
    public dsrj<dggg> b = dssu.b;
    public String c = "";

    static {
        drat dratVar = new drat();
        d = dratVar;
        dsqw.cc(drat.class, dratVar);
    }

    private drat() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", "b", dggg.class, "c"});
            }
            if (i2 == 3) {
                return new drat();
            }
            if (i2 == 4) {
                return new dras();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drat> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drat.class) {
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
