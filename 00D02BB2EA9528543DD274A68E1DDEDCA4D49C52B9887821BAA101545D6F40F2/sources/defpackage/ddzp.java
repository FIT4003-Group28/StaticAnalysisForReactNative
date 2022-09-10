package defpackage;
/* compiled from: PG */
/* renamed from: ddzp  reason: default package */
/* loaded from: classes.dex */
public final class ddzp extends dsqw<ddzp, ddzh> implements dssk {
    public static final ddzp i;
    private static volatile dssr<ddzp> j;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public ddzo g;
    public ddzl h;

    static {
        ddzp ddzpVar = new ddzp();
        i = ddzpVar;
        dsqw.cc(ddzp.class, ddzpVar);
    }

    private ddzp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", drcq.c(), "d", drcs.c(), "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new ddzp();
            }
            if (i3 == 4) {
                return new ddzh();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ddzp> dssrVar = j;
            if (dssrVar == null) {
                synchronized (ddzp.class) {
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
