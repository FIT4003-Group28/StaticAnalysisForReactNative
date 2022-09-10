package defpackage;
/* compiled from: PG */
/* renamed from: ddrg  reason: default package */
/* loaded from: classes6.dex */
public final class ddrg extends dsqw<ddrg, ddrf> implements dssk {
    public static final ddrg a;
    private static volatile dssr<ddrg> b;

    static {
        ddrg ddrgVar = new ddrg();
        a = ddrgVar;
        dsqw.cc(ddrg.class, ddrgVar);
    }

    private ddrg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddrg();
            }
            if (i2 == 4) {
                return new ddrf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddrg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddrg.class) {
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
