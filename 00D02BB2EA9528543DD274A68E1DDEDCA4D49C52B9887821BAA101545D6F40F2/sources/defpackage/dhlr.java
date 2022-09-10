package defpackage;
/* compiled from: PG */
/* renamed from: dhlr  reason: default package */
/* loaded from: classes6.dex */
public final class dhlr extends dsqw<dhlr, dhlq> implements dssk {
    public static final dhlr a;
    private static volatile dssr<dhlr> b;

    static {
        dhlr dhlrVar = new dhlr();
        a = dhlrVar;
        dsqw.cc(dhlr.class, dhlrVar);
    }

    private dhlr() {
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
                return new dhlr();
            }
            if (i2 == 4) {
                return new dhlq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhlr> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhlr.class) {
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
