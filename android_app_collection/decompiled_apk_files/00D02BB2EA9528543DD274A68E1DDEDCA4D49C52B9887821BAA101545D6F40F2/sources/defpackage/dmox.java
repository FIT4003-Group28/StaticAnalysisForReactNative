package defpackage;
/* compiled from: PG */
/* renamed from: dmox  reason: default package */
/* loaded from: classes.dex */
public final class dmox extends dsqw<dmox, dmow> implements dssk {
    public static final dmox a;
    private static volatile dssr<dmox> b;

    static {
        dmox dmoxVar = new dmox();
        a = dmoxVar;
        dsqw.cc(dmox.class, dmoxVar);
    }

    private dmox() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmox();
            }
            if (i2 == 4) {
                return new dmow();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmox> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dmox.class) {
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
