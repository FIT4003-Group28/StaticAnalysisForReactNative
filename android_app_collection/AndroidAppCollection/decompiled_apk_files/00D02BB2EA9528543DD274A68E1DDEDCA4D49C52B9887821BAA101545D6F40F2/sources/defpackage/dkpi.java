package defpackage;
/* compiled from: PG */
/* renamed from: dkpi  reason: default package */
/* loaded from: classes.dex */
public final class dkpi extends dsqw<dkpi, dkph> implements dssk {
    public static final dkpi i;
    private static volatile dssr<dkpi> j;
    public int a;
    public int b;
    public boolean c;
    public dkpg d;
    public int e;
    public int f;
    public int g;
    public boolean h;

    static {
        dkpi dkpiVar = new dkpi();
        i = dkpiVar;
        dsqw.cc(dkpi.class, dkpiVar);
    }

    private dkpi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0001\u0002ဉ\u0002\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဇ\u0006\u0007င\u0000", new Object[]{"a", "c", "d", "e", "f", "g", "h", "b"});
            }
            if (i3 == 3) {
                return new dkpi();
            }
            if (i3 == 4) {
                return new dkph();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkpi> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dkpi.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
