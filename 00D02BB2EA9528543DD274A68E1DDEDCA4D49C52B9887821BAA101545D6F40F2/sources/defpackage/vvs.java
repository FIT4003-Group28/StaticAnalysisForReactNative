package defpackage;
/* compiled from: PG */
/* renamed from: vvs  reason: default package */
/* loaded from: classes7.dex */
public final class vvs extends dsqw<vvs, vvr> implements dssk {
    public static final vvs e;
    private static volatile dssr<vvs> f;
    public int a;
    public long b;
    public int c;
    public String d = "";

    static {
        vvs vvsVar = new vvs();
        e = vvsVar;
        dsqw.cc(vvs.class, vvsVar);
    }

    private vvs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", vvp.a, "d"});
            }
            if (i2 == 3) {
                return new vvs();
            }
            if (i2 == 4) {
                return new vvr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<vvs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (vvs.class) {
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
