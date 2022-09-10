package defpackage;
/* compiled from: PG */
/* renamed from: doyj  reason: default package */
/* loaded from: classes6.dex */
public final class doyj extends dsqw<doyj, doyg> implements dssk {
    public static final doyj d;
    private static volatile dssr<doyj> e;
    public int a;
    public int b;
    public dsrj<doyn> c = dssu.b;

    static {
        doyj doyjVar = new doyj();
        d = doyjVar;
        dsqw.cc(doyj.class, doyjVar);
    }

    private doyj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", doyh.a, "c", doyn.class});
            }
            if (i2 == 3) {
                return new doyj();
            }
            if (i2 == 4) {
                return new doyg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doyj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doyj.class) {
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
