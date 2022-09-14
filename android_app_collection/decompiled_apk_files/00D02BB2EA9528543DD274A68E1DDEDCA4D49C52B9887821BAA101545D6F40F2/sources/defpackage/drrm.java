package defpackage;
/* compiled from: PG */
/* renamed from: drrm  reason: default package */
/* loaded from: classes6.dex */
public final class drrm extends dsqw<drrm, drrl> implements dssk {
    public static final drrm d;
    private static volatile dssr<drrm> e;
    public int a;
    public String b = "";
    public int c = 99;

    static {
        drrm drrmVar = new drrm();
        d = drrmVar;
        dsqw.cc(drrm.class, drrmVar);
    }

    private drrm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dplg.a});
            }
            if (i2 == 3) {
                return new drrm();
            }
            if (i2 == 4) {
                return new drrl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drrm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drrm.class) {
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
