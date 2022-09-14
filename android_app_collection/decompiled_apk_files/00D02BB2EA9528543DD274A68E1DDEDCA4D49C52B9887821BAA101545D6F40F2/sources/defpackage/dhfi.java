package defpackage;
/* compiled from: PG */
/* renamed from: dhfi  reason: default package */
/* loaded from: classes6.dex */
public final class dhfi extends dsqw<dhfi, dhfh> implements dssk {
    public static final dhfi d;
    private static volatile dssr<dhfi> e;
    public String a = "";
    public dufk b;
    public dtyp c;

    static {
        dhfi dhfiVar = new dhfi();
        d = dhfiVar;
        dsqw.cc(dhfi.class, dhfiVar);
    }

    private dhfi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001Ȉ\u0003\t\u0005\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dhfi();
            }
            if (i2 == 4) {
                return new dhfh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhfi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhfi.class) {
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
