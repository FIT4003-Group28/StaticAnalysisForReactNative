package defpackage;
/* compiled from: PG */
/* renamed from: dntv  reason: default package */
/* loaded from: classes6.dex */
public final class dntv extends dsqw<dntv, dnts> implements dssk {
    public static final dntv d;
    private static volatile dssr<dntv> e;
    public int a;
    public dpjx b;
    public dsrj<dntu> c = dssu.b;

    static {
        dntv dntvVar = new dntv();
        d = dntvVar;
        dsqw.cc(dntv.class, dntvVar);
    }

    private dntv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dntu.class});
            }
            if (i2 == 3) {
                return new dntv();
            }
            if (i2 == 4) {
                return new dnts();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dntv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dntv.class) {
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
