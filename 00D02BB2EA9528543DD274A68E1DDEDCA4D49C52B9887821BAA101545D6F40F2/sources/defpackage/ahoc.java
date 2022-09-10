package defpackage;
/* compiled from: PG */
/* renamed from: ahoc  reason: default package */
/* loaded from: classes2.dex */
public final class ahoc extends dsqw<ahoc, ahob> implements dssk {
    public static final ahoc a;
    private static volatile dssr<ahoc> b;

    static {
        ahoc ahocVar = new ahoc();
        a = ahocVar;
        dsqw.cc(ahoc.class, ahocVar);
    }

    private ahoc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ahoc();
            }
            if (i2 == 4) {
                return new ahob();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ahoc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ahoc.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
