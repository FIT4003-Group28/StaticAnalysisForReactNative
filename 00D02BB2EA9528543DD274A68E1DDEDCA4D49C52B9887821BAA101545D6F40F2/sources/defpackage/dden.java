package defpackage;
/* compiled from: PG */
/* renamed from: dden  reason: default package */
/* loaded from: classes.dex */
public final class dden extends dsqw<dden, ddem> implements dssk {
    public static final dden d;
    private static volatile dssr<dden> e;
    public int a;
    public long b;
    public int c;

    static {
        dden ddenVar = new dden();
        d = ddenVar;
        dsqw.cc(dden.class, ddenVar);
    }

    private dden() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0004င\u0003", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dden();
            }
            if (i2 == 4) {
                return new ddem();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dden> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dden.class) {
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
