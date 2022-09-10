package defpackage;
/* compiled from: PG */
/* renamed from: drco  reason: default package */
/* loaded from: classes.dex */
public final class drco extends dsqw<drco, drcn> implements dssk {
    public static final drco d;
    private static volatile dssr<drco> e;
    public int a;
    public int b;
    public String c = "";

    static {
        drco drcoVar = new drco();
        d = drcoVar;
        dsqw.cc(drco.class, drcoVar);
    }

    private drco() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", drcq.c(), "c"});
            }
            if (i2 == 3) {
                return new drco();
            }
            if (i2 == 4) {
                return new drcn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drco> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drco.class) {
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
