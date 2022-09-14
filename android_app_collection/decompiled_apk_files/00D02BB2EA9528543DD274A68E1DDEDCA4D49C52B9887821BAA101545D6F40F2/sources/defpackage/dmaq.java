package defpackage;
/* compiled from: PG */
/* renamed from: dmaq  reason: default package */
/* loaded from: classes6.dex */
public final class dmaq extends dsqw<dmaq, dmap> implements dssk {
    public static final dmaq a;
    private static volatile dssr<dmaq> b;

    static {
        dmaq dmaqVar = new dmaq();
        a = dmaqVar;
        dsqw.cc(dmaq.class, dmaqVar);
    }

    private dmaq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmaq();
            }
            if (i2 == 4) {
                return new dmap();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmaq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dmaq.class) {
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
