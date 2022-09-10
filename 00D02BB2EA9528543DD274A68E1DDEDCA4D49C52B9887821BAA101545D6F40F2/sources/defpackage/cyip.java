package defpackage;
/* compiled from: PG */
/* renamed from: cyip  reason: default package */
/* loaded from: classes5.dex */
public final class cyip extends dsqw<cyip, cyio> implements dssk {
    public static final cyip d;
    private static volatile dssr<cyip> e;
    public String a = "";
    public String b = "";
    public int c;

    static {
        cyip cyipVar = new cyip();
        d = cyipVar;
        dsqw.cc(cyip.class, cyipVar);
    }

    private cyip() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cyip();
            }
            if (i2 == 4) {
                return new cyio();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyip> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cyip.class) {
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
