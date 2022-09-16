package defpackage;
/* compiled from: PG */
/* renamed from: dmrz  reason: default package */
/* loaded from: classes.dex */
public final class dmrz extends dsqw<dmrz, dmry> implements dssk {
    public static final dmrz d;
    private static volatile dssr<dmrz> e;
    public int a;
    public long b;
    public dmmi c;

    static {
        dmrz dmrzVar = new dmrz();
        d = dmrzVar;
        dsqw.cc(dmrz.class, dmrzVar);
    }

    private dmrz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmrz();
            }
            if (i2 == 4) {
                return new dmry();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmrz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmrz.class) {
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
