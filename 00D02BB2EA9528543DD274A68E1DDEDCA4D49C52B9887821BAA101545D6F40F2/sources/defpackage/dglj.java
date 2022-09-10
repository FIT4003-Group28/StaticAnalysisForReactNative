package defpackage;
/* compiled from: PG */
/* renamed from: dglj  reason: default package */
/* loaded from: classes6.dex */
public final class dglj extends dsqw<dglj, dgli> implements dssk {
    public static final dglj a;
    private static volatile dssr<dglj> b;

    static {
        dglj dgljVar = new dglj();
        a = dgljVar;
        dsqw.cc(dglj.class, dgljVar);
    }

    private dglj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dglj();
            }
            if (i2 == 4) {
                return new dgli();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dglj> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dglj.class) {
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
