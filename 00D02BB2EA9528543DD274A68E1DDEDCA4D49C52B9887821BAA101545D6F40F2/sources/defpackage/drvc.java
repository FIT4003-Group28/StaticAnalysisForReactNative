package defpackage;
/* compiled from: PG */
/* renamed from: drvc  reason: default package */
/* loaded from: classes6.dex */
public final class drvc extends dsqw<drvc, druz> implements dssk {
    public static final drvc i;
    private static volatile dssr<drvc> j;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;

    static {
        drvc drvcVar = new drvc();
        i = drvcVar;
        dsqw.cc(drvc.class, drvcVar);
    }

    private drvc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", drvb.c()});
            }
            if (i3 == 3) {
                return new drvc();
            }
            if (i3 == 4) {
                return new druz();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<drvc> dssrVar = j;
            if (dssrVar == null) {
                synchronized (drvc.class) {
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
