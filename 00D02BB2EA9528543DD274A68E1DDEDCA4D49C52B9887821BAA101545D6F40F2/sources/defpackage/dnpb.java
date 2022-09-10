package defpackage;
/* compiled from: PG */
/* renamed from: dnpb  reason: default package */
/* loaded from: classes6.dex */
public final class dnpb extends dsqw<dnpb, dnpa> implements dssk {
    public static final dnpb d;
    private static volatile dssr<dnpb> e;
    public int a;
    public int b;
    public int c;

    static {
        dnpb dnpbVar = new dnpb();
        d = dnpbVar;
        dsqw.cc(dnpb.class, dnpbVar);
    }

    private dnpb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", dnpf.c(), "c", dnpd.c()});
            }
            if (i2 == 3) {
                return new dnpb();
            }
            if (i2 == 4) {
                return new dnpa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnpb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnpb.class) {
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
