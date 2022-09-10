package defpackage;
/* compiled from: PG */
/* renamed from: dhdc  reason: default package */
/* loaded from: classes6.dex */
public final class dhdc extends dsqw<dhdc, dhda> implements dssk {
    public static final dhdc d;
    private static volatile dssr<dhdc> e;
    public String a = "";
    public String b = "";
    public int c;

    static {
        dhdc dhdcVar = new dhdc();
        d = dhdcVar;
        dsqw.cc(dhdc.class, dhdcVar);
    }

    private dhdc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dhdc();
            }
            if (i2 == 4) {
                return new dhda();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhdc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhdc.class) {
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
