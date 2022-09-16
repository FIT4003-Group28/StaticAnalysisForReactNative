package defpackage;
/* compiled from: PG */
/* renamed from: dqxl  reason: default package */
/* loaded from: classes6.dex */
public final class dqxl extends dsqw<dqxl, dqxk> implements dssk {
    public static final dqxl a;
    private static volatile dssr<dqxl> b;

    static {
        dqxl dqxlVar = new dqxl();
        a = dqxlVar;
        dsqw.cc(dqxl.class, dqxlVar);
    }

    private dqxl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqxl();
            }
            if (i2 == 4) {
                return new dqxk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqxl> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqxl.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
