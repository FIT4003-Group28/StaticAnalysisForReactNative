package defpackage;
/* compiled from: PG */
/* renamed from: dopj  reason: default package */
/* loaded from: classes6.dex */
public final class dopj extends dsqw<dopj, dopi> implements dssk {
    public static final dopj c;
    private static volatile dssr<dopj> d;
    public int a = 0;
    public Object b;

    static {
        dopj dopjVar = new dopj();
        c = dopjVar;
        dsqw.cc(dopj.class, dopjVar);
    }

    private dopj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ျ\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new dopj();
            }
            if (i2 == 4) {
                return new dopi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dopj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dopj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}