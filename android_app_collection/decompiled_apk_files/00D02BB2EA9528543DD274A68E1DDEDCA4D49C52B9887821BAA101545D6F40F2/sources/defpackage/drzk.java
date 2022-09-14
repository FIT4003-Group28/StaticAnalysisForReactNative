package defpackage;
/* compiled from: PG */
/* renamed from: drzk  reason: default package */
/* loaded from: classes6.dex */
public final class drzk extends dsqw<drzk, drzj> implements dssk {
    public static final drzk a;
    private static volatile dssr<drzk> b;

    static {
        drzk drzkVar = new drzk();
        a = drzkVar;
        dsqw.cc(drzk.class, drzkVar);
    }

    private drzk() {
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
                return new drzk();
            }
            if (i2 == 4) {
                return new drzj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drzk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drzk.class) {
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
