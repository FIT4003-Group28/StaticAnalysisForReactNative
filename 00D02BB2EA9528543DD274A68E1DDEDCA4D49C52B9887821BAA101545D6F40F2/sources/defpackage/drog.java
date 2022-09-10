package defpackage;
/* compiled from: PG */
/* renamed from: drog  reason: default package */
/* loaded from: classes6.dex */
public final class drog extends dsqw<drog, drof> implements dssk {
    public static final drog i;
    private static volatile dssr<drog> j;
    public int a;
    public int b;
    public double c;
    public double d;
    public float e;
    public float f;
    public float g;
    public float h;

    static {
        drog drogVar = new drog();
        i = drogVar;
        dsqw.cc(drog.class, drogVar);
    }

    private drog() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002က\u0001\u0003က\u0002\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b", new Object[]{"a", "b", droh.a, "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new drog();
            }
            if (i3 == 4) {
                return new drof();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<drog> dssrVar = j;
            if (dssrVar == null) {
                synchronized (drog.class) {
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
