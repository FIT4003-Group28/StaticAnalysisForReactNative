package defpackage;
/* compiled from: PG */
/* renamed from: dlcm  reason: default package */
/* loaded from: classes6.dex */
public final class dlcm extends dsqw<dlcm, dlcl> implements dssk {
    public static final dlcm c;
    private static volatile dssr<dlcm> e;
    public String a = "";
    public dspd b = dspd.b;
    private int d;

    static {
        dlcm dlcmVar = new dlcm();
        c = dlcmVar;
        dsqw.cc(dlcm.class, dlcmVar);
    }

    private dlcm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dlcm();
            }
            if (i2 == 4) {
                return new dlcl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlcm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlcm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
