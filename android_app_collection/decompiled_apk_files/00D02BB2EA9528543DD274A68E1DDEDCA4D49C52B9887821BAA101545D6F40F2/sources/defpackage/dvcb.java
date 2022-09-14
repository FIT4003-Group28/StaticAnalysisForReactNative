package defpackage;
/* compiled from: PG */
/* renamed from: dvcb  reason: default package */
/* loaded from: classes6.dex */
public final class dvcb extends dsqw<dvcb, dvca> implements dssk {
    public static final dvcb d;
    private static volatile dssr<dvcb> e;
    public int a;
    public dxdm b;
    public String c = "";

    static {
        dvcb dvcbVar = new dvcb();
        d = dvcbVar;
        dsqw.cc(dvcb.class, dvcbVar);
    }

    private dvcb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvcb();
            }
            if (i2 == 4) {
                return new dvca();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvcb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvcb.class) {
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
