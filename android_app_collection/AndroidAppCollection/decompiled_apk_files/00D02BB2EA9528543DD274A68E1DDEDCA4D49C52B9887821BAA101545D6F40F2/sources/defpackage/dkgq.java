package defpackage;
/* compiled from: PG */
/* renamed from: dkgq  reason: default package */
/* loaded from: classes6.dex */
public final class dkgq extends dsqw<dkgq, dkgp> implements dssk {
    public static final dkgq d;
    private static volatile dssr<dkgq> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dkgq dkgqVar = new dkgq();
        d = dkgqVar;
        dsqw.cc(dkgq.class, dkgqVar);
    }

    private dkgq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkgq();
            }
            if (i2 == 4) {
                return new dkgp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkgq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkgq.class) {
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
