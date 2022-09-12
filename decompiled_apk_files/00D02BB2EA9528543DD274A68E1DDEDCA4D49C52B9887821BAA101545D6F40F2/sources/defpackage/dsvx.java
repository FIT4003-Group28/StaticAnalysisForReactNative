package defpackage;
/* compiled from: PG */
/* renamed from: dsvx  reason: default package */
/* loaded from: classes6.dex */
public final class dsvx extends dsqw<dsvx, dsvu> implements dssk {
    public static final dsvx d;
    private static volatile dssr<dsvx> e;
    public int a;
    public int b;
    public dsrj<dsvh> c = dssu.b;

    static {
        dsvx dsvxVar = new dsvx();
        d = dsvxVar;
        dsqw.cc(dsvx.class, dsvxVar);
    }

    private dsvx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", dsvv.a, "c", dsvh.class});
            }
            if (i2 == 3) {
                return new dsvx();
            }
            if (i2 == 4) {
                return new dsvu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsvx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsvx.class) {
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
