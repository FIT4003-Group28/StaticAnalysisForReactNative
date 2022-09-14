package defpackage;
/* compiled from: PG */
/* renamed from: dmrj  reason: default package */
/* loaded from: classes.dex */
public final class dmrj extends dsqw<dmrj, dmri> implements dssk {
    public static final dmrj d;
    private static volatile dssr<dmrj> e;
    public int a;
    public String b = "";
    public dspd c = dspd.b;

    static {
        dmrj dmrjVar = new dmrj();
        d = dmrjVar;
        dsqw.cc(dmrj.class, dmrjVar);
    }

    private dmrj() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmrj();
            }
            if (i2 == 4) {
                return new dmri();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmrj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmrj.class) {
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
