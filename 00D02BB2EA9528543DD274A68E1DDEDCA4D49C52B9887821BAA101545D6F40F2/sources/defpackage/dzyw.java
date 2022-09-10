package defpackage;
/* compiled from: PG */
/* renamed from: dzyw  reason: default package */
/* loaded from: classes6.dex */
public final class dzyw extends dsqw<dzyw, dzyv> implements dssk {
    public static final dzyw i;
    private static volatile dssr<dzyw> j;
    public int a;
    public dspd b = dspd.b;
    public dzyy c;
    public double d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        dzyw dzywVar = new dzyw();
        i = dzywVar;
        dsqw.cc(dzyw.class, dzywVar);
    }

    private dzyw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003က\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dzyw();
            }
            if (i3 == 4) {
                return new dzyv();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dzyw> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dzyw.class) {
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
