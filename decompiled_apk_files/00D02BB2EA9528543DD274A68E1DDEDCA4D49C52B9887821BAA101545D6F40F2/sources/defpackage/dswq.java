package defpackage;
/* compiled from: PG */
/* renamed from: dswq  reason: default package */
/* loaded from: classes6.dex */
public final class dswq extends dsqw<dswq, dswo> implements dssk {
    public static final dswq d;
    private static volatile dssr<dswq> e;
    public int a;
    public int b;
    public dsrj<dspd> c = dssu.b;

    static {
        dswq dswqVar = new dswq();
        d = dswqVar;
        dsqw.cc(dswq.class, dswqVar);
    }

    private dswq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0003\u001c", new Object[]{"a", "b", dswp.a, "c"});
            }
            if (i2 == 3) {
                return new dswq();
            }
            if (i2 == 4) {
                return new dswo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dswq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dswq.class) {
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
