package defpackage;
/* compiled from: PG */
/* renamed from: dtlb  reason: default package */
/* loaded from: classes6.dex */
public final class dtlb extends dsqw<dtlb, dtky> implements dssk {
    public static final dtlb i;
    private static volatile dssr<dtlb> j;
    public int a;
    public dtjf b;
    public dtjf c;
    public dtjf d;
    public dtqa e;
    public dtqa f;
    public int g;
    public int h;

    static {
        dtlb dtlbVar = new dtlb();
        i = dtlbVar;
        dsqw.cc(dtlb.class, dtlbVar);
    }

    private dtlb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0004\n\u0007\u0000\u0000\u0000\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဌ\u0005\nဌ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", dtkz.a, "h", dtkz.a});
            }
            if (i3 == 3) {
                return new dtlb();
            }
            if (i3 == 4) {
                return new dtky();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dtlb> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dtlb.class) {
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
