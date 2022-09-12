package defpackage;
/* compiled from: PG */
/* renamed from: dptm  reason: default package */
/* loaded from: classes6.dex */
public final class dptm extends dsqw<dptm, dptl> implements dssk {
    public static final dptm c;
    private static volatile dssr<dptm> d;
    public int a;
    public String b = "";

    static {
        dptm dptmVar = new dptm();
        c = dptmVar;
        dsqw.cc(dptm.class, dptmVar);
    }

    private dptm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dptm();
            }
            if (i2 == 4) {
                return new dptl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dptm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dptm.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
