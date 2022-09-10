package defpackage;
/* compiled from: PG */
/* renamed from: dkid  reason: default package */
/* loaded from: classes.dex */
public final class dkid extends dsqw<dkid, dkhw> implements dssk {
    public static final dkid g;
    private static volatile dssr<dkid> h;
    public int a;
    public dkic b;
    public int c;
    public boolean d;
    public int e;
    public int f;

    static {
        dkid dkidVar = new dkid();
        g = dkidVar;
        dsqw.cc(dkid.class, dkidVar);
    }

    private dkid() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဇ\u0004\u0006ဌ\u0007\u0007ဌ\u0003\bဌ\u0005", new Object[]{"a", "b", "d", "f", dkhx.a, "c", dkhx.a, "e", dkhx.a});
            }
            if (i2 == 3) {
                return new dkid();
            }
            if (i2 == 4) {
                return new dkhw();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkid> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dkid.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
