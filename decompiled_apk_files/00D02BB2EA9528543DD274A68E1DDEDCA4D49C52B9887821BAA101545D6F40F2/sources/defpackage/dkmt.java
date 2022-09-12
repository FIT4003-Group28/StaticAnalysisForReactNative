package defpackage;
/* compiled from: PG */
/* renamed from: dkmt  reason: default package */
/* loaded from: classes6.dex */
public final class dkmt extends dsqw<dkmt, dkms> implements dssk {
    public static final dkmt d;
    private static volatile dssr<dkmt> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dkmt dkmtVar = new dkmt();
        d = dkmtVar;
        dsqw.cc(dkmt.class, dkmtVar);
    }

    private dkmt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkmt();
            }
            if (i2 == 4) {
                return new dkms();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkmt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkmt.class) {
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
