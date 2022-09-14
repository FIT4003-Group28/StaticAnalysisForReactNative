package defpackage;
/* compiled from: PG */
/* renamed from: csfe  reason: default package */
/* loaded from: classes5.dex */
public final class csfe extends dsqw<csfe, csfd> implements dssk {
    public static final csfe a;
    private static volatile dssr<csfe> b;

    static {
        csfe csfeVar = new csfe();
        a = csfeVar;
        dsqw.cc(csfe.class, csfeVar);
    }

    private csfe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new csfe();
            }
            if (i2 == 4) {
                return new csfd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csfe> dssrVar = b;
            if (dssrVar == null) {
                synchronized (csfe.class) {
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
