package defpackage;
/* compiled from: PG */
/* renamed from: djhd  reason: default package */
/* loaded from: classes6.dex */
public final class djhd extends dsqw<djhd, djha> implements dssk {
    public static final djhd e;
    private static volatile dssr<djhd> f;
    public int a;
    public int c;
    public String b = "";
    public dsrj<djhc> d = dssu.b;

    static {
        djhd djhdVar = new djhd();
        e = djhdVar;
        dsqw.cc(djhd.class, djhdVar);
    }

    private djhd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", djhc.class});
            }
            if (i2 == 3) {
                return new djhd();
            }
            if (i2 == 4) {
                return new djha();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djhd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djhd.class) {
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
