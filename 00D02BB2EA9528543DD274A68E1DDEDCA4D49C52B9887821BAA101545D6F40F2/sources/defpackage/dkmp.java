package defpackage;
/* compiled from: PG */
/* renamed from: dkmp  reason: default package */
/* loaded from: classes.dex */
public final class dkmp extends dsqw<dkmp, dkmo> implements dssk {
    public static final dkmp a;
    private static volatile dssr<dkmp> b;

    static {
        dkmp dkmpVar = new dkmp();
        a = dkmpVar;
        dsqw.cc(dkmp.class, dkmpVar);
    }

    private dkmp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkmp();
            }
            if (i2 == 4) {
                return new dkmo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkmp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkmp.class) {
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
