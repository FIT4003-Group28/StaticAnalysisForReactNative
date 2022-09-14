package defpackage;
/* compiled from: PG */
/* renamed from: dpmn  reason: default package */
/* loaded from: classes6.dex */
public final class dpmn extends dsqw<dpmn, dpmm> implements dssk {
    public static final dpmn d;
    private static volatile dssr<dpmn> e;
    public int a;
    public dpmr b;
    public dpmt c;

    static {
        dpmn dpmnVar = new dpmn();
        d = dpmnVar;
        dsqw.cc(dpmn.class, dpmnVar);
    }

    private dpmn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpmn();
            }
            if (i2 == 4) {
                return new dpmm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpmn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpmn.class) {
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
