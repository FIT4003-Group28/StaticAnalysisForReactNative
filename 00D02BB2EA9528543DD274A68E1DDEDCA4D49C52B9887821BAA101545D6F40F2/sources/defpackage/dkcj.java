package defpackage;
/* compiled from: PG */
/* renamed from: dkcj  reason: default package */
/* loaded from: classes6.dex */
public final class dkcj extends dsqw<dkcj, dkci> implements dssk {
    public static final dkcj d;
    private static volatile dssr<dkcj> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dkcj dkcjVar = new dkcj();
        d = dkcjVar;
        dsqw.cc(dkcj.class, dkcjVar);
    }

    private dkcj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkcj();
            }
            if (i2 == 4) {
                return new dkci();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkcj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkcj.class) {
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
