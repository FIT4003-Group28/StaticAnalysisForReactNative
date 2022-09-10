package defpackage;
/* compiled from: PG */
/* renamed from: drcx  reason: default package */
/* loaded from: classes.dex */
public final class drcx extends dsqw<drcx, drcu> implements dssk {
    public static final drcx d;
    private static volatile dssr<drcx> e;
    public int a;
    public int b;
    public String c = "";

    static {
        drcx drcxVar = new drcx();
        d = drcxVar;
        dsqw.cc(drcx.class, drcxVar);
    }

    private drcx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", drcv.a, "c"});
            }
            if (i2 == 3) {
                return new drcx();
            }
            if (i2 == 4) {
                return new drcu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drcx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drcx.class) {
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
