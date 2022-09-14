package defpackage;
/* compiled from: PG */
/* renamed from: dmag  reason: default package */
/* loaded from: classes6.dex */
public final class dmag extends dsqw<dmag, dmaf> implements dssk {
    public static final dmag d;
    private static volatile dssr<dmag> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dmag dmagVar = new dmag();
        d = dmagVar;
        dsqw.cc(dmag.class, dmagVar);
    }

    private dmag() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003ဈ\u0000\u0005ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmag();
            }
            if (i2 == 4) {
                return new dmaf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmag> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmag.class) {
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
