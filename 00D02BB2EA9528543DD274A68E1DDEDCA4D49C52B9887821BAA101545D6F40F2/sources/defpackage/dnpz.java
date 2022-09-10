package defpackage;
/* compiled from: PG */
/* renamed from: dnpz  reason: default package */
/* loaded from: classes6.dex */
public final class dnpz extends dsqw<dnpz, dnpy> implements dssk {
    public static final dnpz d;
    private static volatile dssr<dnpz> e;
    public int a;
    public int b;
    public int c;

    static {
        dnpz dnpzVar = new dnpz();
        d = dnpzVar;
        dsqw.cc(dnpz.class, dnpzVar);
    }

    private dnpz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", deaf.c()});
            }
            if (i2 == 3) {
                return new dnpz();
            }
            if (i2 == 4) {
                return new dnpy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnpz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnpz.class) {
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
