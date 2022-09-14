package defpackage;
/* compiled from: PG */
/* renamed from: dqqf  reason: default package */
/* loaded from: classes6.dex */
public final class dqqf extends dsqw<dqqf, dqqe> implements dssk {
    public static final dqqf d;
    private static volatile dssr<dqqf> f;
    public int a;
    public String b = "";
    public String c = "";
    private int e;

    static {
        dqqf dqqfVar = new dqqf();
        d = dqqfVar;
        dsqw.cc(dqqf.class, dqqfVar);
    }

    private dqqf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", dqrc.a, "b", "c"});
            }
            if (i2 == 3) {
                return new dqqf();
            }
            if (i2 == 4) {
                return new dqqe();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqqf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqqf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
