package defpackage;
/* compiled from: PG */
/* renamed from: dpsb  reason: default package */
/* loaded from: classes6.dex */
public final class dpsb extends dsqw<dpsb, dpsa> implements dssk {
    public static final dpsb d;
    private static volatile dssr<dpsb> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dpsb dpsbVar = new dpsb();
        d = dpsbVar;
        dsqw.cc(dpsb.class, dpsbVar);
    }

    private dpsb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpsb();
            }
            if (i2 == 4) {
                return new dpsa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpsb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpsb.class) {
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
