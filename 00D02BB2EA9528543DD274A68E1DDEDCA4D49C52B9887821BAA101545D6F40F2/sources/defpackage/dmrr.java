package defpackage;
/* compiled from: PG */
/* renamed from: dmrr  reason: default package */
/* loaded from: classes.dex */
public final class dmrr extends dsqw<dmrr, dmrq> implements dssk {
    public static final dmrr d;
    private static volatile dssr<dmrr> f;
    public dsre a = dsqk.b;
    public int b = -1;
    public boolean c;
    private int e;

    static {
        dmrr dmrrVar = new dmrr();
        d = dmrrVar;
        dsqw.cc(dmrr.class, dmrrVar);
    }

    private dmrr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002င\u0000\u0003ဇ\u0001\u0004$", new Object[]{"e", "b", "c", "a"});
            }
            if (i2 == 3) {
                return new dmrr();
            }
            if (i2 == 4) {
                return new dmrq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmrr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmrr.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
