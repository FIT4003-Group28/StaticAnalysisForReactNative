package defpackage;
/* compiled from: PG */
/* renamed from: dpgq  reason: default package */
/* loaded from: classes6.dex */
public final class dpgq extends dsqw<dpgq, dpgo> implements dssk {
    public static final dpgq d;
    private static volatile dssr<dpgq> e;
    public int a;
    public boolean b;
    public int c;

    static {
        dpgq dpgqVar = new dpgq();
        d = dpgqVar;
        dsqw.cc(dpgq.class, dpgqVar);
    }

    private dpgq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dpgp.a});
            }
            if (i2 == 3) {
                return new dpgq();
            }
            if (i2 == 4) {
                return new dpgo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpgq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpgq.class) {
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
