package defpackage;
/* compiled from: PG */
/* renamed from: ddxk  reason: default package */
/* loaded from: classes6.dex */
public final class ddxk extends dsqw<ddxk, ddxj> implements dssk {
    public static final ddxk a;
    private static volatile dssr<ddxk> b;

    static {
        ddxk ddxkVar = new ddxk();
        a = ddxkVar;
        dsqw.cc(ddxk.class, ddxkVar);
    }

    private ddxk() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddxk();
            }
            if (i2 == 4) {
                return new ddxj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddxk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddxk.class) {
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
