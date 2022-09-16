package defpackage;
/* compiled from: PG */
/* renamed from: cymd  reason: default package */
/* loaded from: classes5.dex */
public final class cymd extends dsqw<cymd, cymc> implements dssk {
    public static final cymd d;
    private static volatile dssr<cymd> e;
    public cyle a;
    public cyls b;
    public String c = "";

    static {
        cymd cymdVar = new cymd();
        d = cymdVar;
        dsqw.cc(cymd.class, cymdVar);
    }

    private cymd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cymd();
            }
            if (i2 == 4) {
                return new cymc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cymd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cymd.class) {
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
