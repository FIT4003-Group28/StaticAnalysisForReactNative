package defpackage;
/* compiled from: PG */
/* renamed from: dksq  reason: default package */
/* loaded from: classes.dex */
public final class dksq extends dsqw<dksq, dksp> implements dssk {
    public static final dksq d;
    private static volatile dssr<dksq> f;
    public int a;
    public int b;
    public boolean c;
    private int e;

    static {
        dksq dksqVar = new dksq();
        d = dksqVar;
        dsqw.cc(dksq.class, dksqVar);
    }

    private dksq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dksq();
            }
            if (i2 == 4) {
                return new dksp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dksq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dksq.class) {
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
