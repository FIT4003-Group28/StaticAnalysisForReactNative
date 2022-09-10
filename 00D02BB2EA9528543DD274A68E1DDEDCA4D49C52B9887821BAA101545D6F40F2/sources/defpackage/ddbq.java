package defpackage;
/* compiled from: PG */
/* renamed from: ddbq  reason: default package */
/* loaded from: classes.dex */
public final class ddbq extends dsqw<ddbq, ddbo> implements dssk {
    public static final ddbq i;
    private static volatile dssr<ddbq> j;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        ddbq ddbqVar = new ddbq();
        i = ddbqVar;
        dsqw.cc(ddbq.class, ddbqVar);
    }

    private ddbq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", ddbp.a, "c", ddbp.a, "d", ddbp.a, "e", ddbp.a, "f", ddbp.a, "g", ddbp.a, "h", ddbp.a});
            }
            if (i3 == 3) {
                return new ddbq();
            }
            if (i3 == 4) {
                return new ddbo();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ddbq> dssrVar = j;
            if (dssrVar == null) {
                synchronized (ddbq.class) {
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
