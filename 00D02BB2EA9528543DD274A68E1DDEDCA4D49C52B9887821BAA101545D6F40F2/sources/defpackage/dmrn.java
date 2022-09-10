package defpackage;
/* compiled from: PG */
/* renamed from: dmrn  reason: default package */
/* loaded from: classes6.dex */
public final class dmrn extends dsqs<dmrn, dmrm> implements dsqt {
    public static final dmrn g;
    private static volatile dssr<dmrn> i;
    public int a;
    public int e;
    public int f;
    private byte h = 2;
    public dspd b = dspd.b;
    public int c = -1;
    public long d = -1;

    static {
        dmrn dmrnVar = new dmrn();
        g = dmrnVar;
        dsqw.cc(dmrn.class, dmrnVar);
    }

    private dmrn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ည\u0000\u0003င\u0001\u0004င\u0003\u0005ဆ\u0004\u0006ဂ\u0002", new Object[]{"a", "b", "c", "e", "f", "d"});
            }
            if (i3 == 3) {
                return new dmrn();
            }
            if (i3 == 4) {
                return new dmrm();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dmrn> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dmrn.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
