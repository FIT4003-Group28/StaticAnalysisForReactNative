package defpackage;
/* compiled from: PG */
/* renamed from: djoi  reason: default package */
/* loaded from: classes6.dex */
public final class djoi extends dsqw<djoi, djoh> implements dssk {
    public static final djoi a;
    private static volatile dssr<djoi> b;

    static {
        djoi djoiVar = new djoi();
        a = djoiVar;
        dsqw.cc(djoi.class, djoiVar);
    }

    private djoi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djoi();
            }
            if (i2 == 4) {
                return new djoh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djoi> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djoi.class) {
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
