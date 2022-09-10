package defpackage;
/* compiled from: PG */
/* renamed from: dola  reason: default package */
/* loaded from: classes6.dex */
public final class dola extends dsqw<dola, dokz> implements dssk {
    public static final dola a;
    private static volatile dssr<dola> b;

    static {
        dola dolaVar = new dola();
        a = dolaVar;
        dsqw.cc(dola.class, dolaVar);
    }

    private dola() {
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
                return new dola();
            }
            if (i2 == 4) {
                return new dokz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dola> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dola.class) {
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
