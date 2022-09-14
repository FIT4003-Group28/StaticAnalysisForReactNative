package defpackage;
/* compiled from: PG */
/* renamed from: dgnf  reason: default package */
/* loaded from: classes6.dex */
public final class dgnf extends dsqw<dgnf, dgnc> implements dssk {
    public static final dgnf e;
    private static volatile dssr<dgnf> g;
    public String a = "";
    public int b;
    public dnqe c;
    public dgnn d;
    private int f;

    static {
        dgnf dgnfVar = new dgnf();
        e = dgnfVar;
        dsqw.cc(dgnf.class, dgnfVar);
    }

    private dgnf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"f", "a", "b", dgnd.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dgnf();
            }
            if (i2 == 4) {
                return new dgnc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgnf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgnf.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
