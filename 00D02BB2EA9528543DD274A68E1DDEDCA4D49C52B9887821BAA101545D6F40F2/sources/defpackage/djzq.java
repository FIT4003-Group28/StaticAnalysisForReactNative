package defpackage;
/* compiled from: PG */
/* renamed from: djzq  reason: default package */
/* loaded from: classes6.dex */
public final class djzq extends dsqw<djzq, djzn> implements dssk {
    public static final djzq d;
    private static volatile dssr<djzq> e;
    public int a;
    public int b;
    public dwpe c;

    static {
        djzq djzqVar = new djzq();
        d = djzqVar;
        dsqw.cc(djzq.class, djzqVar);
    }

    private djzq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", djzo.a, "c"});
            }
            if (i2 == 3) {
                return new djzq();
            }
            if (i2 == 4) {
                return new djzn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djzq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djzq.class) {
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
