package defpackage;
/* compiled from: PG */
/* renamed from: dpfz  reason: default package */
/* loaded from: classes6.dex */
public final class dpfz extends dsqw<dpfz, dpfy> implements dssk {
    public static final dpfz d;
    private static volatile dssr<dpfz> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dpfz dpfzVar = new dpfz();
        d = dpfzVar;
        dsqw.cc(dpfz.class, dpfzVar);
    }

    private dpfz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpfz();
            }
            if (i2 == 4) {
                return new dpfy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpfz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpfz.class) {
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
