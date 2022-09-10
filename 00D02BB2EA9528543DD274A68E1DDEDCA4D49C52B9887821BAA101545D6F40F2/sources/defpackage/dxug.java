package defpackage;
/* compiled from: PG */
/* renamed from: dxug  reason: default package */
/* loaded from: classes6.dex */
public final class dxug extends dsqw<dxug, dxuf> implements dssk {
    public static final dxug a;
    private static volatile dssr<dxug> b;

    static {
        dxug dxugVar = new dxug();
        a = dxugVar;
        dsqw.cc(dxug.class, dxugVar);
    }

    private dxug() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxug();
            }
            if (i2 == 4) {
                return new dxuf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxug> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxug.class) {
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
