package defpackage;
/* compiled from: PG */
/* renamed from: dngq  reason: default package */
/* loaded from: classes6.dex */
public final class dngq extends dsqw<dngq, dngp> implements dssk {
    public static final dngq d;
    private static volatile dssr<dngq> e;
    public int a;
    public dngs b;
    public dngs c;

    static {
        dngq dngqVar = new dngq();
        d = dngqVar;
        dsqw.cc(dngq.class, dngqVar);
    }

    private dngq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dngq();
            }
            if (i2 == 4) {
                return new dngp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dngq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dngq.class) {
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
