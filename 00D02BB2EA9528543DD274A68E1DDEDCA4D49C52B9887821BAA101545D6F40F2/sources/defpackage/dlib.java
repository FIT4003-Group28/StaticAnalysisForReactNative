package defpackage;
/* compiled from: PG */
/* renamed from: dlib  reason: default package */
/* loaded from: classes6.dex */
public final class dlib extends dsqw<dlib, dlia> implements dssk {
    public static final dlib a;
    private static volatile dssr<dlib> b;

    static {
        dlib dlibVar = new dlib();
        a = dlibVar;
        dsqw.cc(dlib.class, dlibVar);
    }

    private dlib() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlib();
            }
            if (i2 == 4) {
                return new dlia();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlib> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlib.class) {
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
