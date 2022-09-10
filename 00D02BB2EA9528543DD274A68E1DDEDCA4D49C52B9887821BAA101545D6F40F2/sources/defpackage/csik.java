package defpackage;
/* compiled from: PG */
/* renamed from: csik  reason: default package */
/* loaded from: classes5.dex */
public final class csik extends dsqw<csik, csij> implements dssk {
    public static final csik b;
    private static volatile dssr<csik> d;
    public int a;
    private int c;

    static {
        csik csikVar = new csik();
        b = csikVar;
        dsqw.cc(csik.class, csikVar);
    }

    private csik() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dead.c()});
            }
            if (i2 == 3) {
                return new csik();
            }
            if (i2 == 4) {
                return new csij();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csik> dssrVar = d;
            if (dssrVar == null) {
                synchronized (csik.class) {
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
