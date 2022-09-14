package defpackage;
/* compiled from: PG */
/* renamed from: dsvj  reason: default package */
/* loaded from: classes6.dex */
public final class dsvj extends dsqw<dsvj, dsvi> implements dssk {
    public static final dsvj f;
    private static volatile dssr<dsvj> g;
    public int a;
    public String b = "";
    public long c;
    public int d;
    public int e;

    static {
        dsvj dsvjVar = new dsvj();
        f = dsvjVar;
        dsqw.cc(dsvj.class, dsvjVar);
    }

    private dsvj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dsvj();
            }
            if (i2 == 4) {
                return new dsvi();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsvj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsvj.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
