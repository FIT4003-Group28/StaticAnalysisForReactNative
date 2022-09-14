package defpackage;
/* compiled from: PG */
/* renamed from: dnjj  reason: default package */
/* loaded from: classes6.dex */
public final class dnjj extends dsqw<dnjj, dnji> implements dssk {
    public static final dnjj e;
    private static volatile dssr<dnjj> g;
    public String a = "";
    public String b = "";
    public dnpq c;
    public dnwd d;
    private int f;

    static {
        dnjj dnjjVar = new dnjj();
        e = dnjjVar;
        dsqw.cc(dnjj.class, dnjjVar);
    }

    private dnjj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0004\r\u0004\u0000\u0000\u0000\u0004ဈ\u0002\bဉ\u0006\tဈ\u0004\rဉ\b", new Object[]{"f", "a", "c", "b", "d"});
            }
            if (i2 == 3) {
                return new dnjj();
            }
            if (i2 == 4) {
                return new dnji();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnjj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnjj.class) {
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
