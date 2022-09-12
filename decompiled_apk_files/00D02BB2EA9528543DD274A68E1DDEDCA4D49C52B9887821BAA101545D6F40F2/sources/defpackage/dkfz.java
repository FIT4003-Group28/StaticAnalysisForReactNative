package defpackage;
/* compiled from: PG */
/* renamed from: dkfz  reason: default package */
/* loaded from: classes6.dex */
public final class dkfz extends dsqw<dkfz, dkfy> implements dssk {
    public static final dkfz c;
    private static volatile dssr<dkfz> d;
    public int a;
    public int b;

    static {
        dkfz dkfzVar = new dkfz();
        c = dkfzVar;
        dsqw.cc(dkfz.class, dkfzVar);
    }

    private dkfz() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dkfz();
            }
            if (i2 == 4) {
                return new dkfy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkfz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkfz.class) {
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
