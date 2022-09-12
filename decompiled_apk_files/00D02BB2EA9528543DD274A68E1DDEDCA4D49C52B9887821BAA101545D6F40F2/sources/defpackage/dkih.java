package defpackage;
/* compiled from: PG */
/* renamed from: dkih  reason: default package */
/* loaded from: classes.dex */
public final class dkih extends dsqw<dkih, dkie> implements dssk {
    public static final dkih h;
    private static volatile dssr<dkih> j;
    public boolean a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public dkig g;
    private int i;

    static {
        dkih dkihVar = new dkih();
        h = dkihVar;
        dsqw.cc(dkih.class, dkihVar);
    }

    private dkih() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0005ဇ\u0004\u0007ဇ\u0007\bဇ\b\tဇ\t\nဉ\n", new Object[]{"i", "a", "b", "c", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new dkih();
            }
            if (i2 == 4) {
                return new dkie();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkih> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dkih.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
