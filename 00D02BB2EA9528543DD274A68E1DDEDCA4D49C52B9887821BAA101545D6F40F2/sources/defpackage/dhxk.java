package defpackage;
/* compiled from: PG */
/* renamed from: dhxk  reason: default package */
/* loaded from: classes6.dex */
public final class dhxk extends dsqw<dhxk, dhxj> implements dssk {
    public static final dhxk a;
    private static volatile dssr<dhxk> b;

    static {
        dhxk dhxkVar = new dhxk();
        a = dhxkVar;
        dsqw.cc(dhxk.class, dhxkVar);
    }

    private dhxk() {
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
                return new dhxk();
            }
            if (i2 == 4) {
                return new dhxj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhxk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhxk.class) {
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
