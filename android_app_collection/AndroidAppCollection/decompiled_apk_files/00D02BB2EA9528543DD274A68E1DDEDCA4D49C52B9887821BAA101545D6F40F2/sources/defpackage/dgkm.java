package defpackage;
/* compiled from: PG */
/* renamed from: dgkm  reason: default package */
/* loaded from: classes6.dex */
public final class dgkm extends dsqw<dgkm, dgkh> implements dssk {
    public static final dgkm h;
    private static volatile dssr<dgkm> i;
    public int a;
    public int e;
    public int g;
    public String b = "";
    public dspd c = dspd.b;
    public String d = "";
    public String f = "";

    static {
        dgkm dgkmVar = new dgkm();
        h = dgkmVar;
        dsqw.cc(dgkm.class, dgkmVar);
    }

    private dgkm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ည\u0001\u0002ဈ\u0003\u0003ဈ\u0000\u0004ဌ\u0004\u0005ဈ\u0005\u0007ဌ\u0006", new Object[]{"a", "c", "d", "b", "e", dgki.a, "f", "g", dgkk.a});
            }
            if (i3 == 3) {
                return new dgkm();
            }
            if (i3 == 4) {
                return new dgkh();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dgkm> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dgkm.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
