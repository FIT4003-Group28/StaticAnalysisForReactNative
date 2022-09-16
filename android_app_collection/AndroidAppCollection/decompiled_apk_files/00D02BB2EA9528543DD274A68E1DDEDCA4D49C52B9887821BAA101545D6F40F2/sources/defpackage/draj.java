package defpackage;
/* compiled from: PG */
/* renamed from: draj  reason: default package */
/* loaded from: classes6.dex */
public final class draj extends dsqw<draj, drai> implements dssk {
    public static final draj b;
    private static volatile dssr<draj> d;
    public int a;
    private int c;

    static {
        draj drajVar = new draj();
        b = drajVar;
        dsqw.cc(draj.class, drajVar);
    }

    private draj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dgfb.c()});
            }
            if (i2 == 3) {
                return new draj();
            }
            if (i2 == 4) {
                return new drai();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<draj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (draj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
