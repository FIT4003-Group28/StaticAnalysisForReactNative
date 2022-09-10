package defpackage;
/* compiled from: PG */
/* renamed from: drrn  reason: default package */
/* loaded from: classes6.dex */
public final class drrn extends dsqw<drrn, drrk> implements dssk {
    public static final drrn e;
    private static volatile dssr<drrn> f;
    public int a;
    public int b;
    public drog c;
    public drrm d;

    static {
        drrn drrnVar = new drrn();
        e = drrnVar;
        dsqw.cc(drrn.class, drrnVar);
    }

    private drrn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", drrj.a, "c", "d"});
            }
            if (i2 == 3) {
                return new drrn();
            }
            if (i2 == 4) {
                return new drrk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drrn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drrn.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
