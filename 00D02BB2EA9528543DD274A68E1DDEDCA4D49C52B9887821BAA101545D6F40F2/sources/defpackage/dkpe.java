package defpackage;
/* compiled from: PG */
/* renamed from: dkpe  reason: default package */
/* loaded from: classes.dex */
public final class dkpe extends dsqw<dkpe, dkpd> implements dssk {
    public static final dkpe f;
    private static volatile dssr<dkpe> h;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    private int g;

    static {
        dkpe dkpeVar = new dkpe();
        f = dkpeVar;
        dsqw.cc(dkpe.class, dkpeVar);
    }

    private dkpe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002\u0005ဇ\u0004\u0007ဇ\u0006\bဇ\u0007", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dkpe();
            }
            if (i2 == 4) {
                return new dkpd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkpe> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dkpe.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
