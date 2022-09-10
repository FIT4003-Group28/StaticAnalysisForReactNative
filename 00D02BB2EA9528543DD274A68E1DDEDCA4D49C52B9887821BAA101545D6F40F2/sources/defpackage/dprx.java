package defpackage;
/* compiled from: PG */
/* renamed from: dprx  reason: default package */
/* loaded from: classes.dex */
public final class dprx extends dsqw<dprx, dprs> implements dssk {
    public static final dprx h;
    private static volatile dssr<dprx> i;
    public int a;
    public dpuq c;
    public int d;
    public int e;
    public dpsh f;
    public String b = "";
    public String g = "";

    static {
        dprx dprxVar = new dprx();
        h = dprxVar;
        dsqw.cc(dprx.class, dprxVar);
    }

    private dprx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0002\u0002ဉ\u0004\u0003ဌ\u0003\u0004ဈ\u0005\u0005ဈ\u0000\u0006ဉ\u0001", new Object[]{"a", "d", dprt.a, "f", "e", dprv.a, "g", "b", "c"});
            }
            if (i3 == 3) {
                return new dprx();
            }
            if (i3 == 4) {
                return new dprs();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dprx> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dprx.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
