package defpackage;
/* compiled from: PG */
/* renamed from: dshv  reason: default package */
/* loaded from: classes6.dex */
public final class dshv extends dsqw<dshv, dshu> implements dssk {
    public static final dshv e;
    private static volatile dssr<dshv> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        dshv dshvVar = new dshv();
        e = dshvVar;
        dsqw.cc(dshv.class, dshvVar);
    }

    private dshv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dshv();
            }
            if (i2 == 4) {
                return new dshu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dshv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dshv.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
