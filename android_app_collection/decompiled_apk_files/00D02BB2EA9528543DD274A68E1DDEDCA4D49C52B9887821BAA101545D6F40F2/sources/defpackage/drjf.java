package defpackage;
/* compiled from: PG */
/* renamed from: drjf  reason: default package */
/* loaded from: classes6.dex */
public final class drjf extends dsqw<drjf, drje> implements dssk {
    public static final drjf d;
    private static volatile dssr<drjf> f;
    public String a = "";
    public String b = "";
    public String c = "";
    private int e;

    static {
        drjf drjfVar = new drjf();
        d = drjfVar;
        dsqw.cc(drjf.class, drjfVar);
    }

    private drjf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new drjf();
            }
            if (i2 == 4) {
                return new drje();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drjf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drjf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
