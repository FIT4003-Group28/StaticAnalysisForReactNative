package defpackage;
/* compiled from: PG */
/* renamed from: dpvc  reason: default package */
/* loaded from: classes6.dex */
public final class dpvc extends dsqw<dpvc, dpvb> implements dssk {
    public static final dpvc c;
    private static volatile dssr<dpvc> d;
    public int a;
    public String b = "";

    static {
        dpvc dpvcVar = new dpvc();
        c = dpvcVar;
        dsqw.cc(dpvc.class, dpvcVar);
    }

    private dpvc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpvc();
            }
            if (i2 == 4) {
                return new dpvb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpvc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpvc.class) {
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
