package defpackage;
/* compiled from: PG */
/* renamed from: diwx  reason: default package */
/* loaded from: classes6.dex */
public final class diwx extends dsqw<diwx, diww> implements dssk {
    public static final diwx a;
    private static volatile dssr<diwx> b;

    static {
        diwx diwxVar = new diwx();
        a = diwxVar;
        dsqw.cc(diwx.class, diwxVar);
    }

    private diwx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diwx();
            }
            if (i2 == 4) {
                return new diww();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diwx> dssrVar = b;
            if (dssrVar == null) {
                synchronized (diwx.class) {
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
