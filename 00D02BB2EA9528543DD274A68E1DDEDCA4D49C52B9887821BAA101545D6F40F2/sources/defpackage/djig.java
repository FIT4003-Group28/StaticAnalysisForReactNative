package defpackage;
/* compiled from: PG */
/* renamed from: djig  reason: default package */
/* loaded from: classes6.dex */
public final class djig extends dsqw<djig, djif> implements dssk {
    public static final djig g;
    private static volatile dssr<djig> i;
    public String a = "";
    public String b = "";
    public int c;
    public int d;
    public int e;
    public int f;
    private int h;

    static {
        djig djigVar = new djig();
        g = djigVar;
        dsqw.cc(djig.class, djigVar);
    }

    private djig() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new djig();
            }
            if (i3 == 4) {
                return new djif();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<djig> dssrVar = i;
            if (dssrVar == null) {
                synchronized (djig.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
